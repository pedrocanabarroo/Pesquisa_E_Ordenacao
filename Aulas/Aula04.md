# Exemplo de Medição de Tempo em Java com MVC

Este projeto demonstra como preencher duas listas de números inteiros e medir o tempo necessário para executar cada operação.

O programa cria:

* Uma lista com `100.000` números aleatórios;
* Uma lista com `100.000` números sequenciais;
* Uma medição de tempo para cada rotina;
* Uma organização baseada no padrão arquitetural MVC.

## Padrão MVC

O projeto foi separado em três partes principais:

* **Model:** responsável pelos dados e pela criação das listas;
* **View:** responsável por exibir informações no terminal;
* **Controller:** responsável por controlar a execução e conectar o Model à View.

Além disso, existe uma classe principal responsável por iniciar o programa.

## Estrutura do projeto

```text
src/
├── controller/
│   └── ListaController.java
├── model/
│   └── ListaModel.java
├── view/
│   └── ListaView.java
└── ExemploMedicaoTempo.java
```

---

## Model

Arquivo:

```text
src/model/ListaModel.java
```

A classe `ListaModel` é responsável por armazenar as listas e preencher seus valores.

```java
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * A classe Model é responsável pelos dados do programa
 * e pelas operações realizadas com esses dados.
 */
public class ListaModel {

    // Lista que armazenará os números aleatórios.
    private List<Integer> listaAleatoria;

    // Lista que armazenará os números sequenciais.
    private List<Integer> listaSequencial;

    /*
     * Construtor da classe.
     *
     * Quando um objeto ListaModel é criado, as duas listas
     * também são criadas vazias.
     */
    public ListaModel() {
        listaAleatoria = new ArrayList<>();
        listaSequencial = new ArrayList<>();
    }

    /*
     * Preenche uma lista com números aleatórios ou sequenciais.
     *
     * lista: lista que será preenchida.
     * quantidadeNumeros: quantidade de números que serão adicionados.
     * inicio: valor inicial da faixa.
     * fim: valor final da faixa.
     * aleatorio: define o tipo de preenchimento.
     *
     * Se aleatorio for true, adiciona números aleatórios.
     * Se aleatorio for false, adiciona números sequenciais.
     */
    public void popularLista(
            List<Integer> lista,
            long quantidadeNumeros,
            int inicio,
            int fim,
            boolean aleatorio) {

        // Cria um objeto responsável por gerar números aleatórios.
        Random gerador = new Random();

        // Verifica se a lista deve receber números aleatórios.
        if (aleatorio) {

            // Repete até atingir a quantidade informada.
            for (long i = 0; i < quantidadeNumeros; i++) {

                /*
                 * Gera um número entre o valor inicial e o valor final.
                 * O valor final não é incluído.
                 */
                lista.add(gerador.nextInt(inicio, fim));
            }

        } else {

            /*
             * Quando aleatorio for false, adiciona números
             * sequenciais começando pelo valor informado em inicio.
             */
            for (long i = 0; i < quantidadeNumeros; i++) {
                lista.add(inicio + (int) i);
            }
        }
    }

    /*
     * Retorna a lista de números aleatórios.
     *
     * Esse método permite que outras classes acessem a lista,
     * pois o atributo listaAleatoria é privado.
     */
    public List<Integer> getListaAleatoria() {
        return listaAleatoria;
    }

    /*
     * Retorna a lista de números sequenciais.
     *
     * Esse método permite que outras classes acessem a lista,
     * pois o atributo listaSequencial é privado.
     */
    public List<Integer> getListaSequencial() {
        return listaSequencial;
    }
}
```

---

## View

Arquivo:

```text
src/view/ListaView.java
```

A classe `ListaView` é responsável por exibir os resultados no terminal.

```java
package view;

import java.util.List;

/*
 * A classe View é responsável por mostrar informações
 * para o usuário no terminal.
 */
public class ListaView {

    /*
     * Exibe o tempo gasto para executar uma rotina.
     *
     * rotina: nome da rotina executada.
     * tempo: tempo de execução em milissegundos.
     */
    public void exibirTempo(String rotina, long tempo) {
        System.out.println("Tempo (ms) " + rotina + ": " + tempo);
    }

    /*
     * Exibe todos os números armazenados em uma lista.
     *
     * lista: lista que será exibida.
     * frase: mensagem mostrada antes dos números.
     */
    public void exibirLista(List<Integer> lista, String frase) {

        // Mostra a frase recebida por parâmetro.
        System.out.println(frase);

        // Percorre todos os elementos da lista.
        for (Integer item : lista) {

            // Exibe o elemento atual.
            System.out.println(item);
        }

        // Mostra uma linha para separar as informações.
        System.out.println("--------------------------");

        // Mostra a quantidade de elementos da lista.
        System.out.println("Total de registros: " + lista.size());
    }
}
```

