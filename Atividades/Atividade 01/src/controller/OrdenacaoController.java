package controller;

import java.util.ArrayList;
import java.util.List;

import model.Ordenacao;
import model.ResultadoOrdenacao;
import model.Utilidades;
import view.OrdenacaoView;

public class OrdenacaoController {

    private OrdenacaoView view;

    public OrdenacaoController() {

        view = new OrdenacaoView();
    }

    public void executar() {

        int quantidade = view.solicitarQuantidade();
        int inicio = view.solicitarInicio();
        int fim = view.solicitarFim();

        List<Integer> listaOriginal = new ArrayList<>();

        Utilidades.popularLista(
                listaOriginal,
                quantidade,
                inicio,
                fim
        );

        view.mostrarListaOriginal(listaOriginal);

        // Cria uma cópia para cada algoritmo
        List<Integer> listaBolha =
                new ArrayList<>(listaOriginal);

        List<Integer> listaSelecao =
                new ArrayList<>(listaOriginal);

        List<Integer> listaInsercao =
                new ArrayList<>(listaOriginal);

        List<Integer> listaAgitacao =
                new ArrayList<>(listaOriginal);


        ResultadoOrdenacao resultadoBolha =
                Ordenacao.bolha(listaBolha);

        ResultadoOrdenacao resultadoSelecao =
                Ordenacao.selecao(listaSelecao);

        ResultadoOrdenacao resultadoInsercao =
                Ordenacao.insercao(listaInsercao);

        ResultadoOrdenacao resultadoAgitacao =
                Ordenacao.agitacao(listaAgitacao);


        view.mostrarResultado(resultadoBolha);

        view.mostrarResultado(resultadoSelecao);

        view.mostrarResultado(resultadoInsercao);

        view.mostrarResultado(resultadoAgitacao);
    }
}
