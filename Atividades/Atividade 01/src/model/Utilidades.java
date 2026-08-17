package model;

import java.util.List;
import java.util.Random;

public class Utilidades {

    public static void popularLista(
            List<Integer> lista,
            int quantidade,
            int inicio,
            int fim) {

        Random gerador = new Random();

        for (int i = 0; i < quantidade; i++) {

            int numero = gerador.nextInt(fim - inicio + 1) + inicio;

            lista.add(numero);
        }
    }
}