---

## Controller

Arquivo:

```text
src/controller/ListaController.java
```

A classe `ListaController` controla as operações, mede o tempo e envia os resultados para a View.

```java
package controller;

import model.ListaModel;
import view.ListaView;

/*
 * A classe Controller controla a execução do programa.
 *
 * Ela faz a ligação entre o Model, que manipula os dados,
 * e a View, que exibe os resultados.
 */
public class ListaController {

    // Referência para o Model.
    private ListaModel model;

    // Referência para a View.
    private ListaView view;

    /*
     * Construtor do Controller.
     *
     * Recebe os objetos Model e View que serão utilizados
     * durante a execução do programa.
     */
    public ListaController(ListaModel model, ListaView view) {
        this.model = model;
        this.view = view;
    }

    /*
     * Inicia as rotinas do programa.
     *
     * Primeiro executa a criação da lista aleatória
     * e depois executa a criação da lista sequencial.
     */
    public void executar() {
        popularListaAleatoria();
        popularListaSequencial();
    }

    /*
     * Preenche a lista com 100.000 números aleatórios
     * e mede o tempo necessário para realizar essa operação.
     */
    private void popularListaAleatoria() {

        /*
         * Armazena o momento exato em que a rotina começa.
         * O tempo é armazenado em nanossegundos.
         */
        long tempoInicio = System.nanoTime();

        /*
         * Solicita ao Model que preencha a lista.
         *
         * Quantidade: 100.000 números.
         * Faixa: de 100 até 99.999.
         * true: indica que os números serão aleatórios.
         */
        model.popularLista(
                model.getListaAleatoria(),
                100000,
                100,
                100000,
                true
        );

        // Armazena o momento exato em que a rotina terminou.
        long tempoFim = System.nanoTime();

        /*
         * Calcula o tempo total da rotina.
         *
         * A diferença é dividida por 1.000.000 para transformar
         * nanossegundos em milissegundos.
         */
        long tempoTotal = (tempoFim - tempoInicio) / 1_000_000;

        // Envia o resultado para a View mostrar no terminal.
        view.exibirTempo("rotina 1", tempoTotal);

        /*
         * Retire as barras abaixo para mostrar todos os números.
         *
         * Não é recomendado exibir a lista durante a medição,
         * pois imprimir 100.000 números também consome tempo.
         */
        // view.exibirLista(
        //         model.getListaAleatoria(),
        //         "Lista aleatória"
        // );
    }

    /*
     * Preenche a lista com 100.000 números sequenciais
     * e mede o tempo necessário para realizar essa operação.
     */
    private void popularListaSequencial() {

        // Armazena o momento em que a rotina começa.
        long tempoInicio = System.nanoTime();

        /*
         * Solicita ao Model que preencha a lista.
         *
         * Quantidade: 100.000 números.
         * Início: número 1.
         * false: indica que os números serão sequenciais.
         *
         * A lista será preenchida de 1 até 100.000.
         */
        model.popularLista(
                model.getListaSequencial(),
                100000,
                1,
                100000,
                false
        );

        // Armazena o momento em que a rotina terminou.
        long tempoFim = System.nanoTime();

        // Converte o tempo de nanossegundos para milissegundos.
        long tempoTotal = (tempoFim - tempoInicio) / 1_000_000;

        // Envia o resultado para a View mostrar no terminal.
        view.exibirTempo("rotina 2", tempoTotal);

        /*
         * Retire as barras abaixo para mostrar todos os números.
         */
        // view.exibirLista(
        //         model.getListaSequencial(),
        //         "Lista sequencial"
        // );
    }
}
```

---

## Classe principal

Arquivo:

```text
src/ExemploMedicaoTempo.java
```

A classe `ExemploMedicaoTempo` possui o método `main`, responsável por iniciar o programa.

```java
import controller.ListaController;
import model.ListaModel;
import view.ListaView;

/*
 * Classe principal do programa.
 *
 * Ela possui o método main, que é o ponto inicial
 * da execução de um programa Java.
 */
public class ExemploMedicaoTempo {

    /*
     * Método principal do programa.
     *
     * Cria os objetos do Model, da View e do Controller.
     * Depois solicita ao Controller que execute as rotinas.
     */
    public static void main(String[] args) {

        /*
         * Cria o Model, responsável pelas listas
         * e pelo preenchimento dos números.
         */
        ListaModel model = new ListaModel();

        /*
         * Cria a View, responsável por mostrar
         * os resultados no terminal.
         */
        ListaView view = new ListaView();

        /*
         * Cria o Controller e passa o Model e a View
         * para que ele possa controlar os dois.
         */
        ListaController controller = new ListaController(model, view);

        // Inicia a execução das rotinas.
        controller.executar();
    }
}
```
