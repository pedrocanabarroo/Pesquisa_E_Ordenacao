package model;

import java.util.List;

public class ResultadoOrdenacao {

    private String algoritmo;
    private List<Integer> lista;
    private long comparacoes;
    private long trocas;
    private long tempoExecucao;

    public ResultadoOrdenacao(
            String algoritmo,
            List<Integer> lista,
            long comparacoes,
            long trocas,
            long tempoExecucao) {

        this.algoritmo = algoritmo;
        this.lista = lista;
        this.comparacoes = comparacoes;
        this.trocas = trocas;
        this.tempoExecucao = tempoExecucao;
    }

    public String getAlgoritmo() {
        return algoritmo;
    }

    public List<Integer> getLista() {
        return lista;
    }

    public long getComparacoes() {
        return comparacoes;
    }

    public long getTrocas() {
        return trocas;
    }

    public long getTempoExecucao() {
        return tempoExecucao;
    }
}
