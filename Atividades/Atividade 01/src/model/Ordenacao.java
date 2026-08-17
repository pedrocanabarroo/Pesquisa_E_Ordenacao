package model;

import java.util.Collections;
import java.util.List;

public class Ordenacao {

    // Bubble Sort
    public static ResultadoOrdenacao bolha(List<Integer> lista) {

        long comparacoes = 0;
        long trocas = 0;

        long inicio = System.nanoTime();

        for (int i = 0; i < lista.size() - 1; i++) {

            boolean houveTroca = false;

            for (int j = 0; j < lista.size() - 1 - i; j++) {

                comparacoes++;

                if (lista.get(j) > lista.get(j + 1)) {

                    Collections.swap(lista, j, j + 1);

                    trocas++;
                    houveTroca = true;
                }
            }

            // Se nenhuma troca aconteceu,
            // significa que a lista já está ordenada
            if (!houveTroca) {
                break;
            }
        }

        long fim = System.nanoTime();

        return new ResultadoOrdenacao(
                "Bubble Sort",
                lista,
                comparacoes,
                trocas,
                fim - inicio
        );
    }


    // Selection Sort
    public static ResultadoOrdenacao selecao(List<Integer> lista) {

        long comparacoes = 0;
        long trocas = 0;

        long inicio = System.nanoTime();

        for (int i = 0; i < lista.size() - 1; i++) {

            int menor = i;

            for (int j = i + 1; j < lista.size(); j++) {

                comparacoes++;

                if (lista.get(j) < lista.get(menor)) {
                    menor = j;
                }
            }

            if (menor != i) {

                Collections.swap(lista, i, menor);

                trocas++;
            }
        }

        long fim = System.nanoTime();

        return new ResultadoOrdenacao(
                "Selection Sort",
                lista,
                comparacoes,
                trocas,
                fim - inicio
        );
    }


    // Insertion Sort
    public static ResultadoOrdenacao insercao(List<Integer> lista) {

        long comparacoes = 0;
        long trocas = 0;

        long inicio = System.nanoTime();

        for (int i = 1; i < lista.size(); i++) {

            int j = i;

            while (j > 0) {

                comparacoes++;

                if (lista.get(j) < lista.get(j - 1)) {

                    Collections.swap(lista, j, j - 1);

                    trocas++;

                    j--;

                } else {
                    break;
                }
            }
        }

        long fim = System.nanoTime();

        return new ResultadoOrdenacao(
                "Insertion Sort",
                lista,
                comparacoes,
                trocas,
                fim - inicio
        );
    }


    // Cocktail Sort / Shaker Sort / Agitação
    public static ResultadoOrdenacao agitacao(List<Integer> lista) {

        long comparacoes = 0;
        long trocas = 0;

        int inicioLista = 0;
        int fimLista = lista.size() - 1;

        boolean houveTroca = true;

        long inicio = System.nanoTime();

        while (houveTroca) {

            houveTroca = false;

            // Percorre da esquerda para direita
            for (int i = inicioLista; i < fimLista; i++) {

                comparacoes++;

                if (lista.get(i) > lista.get(i + 1)) {

                    Collections.swap(lista, i, i + 1);

                    trocas++;
                    houveTroca = true;
                }
            }

            if (!houveTroca) {
                break;
            }

            houveTroca = false;

            fimLista--;

            // Percorre da direita para esquerda
            for (int i = fimLista; i > inicioLista; i--) {

                comparacoes++;

                if (lista.get(i) < lista.get(i - 1)) {

                    Collections.swap(lista, i, i - 1);

                    trocas++;
                    houveTroca = true;
                }
            }

            inicioLista++;
        }

        long fim = System.nanoTime();

        return new ResultadoOrdenacao(
                "Cocktail Sort",
                lista,
                comparacoes,
                trocas,
                fim - inicio
        );
    }
}
