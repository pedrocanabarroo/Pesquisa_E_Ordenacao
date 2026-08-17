package view;

import java.util.List;
import java.util.Scanner;

import model.ResultadoOrdenacao;

public class OrdenacaoView {

    private Scanner scanner;

    public OrdenacaoView() {
        scanner = new Scanner(System.in);
    }

    public int solicitarQuantidade() {

        System.out.print("Quantidade de números: ");

        return scanner.nextInt();
    }

    public int solicitarInicio() {

        System.out.print("Menor número da faixa: ");

        return scanner.nextInt();
    }

    public int solicitarFim() {

        System.out.print("Maior número da faixa: ");

        return scanner.nextInt();
    }

    public void mostrarListaOriginal(List<Integer> lista) {

        System.out.println();
        System.out.println("Lista original:");
        System.out.println(lista);
    }

    public void mostrarResultado(ResultadoOrdenacao resultado) {

        System.out.println();
        System.out.println("-----------------------------------");

        System.out.println("Algoritmo: "
                + resultado.getAlgoritmo());

        System.out.println("Comparações: "
                + resultado.getComparacoes());

        System.out.println("Trocas: "
                + resultado.getTrocas());

        System.out.println("Tempo: "
                + resultado.getTempoExecucao()
                + " ns");

        System.out.println("Lista ordenada:");
        System.out.println(resultado.getLista());

        System.out.println("-----------------------------------");
    }
}
