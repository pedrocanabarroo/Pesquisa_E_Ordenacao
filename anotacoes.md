# Caderno Completo de Aulas — Pesquisa e Ordenação

## Sumário

---

## Aula 01 — 27/07/2026

### Composição das Notas

- **Participação efetiva:** 20%
- **Desafios, trabalhos e avaliações:** 60%
- **GitHub (anotações em `notas_de_aula.md` e códigos):** 20%

A pesquisa contém **4 algoritmos de ordenação**, enquanto o conteúdo programático de Ordenação aborda **14 algoritmos**.

### Complexidade

O termo **complexidade** na computação está atrelado ao **esforço computacional** demandado para executar determinado algoritmo.

> **Observação:** Quanto maior for o esforço computacional despendido pelo algoritmo, menor será sua eficiência.

### Algoritmos de Ordenação (Visão Geral)

- **Sort:** Significa ordenar.
- **Bubble Sort (Ordenação por Bolha):** Algoritmo simples de implementar, porém possui alta complexidade ($O(n^2)$).
- **Selection Sort (Ordenação por Seleção):** Realiza a seleção dos menores ou maiores elementos para organizar a lista.
- **Insertion Sort (Ordenação por Inserção):** Organiza os elementos inserindo cada item iterativamente em sua posição correta.
- **Cocktail Sort / Shake Sort (Agitação):** Variação bidirecional do Bubble Sort.
- **Comb Sort (Ordenação por Pente):** Melhora o Bubble Sort utilizando comparações com maiores distâncias entre os elementos, reduzindo a complexidade média.
- **Shell Sort:** Utiliza uma sequência decrescente de intervalos (*gaps*) para realizar a ordenação de forma mais eficiente.
- **Radix Sort:** Algoritmo que realiza a ordenação processando os elementos dígito a dígito.
- **Bucket Sort:** Distribui os elementos em grupos (baldes/*buckets*) para facilitar a ordenação.
- **Merge Sort:** Algoritmo recursivo baseado na técnica de divisão e conquista, possui baixa complexidade ($O(n \log n)$).
- **Quick Sort:** Algoritmo eficiente baseado na escolha de um pivô para particionar e dividir os elementos.

---

## Aula 02 — 30/07/2026

### Plano de Ensino

- Ordenação: conceitos e algoritmos.
- Pesquisa: conceitos e algoritmos.
- Tabelas Hash: conceitos e algoritmos.
- Balanceamento em Árvores: conceitos e algoritmos.
- Árvores Binárias: conceitos e algoritmos.

### Conceitos Iniciais

- **Ordenar:** Organizar uma estrutura (lista ou vetor) a partir de um ou mais índices/chaves.
  - *Por que ordenar?* Para otimizar a busca ou pesquisa.
- **Pesquisar (Search/Find):** Localizar ou buscar um dado dentro de uma estrutura via alguma chave.
- **Recuperar (Retrieve):** Localizar ou buscar dados com relevância (semântica ou significado).
- **Complexidade de um Algoritmo:** É o esforço computacional despendido, ou seja, quanto de recurso (tempo e memória) ele aloca para realizar sua(s) tarefa(s).
  - *Alta complexidade:* Mais esforço.
  - *Baixa complexidade:* Menos esforço.
- **Estabilidade:** Preservação da ordem relativa de elementos com chaves equivalentes. Exemplo: o `Bubble Sort` é estável; o `Comb Sort` é instável.

### Notação Big-O (Ordem de Crescimento)

1. $O(n!)$ — Fatorial *(maior complexidade)*
2. $O(n^x)$ — Exponencial / Polinomial
3. $O(n \log n + n)$
4. $O(n)$ — Linear
5. $O(\log n)$ — Logarítmico *(baixa complexidade)*
6. $O(1)$ — Constante

### CRUD

- **C**reate
- **R**etrieve (localizar ou buscar com relevância)
- **U**pdate
- **D**elete

### Como Medir a Complexidade

- **Na Ordenação:**
  - Quantidade de comparações
  - Quantidade de trocas
- **Na Pesquisa:**
  - Somente a quantidade de comparações

---

## Aula 03 — 03/08/2026

### Projeto Arquitetural (MVC)

Padrão de arquitetura que divide o sistema em três camadas:
- **Model**
- **View**
- **Controller**

> **Observação:** Os códigos desenvolvidos nesta disciplina devem adotar o padrão da arquitetura MVC. Ao começar a construir, inicie sempre pelo **Model**.
>
> Exemplo de referência: [Exemplo Java MVC — Prof. Alexandre Zamberlan](https://github.com/alexandrezamberlan/estruturasDeDados/tree/master/00%20-%20anosAnteriores/exemploJava_usoLista_MVC)

### Atividade 1 — Métodos de Ordenação

| Algoritmo | Memória | Estabilidade | Complexidade | Porção Ordenada / Detalhes |
| :--- | :--- | :--- | :--- | :--- |
| **Bolha (Bubble Sort)** | Interna (RAM) | Estável | $O(n^2)$ | Final (o maior valor em cada passada sobe até o final). Usa 2 repetições: `while` externo e `for` interno. |
| **Seleção (Selection Sort)** | Interna (RAM) | Instável | $O(n^2)$ | Início (a cada célula, laça/seleciona o menor valor restante). Usa 2 repetições `for` com variável `posicaoMenor`. |
| **Inserção (Insertion Sort)** | Interna (RAM) | Estável | $O(n^2)$ | Início (cada item à direita é inserido na posição correta da porção à esquerda). |
| **Pente (Comb Sort)** | Interna | Instável | $O(n^2)$ pior caso | Final (comparações a distância). |
| **Agitação (Cocktail/Shake)** | Interna | Estável | $O(n^2)$ | Início e final alternadamente. |
| **Shell Sort** | Interna | Instável | $O(n^2)$ pior caso | Por intervalos (*gaps*). |
| **Bucket Sort** | Interna | Estável | $O(n + k)$ caso médio | Baldes (*buckets*). |
| **Radix Sort** | Interna | Estável | $O(d \cdot (n + k))$ | Por dígitos. |
| **Heap Sort** | Interna | Instável | $O(n \log n)$ | Final (baseado em heap binário). |
| **Merge Sort** | Externa/Auxiliar | Estável | $O(n \log n)$ | Subvetores divididos recursivamente. |
| **Quick Sort** | Interna | Instável | $O(n \log n)$ médio / $O(n^2)$ pior | Em torno do elemento pivô. |

### Atividade 2 — Exercício Prático

- **Método:** Recebe uma lista e retorna `true` se estiver ordenada, ou `false` caso contrário.


### Comentários Gerais

- **Eficiente versus Eficaz:**
  - Ambos atingem os objetivos planejados.
  - O aspecto eficaz está diretamente associado ao tempo e recursos consumidos.
- **Qual o melhor algoritmo de ordenação?** Depende:
  - Do volume de dados (tamanho da estrutura).
  - Do nível de pré-ordenação dos dados.
- **Cenários de Pior Caso:**
  - *Bubble Sort:* Lista ordenada de forma decrescente quando se deseja ordenar crescente.
  - *Selection Sort:* Lista previamente ordenada (realiza todas as comparações desnecessariamente).
  - *Insertion Sort:* Lista ordenada de forma decrescente para ordenar crescente.

---

## Aula 04 — 06/08/2026

### Premissas da Disciplina

- **Padrão de Desenvolvimento:** Padrão MVC e documentação rigorosa.
- **Benchmark:**
  - Medições de **Complexidade:** quantidade de comparações e quantidade de trocas.
  - Medição de **Tempo:** tempo decorrido de execução.

### Exemplos de Medição de Tempo

#### Java
```java
long tempoInicio, tempoFim;  

tempoInicio = System.nanoTime();
// rotina 1
tempoFim = System.nanoTime();
System.out.println("Tempo (ms) rotina 1: " + (tempoFim - tempoInicio) / 1000000.0);

tempoInicio = System.nanoTime();
// rotina 2
tempoFim = System.nanoTime();
System.out.println("Tempo (ms) rotina 2: " + (tempoFim - tempoInicio) / 1000000.0);
```

#### C#
```csharp
Stopwatch sw = new Stopwatch();

sw.Start();
// rotina 1
sw.Stop();
Console.WriteLine("Fim da rotina 1 (ms): " + sw.ElapsedMilliseconds);
sw.Reset();

sw.Start();
// rotina 2
sw.Stop();
Console.WriteLine("Fim da rotina 2 (ms): " + sw.ElapsedMilliseconds);
sw.Reset();
```

#### Python
```python
import time

tempoInicio = time.time()
# rotina 1
tempoFim = time.time()
print("Tempo da rotina 1: ", (tempoFim - tempoInicio), "s")
```

#### C++
```cpp
#include <ctime>
#include <iostream>

clock_t tempoInicio, tempoFim;
tempoInicio = clock();
// rotina 1
tempoFim = clock();
std::cout << "Tempo para rotina 1: " << (float)(tempoFim - tempoInicio) / CLOCKS_PER_SEC << std::endl;
```

---

## Aula 05 — 10/08/2026

Retomada das implementações dos algoritmos da Aula 03.
Referência: [Resumo dos Métodos — Prof. Alexandre Zamberlan](https://github.com/alexandrezamberlan/pesquisa_ordenacao/blob/master/03-ordenacao/resumo.txt).

### 1. Bubble Sort (Bolha)

Trabalha com o conceito de trocas sucessivas adjacentes; enquanto houver trocas na varredura, o laço continua. Leva os maiores elementos para o final.

> **Observação:** Se a estrutura estiver previamente ordenada ou quase ordenada, o Bubble Sort possui excelente desempenho.

#### C#
```csharp
void bolha(List<int> lista) {
    bool houveTroca;
    int tmp;
    int qtdComparacoes = 0, qtdTrocas = 0;

    do {
        houveTroca = false;
        for (int i = 0; i < lista.Count - 1; i++) {
            qtdComparacoes++;
            if (lista[i] > lista[i + 1]) {
                qtdTrocas++;
                houveTroca = true;
                tmp = lista[i];
                lista[i] = lista[i + 1];
                lista[i + 1] = tmp;
            }
        }
    } while (houveTroca);
}
```

#### Java
```java
void bolha(List<Integer> lista) {
    boolean houveTroca;
    int tmp;
    int qtdComparacoes = 0, qtdTrocas = 0;

    do {
        houveTroca = false;
        for (int i = 0; i < lista.size() - 1; i++) {
            qtdComparacoes++;
            if (lista.get(i) > lista.get(i + 1)) {
                qtdTrocas++;
                houveTroca = true;
                tmp = lista.get(i);
                lista.set(i, lista.get(i + 1));
                lista.set(i + 1, tmp);
            }
        }
    } while (houveTroca);
}
```

#### Python
```python
def bolha(lista):
    houve_troca = True
    qtd_comparacoes = 0
    qtd_trocas = 0
    while houve_troca:
        houve_troca = False
        for i in range(len(lista) - 1):
            qtd_comparacoes += 1
            if lista[i] > lista[i + 1]:
                qtd_trocas += 1
                houve_troca = True
                tmp = lista[i]
                lista[i] = lista[i + 1]
                lista[i + 1] = tmp
```

---

### 2. Selection Sort (Seleção)

#### C#
```csharp
void selecao(List<int> lista) {
    int posMenor, tmp;
    int qtd_comparacoes = 0, qtd_trocas = 0;
    for (int i = 0; i < lista.Count - 1; i++) {
        posMenor = i;
        for (int j = i + 1; j < lista.Count; j++) {
            qtd_comparacoes++;
            if (lista[j] < lista[posMenor]) {
                posMenor = j;
            }
        }
        if (i != posMenor) {
            qtd_trocas++;
            tmp = lista[i];
            lista[i] = lista[posMenor];
            lista[posMenor] = tmp;
        }
    }
}
```

#### Java
```java
void selecao(List<Integer> lista) {
    int posMenor, tmp;
    int qtd_comparacoes = 0, qtd_trocas = 0;
    for (int i = 0; i < lista.size() - 1; i++) {
        posMenor = i;
        for (int j = i + 1; j < lista.size(); j++) {
            qtd_comparacoes++;
            if (lista.get(j) < lista.get(posMenor)) {
                posMenor = j;
            }
        }
        if (i != posMenor) {
            qtd_trocas++;
            tmp = lista.get(i);
            lista.set(i, lista.get(posMenor));
            lista.set(posMenor, tmp);
        }
    }
}
```

#### Python
```python
def selecao(lista):
    qtd_comparacoes = 0
    qtd_trocas = 0
    for i in range(len(lista) - 1):
        posMenor = i
        for j in range(i + 1, len(lista)):
            qtd_comparacoes += 1
            if lista[j] < lista[posMenor]:
                posMenor = j
        if i != posMenor:
            qtd_trocas += 1
            tmp = lista[i]
            lista[i] = lista[posMenor]
            lista[posMenor] = tmp
```

---

### 3. Insertion Sort (Inserção)

#### C#
```csharp
void insercao(List<int> lista) {
    int i, j, tmp;
    int qtdComparacoes = 0, qtdTrocas = 0;

    for (i = 1; i < lista.Count; i++) {
        tmp = lista[i];
        for (j = i - 1; j >= 0; j--) {
            qtdComparacoes++;
            if (tmp < lista[j]) {
                lista[j + 1] = lista[j]; // shift para a direita
                qtdTrocas++;
            } else {
                break;
            }
        }
        lista[j + 1] = tmp;
        qtdTrocas++;
    }
}
```

#### Java
```java
void insercao(List<Integer> lista) {
    int i, j, tmp;
    int qtdComparacoes = 0, qtdTrocas = 0;

    for (i = 1; i < lista.size(); i++) {
        tmp = lista.get(i);
        for (j = i - 1; j >= 0; j--) {
            qtdComparacoes++;
            if (tmp < lista.get(j)) {
                lista.set(j + 1, lista.get(j));
                qtdTrocas++;
            } else {
                break;
            }
        }
        lista.set(j + 1, tmp);
        qtdTrocas++;
    }
}
```

#### Python
```python
def insercao(lista):
    qtd_comparacoes = 0
    qtd_trocas = 0

    for i in range(1, len(lista)):
        tmp = lista[i]
        j = i - 1
        while j >= 0:
            qtd_comparacoes += 1
            if tmp < lista[j]:
                lista[j + 1] = lista[j]
                qtd_trocas += 1
                j -= 1
            else:
                break
        lista[j + 1] = tmp
        qtd_trocas += 1
```

---

### Estruturação de Pacotes em MVC

```text
package Model
    - Model: popularLista()

package View
    - ListaView: exibirLista(...), exibirTempo(...)

package Controller
    - ListaController:
        - listaBolha, listaSelecao, listaInsercao
        - popularListaBolha (ex: 5.000)
        - popularListaSelecao (ex: 5.000)
        - popularListaInsercao (ex: 5.000)
        - Execuções: controller.bolha(...), controller.selecao(...), controller.insercao(...)
```

---

## Aula 06 — 13/08/2026

### Cocktail Sort / Shake Sort (Agitação)

- Baseado no **Bubble Sort** com varredura bidirecional.
- Estável e de memória interna.
- A estrutura opera dividida em 3 porções:
  1. Porção ordenada à esquerda (menores elementos).
  2. Porção desordenada ao centro.
  3. Porção ordenada à direita (maiores elementos).
- Utiliza os ponteiros `ini` e `fim`, que convergem a cada passada.

> **Observação:** Indicado para estruturas menores. Quando a estrutura estiver quase ordenada, possui ótimo desempenho. Para listas encadeadas, necessita ser duplamente encadeada.

#### C#
```csharp
void agitacao(List<int> lista) {
    bool houveTroca;
    int tmp;
    int ini = 0;
    int fim = lista.Count;
    int qtdComparacoes = 0, qtdTrocas = 0;

    do {
        houveTroca = false;
        for (int i = ini; i < fim - 1; i++) {
            qtdComparacoes++;
            if (lista[i] > lista[i + 1]) {
                qtdTrocas++;
                houveTroca = true;
                tmp = lista[i];
                lista[i] = lista[i + 1];
                lista[i + 1] = tmp;
            }
        }
        if (!houveTroca) break;
        fim--;

        houveTroca = false;
        for (int i = fim; i > ini; i--) {
            qtdComparacoes++;
            if (lista[i] < lista[i - 1]) {
                qtdTrocas++;
                houveTroca = true;
                tmp = lista[i];
                lista[i] = lista[i - 1];
                lista[i - 1] = tmp;
            }
        }
        ini++;
    } while (houveTroca);
}
```

#### Java
```java
void agitacao(List<Integer> lista) {
    boolean houveTroca;
    int tmp;
    int ini = 0;
    int fim = lista.size();
    int qtdComparacoes = 0, qtdTrocas = 0;

    do {
        houveTroca = false;
        for (int i = ini; i < fim - 1; i++) {
            qtdComparacoes++;
            if (lista.get(i) > lista.get(i + 1)) {
                qtdTrocas++;
                houveTroca = true;
                tmp = lista.get(i);
                lista.set(i, lista.get(i + 1));
                lista.set(i + 1, tmp);
            }
        }
        if (!houveTroca) break;
        fim--;

        houveTroca = false;
        for (int i = fim; i > ini; i--) {
            qtdComparacoes++;
            if (lista.get(i) < lista.get(i - 1)) {
                qtdTrocas++;
                houveTroca = true;
                tmp = lista.get(i);
                lista.set(i, lista.get(i - 1));
                lista.set(i - 1, tmp);
            }
        }
        ini++;
    } while (houveTroca);
}
```

#### Python
```python
def agitacao(lista):
    ini = 0
    fim = len(lista)
    qtd_comparacoes = 0
    qtd_trocas = 0

    while True:
        houveTroca = False
        for i in range(ini, fim - 1):
            qtd_comparacoes += 1
            if lista[i] > lista[i + 1]:
                qtd_trocas += 1
                houveTroca = True
                tmp = lista[i]
                lista[i] = lista[i + 1]
                lista[i + 1] = tmp
        if not houveTroca:
            break
        fim -= 1

        houveTroca = False
        for i in range(fim, ini, -1):
            qtd_comparacoes += 1
            if lista[i] < lista[i - 1]:
                qtd_trocas += 1
                houveTroca = True
                tmp = lista[i]
                lista[i] = lista[i - 1]
                lista[i - 1] = tmp
        ini += 1
        if not houveTroca:
            break
```

### Exercício em MVC

- Implementar o MVC contendo Bolha, Inserção, Seleção e Agitação: 
- Em C#, utiliza-se a palavra-chave `out` para retornar múltiplos parâmetros por referência (ex: `qtdComparacoes` e `qtdTrocas`).

---

## Aula 07 — 20/08/2026

### Comb Sort (Pente)

- Variante do Bubble Sort que utiliza saltos (*distância/gap*).
- Instável.
- Fator de encolhimento: `distancia = (int)(distancia / 1.3)`. Quando a distância atinge 1, comporta-se como o Bubble Sort tradicional até não haver trocas.

```text
Exemplo de redução do gap:
n = 10 -> dist = 10 / 1.3 = 7 -> 7 / 1.3 = 5 -> 5 / 1.3 = 3 -> 3 / 1.3 = 2 -> 2 / 1.3 = 1
```

#### Implementação Java
```java
void pente(List<Integer> lista) {
    boolean houveTroca;
    int tmp;
    int distancia = lista.size();
    int qtdComparacoes = 0, qtdTrocas = 0;

    do {
        distancia = (int)(distancia / 1.3);
        if (distancia < 1) {
            distancia = 1;
        }
        houveTroca = false;
        for (int i = 0; i + distancia < lista.size(); i++) {
            qtdComparacoes++;
            if (lista.get(i) > lista.get(i + distancia)) {
                qtdTrocas++;
                houveTroca = true;
                tmp = lista.get(i);
                lista.set(i, lista.get(i + distancia));
                lista.set(i + distancia, tmp);
            }
        }
    } while (houveTroca || distancia > 1);
}
```

### Desafio — Ordenação por Múltiplas Chaves

- Classe `Processo`: campos `int id`, `Date data`.
- Código do repositório: [Desafio Comb Sort com Múltiplas Chaves]

```csharp
// Comparação primária por ID:
if (lista[i].id > lista[i + dist].id) {
    // Troca os elementos
} 
// Se os IDs forem iguais, aplica o critério de desempate por Data:
else if (lista[i].Equals(lista[i + dist])) {
    if (lista[i].data > lista[i + dist].data) {
        // Troca os elementos
    }
}
```

---

## Aula 08 — 24/08/2026

### Interface `Comparable` e Método `compareTo`

- Retorno do `compareTo`:
  - `0`: objetos equivalentes.
  - `< 0` (negativo): o objeto chamador precede o parâmetro.
  - `> 0` (positivo): o objeto chamador sucede o parâmetro.

```java
String f1 = "Alexandre";
String f2 = "Pietro";
System.out.println(f1.compareTo(f1)); // 0
System.out.println(f1.compareTo(f2)); // < 0
System.out.println(f2.compareTo(f1)); // > 0
```

### Exemplo Completo — Classe `Pessoa` e Ordenação Customizada

```java
package javaapplication1;

import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    @Override
    public String toString() {
        return "nome = " + nome + ", idade = " + idade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + this.idade;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        final Pessoa other = (Pessoa) obj;
        if (this.idade != other.idade) return false;
        return Objects.equals(this.nome, other.nome);
    }

    @Override
    public int compareTo(Pessoa o) {
        int resultadoNome = this.nome.compareTo(o.getNome());
        if (resultadoNome != 0) {
            return resultadoNome;
        }
        return Integer.compare(this.idade, o.getIdade());
    }    
}
```

#### Uso no Programa Principal
```java
package javaapplication1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<>();
        lista.add(new Pessoa("Gabriel", 19));
        lista.add(new Pessoa("Alex", 52));
        lista.add(new Pessoa("Bernardo", 6));
        lista.add(new Pessoa("Bernardo", 30));
        lista.add(new Pessoa("Gabriel", 20));
        lista.add(new Pessoa("Alex", 51));

        // Ordenação natural baseada no compareTo (Nome e Idade):
        Collections.sort(lista);

        // Ordenação secundária via expressão Lambda (apenas por idade):
        lista.sort((p1, p2) -> Integer.compare(p1.getIdade(), p2.getIdade()));

        System.out.println(lista);
    }
}
```

---

## Aula 09 — 31/08/2026

- Organização dos códigos desenvolvidos em sala no padrão arquitetural MVC.
- Validação e revisão da separação das responsabilidades entre Model, View e Controller.

---

## Aula 12 — 03/09/2026

### Métodos Avançados de Baixa Complexidade

A ordenação organiza a estrutura para otimizar pesquisas futuras.
- **Complexidade (Esforço):** $\text{Esforço} = \text{Comparações} + \text{Trocas}$.
- Referência visual: [Demonstrações Algorítmicas (AlgoRythmics)](https://www.youtube.com/@AlgoRythmics/videos).

### Merge Sort

- **Paradigma:** Divisão e conquista (recursivo).
- **Complexidade:** $O(n \log n)$ em todos os casos.
- Divide a lista sucessivamente ao meio até subvetores unitários. Na volta do empilhamento recursivo, executa a rotina `intercalar`, ordenando os elementos.

### Quick Sort

- **Paradigma:** Divisão e conquista via particionamento em torno de um **pivô**.
- **Complexidade:** $O(n \log n)$ médio; $O(n^2)$ no pior caso.
- Posiciona o pivô no local definitivo; os menores vão para a esquerda e os maiores para a direita. A ordenação é executada durante o avanço ("na ida").

---

## Aula 13 — 14/09/2026

### Interface Gráfica com Java Swing

- Continuação do projeto de ordenação integrando interface gráfica via Swing.
- Uso de componentes de painel ocultos/visíveis (`JPanel.setVisible(boolean)`) para alternar conteúdos contextualmente.
- Para capturar seleções em `JComboBox`, priorizar `getSelectedIndex()` ao invés do parsing textual.

### Desafio Swing

Implementar uma `JTable` de benchmark contendo as seguintes colunas:
1. Método (Bolha, Seleção, Inserção, Pente, Shell).
2. Quantidade de comparações.
3. Quantidade de trocas.
4. Tempo de execução ($ms$).

---

## Aula 18 — 24/09/2026

### Shell Sort

- Melhoria substancial do **Insertion Sort** por meio de comparações e trocas distantes orientadas por intervalos decrescentes (*gaps*).
- **Características:** Instável; opera em memória interna ($O(1)$ espaço extra).
- Não é adequado para listas simplesmente encadeadas (exige acesso direto por índice).
- *Regra mnemônica:* O Comb Sort deriva do Bubble Sort; o Shell Sort deriva do Insertion Sort (e quando o gap converge para 1, torna-se um Insertion Sort padrão).

> Demonstração: [Vídeo Explicativo Shell Sort](https://www.youtube.com/watch?v=CmPA7zE8mx0)

#### C#
```csharp
void shell(int[] vetor, int n) {
    int i, j, tmp;
    int qtdComparacoes = 0, qtdTrocas = 0;
    int distancia = 1;
    int referenciaTamanho = 3;

    do {
        distancia = referenciaTamanho * distancia + 1;
    } while (distancia < n);
    
    do {
        distancia = distancia / referenciaTamanho;
        for (i = distancia; i < n; i++) {
            tmp = vetor[i];
            for (j = i - distancia; j >= 0; j -= distancia) {
                qtdComparacoes++;
                if (tmp < vetor[j]) {
                    vetor[j + distancia] = vetor[j];
                    qtdTrocas++;
                } else {
                    break;
                }
            }
            vetor[j + distancia] = tmp;
            qtdTrocas++;
        }
    } while (distancia > 1);
}
```

#### Java
```java
void shell(int[] vetor, int n) {
    int i, j, tmp;
    int qtdComparacoes = 0, qtdTrocas = 0;
    int distancia = 1;
    int referenciaTamanho = 3;

    do {
        distancia = referenciaTamanho * distancia + 1;
    } while (distancia < n);
    
    do {
        distancia = distancia / referenciaTamanho;
        for (i = distancia; i < n; i++) {
            tmp = vetor[i];
            for (j = i - distancia; j >= 0; j -= distancia) {
                qtdComparacoes++;
                if (tmp < vetor[j]) {
                    vetor[j + distancia] = vetor[j];
                    qtdTrocas++;
                } else {
                    break;
                }
            }
            vetor[j + distancia] = tmp;
            qtdTrocas++;
        }
    } while (distancia > 1);
}
```

> **Conceito Extra — Arquitetura de Software:**
> - **Monolítico:** Sistema acoplado em servidor e base centralizados; caso o servidor/banco caia, toda a aplicação fica indisponível.
> - **Distribuído / Não monolítico:** Desacoplado em múltiplos nós e serviços independentes para tolerância a falhas.

- Código do projeto Swing com Shell Sort: [Projeto Ordenação Shell Sort]

---

## Aula 19 — 28/09/2026

### Bucket Sort, Radix Sort, Memória Stack e Heap

- **Bucket Sort & Radix Sort:** Eficientes para chaves numéricas com muitos dígitos ou dados uniformemente distribuídos.
- **Stack (Pilha):** Memória de execução rápida organizada pelo sistema/processador para empilhamento de chamadas e variáveis locais.
- **Heap (Memória):** Região da RAM destinada à alocação dinâmica de objetos em tempo de execução.

> **Boas Práticas de Alocação:** Evitar instanciar coleções repetidamente dentro de laços (`while (...) { List l = new ArrayList(); }`). Declare a lista fora do laço e utilize `lista.clear()` internamente para reduzir a pressão sobre o Garbage Collector.

### Heap Sort

Baseado na estrutura de dados Heap (árvore binária quase completa representada em vetor):
- **Heap Máximo:** Garante que a raiz de qualquer subárvore seja sempre maior ou igual a seus filhos.
- Relação de índices (considerando índice inicial em 1):
  - $\text{filhoEsquerda} = 2 \cdot \text{posicaoRaiz}$
  - $\text{filhoDireita} = 2 \cdot \text{posicaoRaiz} + 1$
- A cada iteração, troca o elemento raiz (maior valor) com a última posição não ordenada do vetor e refaz a restauração da propriedade do Heap.
- Demonstração: [Vídeo Heap Sort](https://www.youtube.com/watch?v=Xw2D9aJRBY4)

---

## Aula 20 — 01/10/2026

### Fundamentos de Pesquisa

A eficácia da pesquisa é dependente da ordenação prévia da estrutura.

- **Pesquisa Sequencial:** Aplicável a estruturas desordenadas. Complexidade $O(n)$.
- **Pesquisa Binária:** Baseada no paradigma de divisão binária; exige que a estrutura esteja rigorosamente ordenada. Complexidade $O(\log n)$.
- **Pesquisa Digital:** Realizada caractere a caractere / dígito a dígito (ex: árvores Trie).

### Implementação — Pesquisa Binária em Java

```java
public static boolean pesquisaBinaria(int numero, ArrayList<Integer> lista) {
    int ini = 0;
    int fim = lista.size() - 1;
    int meio;
    long qtdComparacoes = 0;

    while (ini <= fim) {
        meio = (ini + fim) / 2;
        qtdComparacoes++;
        if (numero == lista.get(meio)) {
            return true;
        }
        if (numero < lista.get(meio)) {
            fim = meio - 1;
        } else {
            ini = meio + 1;
        }
    }
    return false;
}
```

- Repositório da aula: [Aula Pesquisa Binária]

---

## Aula 21 — 05/10/2026

### Algoritmos Canônicos de Pesquisa em C

#### Sequencial — $O(n)$
```c
long long int sequencial(int numero, int *vetor, long long int n) {
    long long int i;
    for (i = 0; i < n; i++) {
        if (numero == vetor[i]) {
            return i; // índice encontrado
        }
    }
    return -1; // não encontrado
}
```

#### Binária — $O(\log n)$
```c
long long int binaria(int numero, int *vetor, long long int n) {
    long long int ini = 0, fim = n - 1, meio;
    while (ini <= fim) {
        meio = (ini + fim) / 2;
        if (numero == vetor[meio]) {
            return meio;
        }
        if (numero < vetor[meio]) {
            fim = meio - 1;
        } else {
            ini = meio + 1;
        }
    }
    return -1;
}
```

### Estruturas de Dados por Linguagem

- **Árvores / Conjuntos Ordenados (Busca Binária):**
  - Java: `TreeSet`
  - C#: `SortedSet`
- **Listas (Busca Sequencial / Indexada):**
  - Java: `ArrayList`, `LinkedList`, `Vector`
  - C#: `List<T>`, `LinkedList<T>`
- **Tabelas Hash (Endereçamento Direto):**
  - Java: `HashSet`, `HashMap`
  - C#: `HashSet<T>`, `Dictionary<TKey, TValue>`

### Manipulação de Strings e Eventos

- **Eventos de Teclado:**
  - `keyPressed`: Tecla pressionada.
  - `keyTyped`: Caractere impresso (ida).
  - `keyReleased`: Tecla liberada (volta).
- **Tipos de Strings:**
  - `String`: Imutável.
  - `StringBuilder`: Mutável e não sincronizado (alta performance para manipulação em lote).
  - `StringBuffer`: Mutável e thread-safe (sincronizado).
- Em C#: `frase.Substring(indiceInicial, qtdeCaracteres)`.

---

## Aula 22 — 14/10/2026 

### Roteiro de Estudos e Tabelas Hash

1. **Universo de Ordenação:** Algoritmos elementares e avançados, métricas de trocas e comparações.
2. **Universo de Pesquisa:** Sequencial, binária e digital.
3. **Hash (Espalhamento):**
   - Estrutura mais eficiente para grandes massas de dados ($O(1)$ médio).
   - Não mantém a estrutura ordenada cronologicamente ou numericamente.
   - Não possui índice numérico sequencial tradicional.
   - **Função Hash:** Calcula a partir de uma chave a posição/endereço exato na memória.

### Tratamento de Colisões

- **Encadeamento Exterior (Separated Chaining):** Uso de listas encadeadas no mesmo slot de memória.
- **Endereçamento Aberto (Open Addressing):** Sondagem linear, quadrática ou duplo hashing.

### Coleções Hash

- **HashMap:** Mapeamento chave-valor (`key-value`). Não admite chaves duplicadas; não é thread-safe.
- **HashSet:** Armazena apenas valores únicos (sem par chave-valor).
- **Hashtable:** Par chave-valor com sincronização de concorrência integrada (mais lenta devido aos bloqueios).

### Trabalho Prático — Telephony HashMap

1. Ler e segmentar os registros de `telephony.txt`.
2. Instanciar objetos `Sessao` e inseri-los (`put`) no `HashMap`.
3. Buscar dados associados a números de telefone.
4. *Desafio Concorrente:* Uso de múltiplas `Threads` para pesquisas paralelas simultâneas.

---

### Projeto Prático: Servidor e Cliente Swing

Desenvolvimento com interface gráfica:
- **Cliente:** Entrada do número de telefone e painel de apresentação dos dados da sessão.
- **Servidor:** Carregamento do arquivo e monitoramento textual via `JTextArea`.
- Configuração do JFrame:
  ```java
  public JFrameServidor() {
      initComponents();
      this.setResizable(false);
      this.setLocationRelativeTo(null); // Centraliza a janela na tela
  }
  ```

### Resumo Comparativo de Strings em Java

- **String:** Imutável. Qualquer concatenação gera um novo objeto no Heap.
- **StringBuilder:** Mutável e veloz (não sincronizado).
- **StringBuffer:** Mutável e sincronizado (thread-safe, overhead de concorrência).

---

## Aula 23 — 19/10/2026

### Implementação Primitiva de Função Hash

- Referência: [HashBase em Java]
- O hashing é indicado para recuperação digital rápida, porém inadequado para geração de relatórios ordenados.
- Estruturas pequenas aumentam a probabilidade de **colisão**.
- Função de espalhamento básica:
  $$\text{endereço} = \text{tamanhoTabela} \pmod{\text{tamanhoDaChave}}$$

---

## Aula 24 — 22/10/2026

### Revisão Geral de Pesquisa

- **Fluxo ótimo:** Armazenar $\rightarrow$ Ordenar $\rightarrow$ Pesquisar.
- **Resumo de Complexidades:**
  - Pesquisa Sequencial: $O(n)$
  - Pesquisa Binária: $O(\log n)$ (exige estrutura ordenada)
  - Pesquisa Digital: $O(m)$ (onde $m$ é o comprimento da chave)
  - Pesquisa Hash: $O(1)$ médio

### Tópicos Contemporâneos em Inteligência Artificial

1. **LLM (Large Language Model):** Modelos neurais treinados em grandes corpora para interpretar e sintetizar linguagem natural (ex: GPT, Gemini, Claude).
2. **Transformers:** Arquitetura baseada no mecanismo de auto-atenção (*self-attention*) capaz de capturar relações contextuais distantes entre tokens.
3. **Embeddings (Vetorização):** Mapeamento de termos, frases ou documentos em vetores numéricos de alta dimensionalidade em um espaço semântico.
4. **RAG (Retrieval-Augmented Generation):** Técnica que combina recuperação de informações em fontes de dados externas com geração via LLM, evitando alucinações e fornecendo contexto atualizado.

### Respostas da Tarefa Prática

1. **Três principais estruturas de dados em memória para acesso eficaz:**
   - **Listas:** Armazenamento sequencial dinâmico.
   - **Árvores:** Acesso hierárquico logarítmico rápido ($O(\log n)$).
   - **Tabelas Hash:** Busca direta em tempo constante médio ($O(1)$) via funções de espalhamento.
2. **Requisito e filosofia da Pesquisa Binária:**
   - A estrutura precisa estar previamente ordenada.
   - Filosofia: Divisão contínua do espaço de busca pela metade, comparando o item central até encontrar o dado ou esgotar os limites.
3. **Mecanismo de acesso $O(1)$ das Tabelas Hash:**
   - Uso de uma **função hash** matemática para calcular o endereço direto de memória a partir da chave do registro.
4. **Comparações na Pesquisa Binária:**
   - O cálculo contínuo do índice $\text{meio} = \lfloor(\text{ini} + \text{fim}) / 2\rfloor$ reduz o espaço de busca pela metade a cada comparação até convergir para o valor procurado.
