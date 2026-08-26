# 📚 Pesquisa e Ordenação

Resumo de estudo sobre **Pesquisa e Ordenação**, abordando memória principal e secundária, complexidade de algoritmos, Big O, estabilidade, métodos de ordenação e métodos de pesquisa.

---

## 📌 1. Visão Geral

Os conteúdos podem ser divididos em dois grandes processos:

### Ordenação

Ordenação significa **organizar os dados de acordo com algum critério**.

Exemplo:

```text
Antes:
[8, 3, 5, 1, 9]

Depois:
[1, 3, 5, 8, 9]
```

A ordenação pode ser:

```text
Crescente:
1, 2, 3, 4, 5

Decrescente:
5, 4, 3, 2, 1

Alfabética:
Ana, Bruno, Carlos
```

A ordenação pode ocorrer tanto na:

- Memória principal;
- Memória secundária.

---

## 🔍 2. Pesquisa

Pesquisa significa **procurar determinado elemento dentro de uma estrutura de dados**.

Exemplo:

```text
Lista:
[10, 20, 30, 40, 50]

Elemento procurado:
30
```

O algoritmo de pesquisa deverá determinar se o elemento existe e, dependendo da implementação, informar também sua posição.

---

# 💾 3. Memória Principal

A memória principal corresponde principalmente à **memória RAM**.

Características:

- É rápida;
- É volátil;
- É utilizada durante a execução dos programas;
- Possui capacidade limitada;
- Os dados são perdidos quando o computador é desligado.

Exemplo em Java:

```java
List<Integer> numeros = new ArrayList<>();
```

Essa lista ficará armazenada na memória principal enquanto o programa estiver sendo executado.

---

## Ordenação Interna

Quando todos os dados que precisam ser ordenados cabem na memória RAM, temos uma:

> **Ordenação interna**

Alguns exemplos de algoritmos de ordenação interna:

- Bubble Sort;
- Selection Sort;
- Insertion Sort;
- Cocktail Sort;
- Comb Sort;
- Quick Sort;
- Merge Sort.

---

# 💿 4. Memória Secundária

A memória secundária é utilizada para armazenar informações de maneira permanente.

Exemplos:

- HD;
- SSD;
- Arquivos;
- Bancos de dados.

Ela normalmente possui capacidade maior que a memória RAM, porém apresenta acesso mais lento.

---

## Ordenação Externa

Quando a quantidade de dados é tão grande que não cabe completamente na memória RAM, é necessário utilizar a memória secundária.

Essa situação é chamada de:

> **Ordenação externa**

Exemplo:

Imagine um arquivo com:

```text
500 GB de informações
```

em um computador que possui:

```text
16 GB de RAM
```

Não é possível carregar todo o arquivo para a memória principal.

Uma estratégia seria:

```text
Arquivo
   ↓
Carrega uma parte
   ↓
Ordena na RAM
   ↓
Salva o resultado
   ↓
Carrega outra parte
   ↓
Ordena
   ↓
Combina os resultados
```

O **Merge Sort** é bastante adequado para situações envolvendo ordenação externa.

---

# 🔎 5. Pesquisa na Memória Principal

A pesquisa pode acontecer em estruturas armazenadas diretamente na memória RAM.

Exemplos:

- Arrays;
- Vetores;
- Listas;
- Árvores;
- Strings;
- Textos.

Exemplo:

```text
Lista:

[15, 7, 22, 9, 30]

Pesquisar:
22
```

Uma possível pesquisa:

```text
15 → não encontrado
7  → não encontrado
22 → encontrado
```

Esse é o princípio da **pesquisa sequencial ou linear**.

---

# 💽 6. Pesquisa na Memória Secundária

Também é possível pesquisar informações armazenadas em:

- Arquivos;
- HD;
- SSD;
- Bancos de dados.

Exemplo:

```text
Arquivo com 1.000.000 de alunos
```

Pesquisar diretamente todos os registros pode ser demorado.

Como acessar a memória secundária normalmente é mais lento do que acessar a RAM, sistemas utilizam mecanismos como:

- Índices;
- Árvores;
- Tabelas de índices;
- Estruturas específicas de bancos de dados.

Um índice permite encontrar uma informação sem precisar percorrer todos os registros.

---

# ⚙️ 7. Como Comparar Algoritmos

Alguns dos principais critérios utilizados para comparar métodos de pesquisa e ordenação são:

1. Complexidade;
2. Simplicidade;
3. Estabilidade.

---

# 📈 8. Complexidade

Complexidade representa aproximadamente:

> **Quanto o esforço computacional aumenta conforme a quantidade de dados aumenta.**

Normalmente utilizamos a letra `n` para representar a quantidade de elementos.

Exemplo:

```text
[10, 20, 30, 40]
```

Nesse caso:

```text
n = 4
```

Para representar a complexidade de algoritmos utilizamos frequentemente a:

> **Notação Big O — O Grande**

---

# 🧠 9. Big O

Big O representa o crescimento do custo computacional de um algoritmo conforme a entrada aumenta.

A ideia não é medir simplesmente:

```text
2 segundos
5 segundos
10 segundos
```

Mas entender:

> Como o tempo de execução cresce quando `n` aumenta?

---

## Ordem aproximada de eficiência

```text
MELHOR
  ↓

O(1)
O(log n)
O(n)
O(n log n)
O(n²)
O(n³)
O(n^k)
O(2^n)
O(n!)

  ↓
PIOR
```

Quanto mais rapidamente a função cresce, pior tende a ser o desempenho para grandes quantidades de dados.

---

# ⚠️ Atenção

A notação correta para complexidade fatorial é:

```text
O(n!)
```

e não:

```text
O(!n)
```

---

# 🟢 10. Complexidade O(1)

Representa uma complexidade **constante**.

O número de operações praticamente não depende do tamanho da estrutura.

Exemplo:

```java
lista.get(0);
```

Se a lista possuir:

```text
10 elementos
```

ou:

```text
1.000.000 de elementos
```

o acesso direto à posição continua sendo aproximadamente constante.

Portanto:

```text
O(1)
```

---

# 🟢 11. Complexidade O(log n)

Representa uma complexidade **logarítmica**.

É considerada muito eficiente.

Um exemplo clássico é a:

> **Pesquisa Binária**

Ela divide a área de pesquisa aproximadamente pela metade a cada operação.

Exemplo:

```text
[1, 2, 3, 4, 5, 6, 7, 8]
```

Queremos encontrar:

```text
7
```

Primeiro analisamos o meio:

```text
[1, 2, 3, 4 | 5, 6, 7, 8]
```

Como `7` é maior que `4`, podemos descartar toda a primeira metade.

Continuamos apenas com:

```text
[5, 6, 7, 8]
```

E repetimos o processo.

Complexidade:

```text
O(log n)
```

---

# 🟡 12. Complexidade O(n)

Representa uma complexidade **linear**.

O esforço cresce proporcionalmente à quantidade de elementos.

Exemplo:

> **Pesquisa Linear**

Lista:

```text
[7, 12, 4, 30, 51]
```

Pesquisar:

```text
51
```

Processo:

```text
7  ❌
12 ❌
4  ❌
30 ❌
51 ✅
```

No pior caso, todos os elementos precisam ser analisados.

Portanto:

```text
O(n)
```

---

# 🟠 13. Complexidade O(n²)

Representa uma complexidade **quadrática**.

É muito comum nos algoritmos simples de ordenação.

Exemplo:

```java
for (...) {

    for (...) {

    }
}
```

Dois laços associados ao tamanho da entrada podem resultar aproximadamente em:

```text
n × n
```

Portanto:

```text
O(n²)
```

Alguns exemplos:

- Bubble Sort;
- Selection Sort;
- Insertion Sort no pior caso;
- Cocktail Sort.

---

# 📊 14. Por que O(n²) pode ser ruim?

Imagine:

```text
n = 10
```

Temos:

```text
n² = 100
```

Agora:

```text
n = 1.000
```

Temos:

```text
n² = 1.000.000
```

Se:

```text
n = 1.000.000
```

Teremos:

```text
n² = 1.000.000.000.000
```

Isso demonstra como algoritmos quadráticos podem se tornar muito lentos para estruturas grandes.

---

# 🟢 15. Complexidade O(n log n)

Uma das complexidades mais comuns em algoritmos eficientes de ordenação.

Exemplos:

```text
Merge Sort → O(n log n)

Heap Sort → O(n log n)

Quick Sort → O(n log n), em média
```

Para grandes quantidades de dados, algoritmos `O(n log n)` normalmente possuem desempenho muito melhor que algoritmos `O(n²)`.

---

# 📊 16. Comparação de Complexidades

Imagine:

```text
n = 1.000
```

Aproximadamente:

| Complexidade | Número aproximado de operações |
|---|---:|
| `O(1)` | 1 |
| `O(log n)` | ~10 |
| `O(n)` | 1.000 |
| `O(n log n)` | ~10.000 |
| `O(n²)` | 1.000.000 |
| `O(n³)` | 1.000.000.000 |

Isso ajuda a compreender por que a complexidade é importante.

---

# 🚀 17. Complexidade e Eficiência

De maneira geral:

```text
Maior crescimento da complexidade
              ↓
Maior esforço computacional
              ↓
Menor eficiência para grandes entradas
```

Porém, isso não significa que um algoritmo `O(n²)` seja sempre inadequado.

Para:

- Poucos elementos;
- Pequenas listas;
- Aplicações simples;

a diferença pode ser pequena.

---

# ✨ 18. Simplicidade do Código

Algoritmos simples normalmente são:

- Mais fáceis de entender;
- Mais fáceis de implementar;
- Mais fáceis de testar;
- Mais fáceis de ensinar.

Por exemplo, o Bubble Sort possui uma lógica bastante simples:

```text
Compara dois vizinhos.

Se estiverem fora de ordem:
    troca.

Repete o processo.
```

Entretanto, sua complexidade normalmente é:

```text
O(n²)
```

Assim:

```text
Código simples
      ↓
Fácil implementação
      ↓
Pode apresentar menor eficiência
```

Isso não é uma regra absoluta.

---

# 🔄 19. Estabilidade

A estabilidade de um algoritmo de ordenação está relacionada à:

> **Manutenção da ordem relativa entre elementos que possuem a mesma chave de ordenação.**

---

## Exemplo

Lista original:

```text
Ana   - nota 8
Pedro - nota 7
João  - nota 8
Maria - nota 6
```

Ordenando por nota:

```text
Maria - nota 6
Pedro - nota 7
Ana   - nota 8
João  - nota 8
```

Ana e João possuem a mesma nota.

Antes:

```text
Ana → João
```

Depois:

```text
Ana → João
```

A ordem relativa foi preservada.

Portanto, a ordenação foi:

> **Estável**

---

# ❌ 20. Ordenação Instável

Considere o resultado:

```text
Maria - nota 6
Pedro - nota 7
João  - nota 8
Ana   - nota 8
```

Antes:

```text
Ana → João
```

Depois:

```text
João → Ana
```

Como os dois possuem a mesma chave, mas tiveram sua ordem relativa alterada, o algoritmo é:

> **Instável**

---

# ⚠️ Atenção sobre Estabilidade

Estabilidade **não significa** que o algoritmo desorganiza ou não temporariamente os dados durante seu funcionamento.

A definição correta é:

> Um algoritmo estável preserva a ordem relativa entre elementos que possuem a mesma chave de ordenação.

---

# 💡 21. Por que a Estabilidade é Importante?

Imagine uma lista inicialmente organizada pelo nome:

```text
Ana    - Computação
Bruno  - Computação
Carlos - Matemática
Daniel - Matemática
```

Depois queremos ordenar pelo curso.

Com uma ordenação estável:

```text
Computação:
Ana
Bruno

Matemática:
Carlos
Daniel
```

A ordenação anterior pelo nome é preservada dentro dos grupos.

---

# 🔃 22. Principais Métodos de Ordenação

| Método | Melhor caso | Caso médio/pior | Estável? | Ideia principal |
|---|---|---|---|---|
| Bubble Sort | `O(n)`* | `O(n²)` | Sim | Compara vizinhos |
| Selection Sort | `O(n²)` | `O(n²)` | Geralmente não | Procura o menor |
| Insertion Sort | `O(n)` | `O(n²)` | Sim | Insere na posição correta |
| Cocktail Sort | `O(n)`* | `O(n²)` | Sim | Bubble nos dois sentidos |
| Comb Sort | Depende da implementação | `O(n²)` pior caso | Não | Utiliza gaps |
| Merge Sort | `O(n log n)` | `O(n log n)` | Sim | Divide e combina |
| Quick Sort | `O(n log n)` médio | `O(n²)` pior | Geralmente não | Utiliza pivô |

> `*` Considerando implementações otimizadas.

---

# 🫧 23. Bubble Sort

O Bubble Sort compara elementos vizinhos.

Exemplo:

```text
[5, 3, 2, 4]
```

Primeira comparação:

```text
5 e 3
```

Como:

```text
5 > 3
```

realizamos uma troca:

```text
[3, 5, 2, 4]
```

Depois:

```text
5 e 2
```

Troca:

```text
[3, 2, 5, 4]
```

Depois:

```text
5 e 4
```

Troca:

```text
[3, 2, 4, 5]
```

O maior elemento vai sendo deslocado em direção ao final da lista.

Por isso o nome:

> **Bubble Sort — Ordenação por Bolha**

### Características

```text
Compara elementos vizinhos
        ↓
Realiza trocas
        ↓
Maior elemento vai para o final
```

Complexidade típica:

```text
O(n²)
```

---

# 🎯 24. Selection Sort

O Selection Sort funciona procurando o menor elemento da parte ainda não ordenada.

Exemplo:

```text
[7, 4, 2, 8]
```

Procura o menor:

```text
2
```

Troca com o primeiro elemento:

```text
[2, 4, 7, 8]
```

Depois procura o menor da região:

```text
[4, 7, 8]
```

O menor é:

```text
4
```

Ele já está na posição correta.

O processo continua até a lista estar ordenada.

### Ideia principal

```text
Procura o menor
      ↓
Coloca no início
      ↓
Procura o próximo menor
      ↓
Repete
```

Complexidade:

```text
O(n²)
```

---

# 🃏 25. Insertion Sort

O Insertion Sort funciona de maneira semelhante a organizar cartas na mão.

Imagine:

```text
5 8 3
```

Temos inicialmente:

```text
[5, 8]
```

Chega o número:

```text
3
```

Comparamos:

```text
3 < 8 → Sim

3 < 5 → Sim
```

Então colocamos o `3` antes dos demais:

```text
[3, 5, 8]
```

### Ideia principal

```text
Pega um elemento
       ↓
Procura sua posição correta
       ↓
Insere o elemento
```

Complexidade no pior caso:

```text
O(n²)
```

Porém é bastante eficiente para:

- Listas pequenas;
- Listas quase ordenadas.

---

# ↔️ 26. Cocktail Sort

O Cocktail Sort é uma variação do Bubble Sort.

Enquanto o Bubble normalmente percorre a estrutura apenas em uma direção, o Cocktail percorre:

```text
Esquerda → Direita
```

e depois:

```text
Direita → Esquerda
```

Exemplo:

```text
→ → → → →

← ← ← ← ←
```

Por isso também pode ser chamado de:

> **Bubble Sort bidirecional**

Complexidade típica:

```text
O(n²)
```

---

# 🪮 27. Comb Sort

O Comb Sort é uma melhoria do Bubble Sort.

No Bubble Sort, normalmente comparamos elementos vizinhos:

```text
Gap = 1
```

No Comb Sort, inicialmente utilizamos uma distância maior:

```text
Gap > 1
```

Exemplo:

```text
[8, 4, 2, 7, 1, 3]

↑        ↑
```

Elementos distantes podem ser comparados.

A distância vai diminuindo:

```text
Gap grande
    ↓
Gap menor
    ↓
Gap menor
    ↓
Gap = 1
```

Quando chega a `1`, o comportamento fica semelhante ao Bubble Sort.

---

# 📚 28. Estrutura Previamente Ordenada

Saber se uma estrutura já está ordenada pode mudar bastante a escolha do algoritmo.

Exemplo:

```text
[1, 2, 3, 4, 5, 6, 7]
```

Alguns algoritmos conseguem aproveitar essa situação.

---

## Insertion Sort

Em uma lista quase ordenada:

```text
[1, 2, 3, 5, 4, 6, 7]
```

o Insertion Sort pode ser bastante eficiente.

---

## Bubble Sort Otimizado

Em uma implementação otimizada do Bubble Sort, podemos utilizar uma variável:

```java
boolean houveTroca = false;
```

Se nenhuma troca acontecer durante uma passagem:

```text
houveTroca = false
```

significa que:

> A lista já está ordenada.

Então o algoritmo pode encerrar antecipadamente.

---

# 🔍 29. Pesquisa Sequencial

Também chamada de:

> **Pesquisa Linear**

Não exige que a estrutura esteja ordenada.

Exemplo:

```text
[21, 4, 17, 9, 30]
```

Pesquisar:

```text
9
```

Processo:

```text
21 ❌
4  ❌
17 ❌
9  ✅
```

---

## Melhor caso

Se o elemento pesquisado for o primeiro:

```text
[9, 21, 4, 17, 30]
 ↑
```

é necessária apenas uma comparação.

Complexidade:

```text
O(1)
```

---

## Pior caso

Se o elemento estiver no final ou não existir:

```text
O(n)
```

pode ser necessário percorrer todos os elementos.

---

# 🔎 30. Pesquisa Binária

A pesquisa binária é muito mais eficiente para estruturas grandes.

Porém existe uma condição fundamental:

> **A estrutura deve estar previamente ordenada.**

Exemplo:

```text
[1, 4, 8, 12, 17, 25, 30]
```

Pesquisar:

```text
25
```

Primeiro encontramos aproximadamente o meio:

```text
12
```

Como:

```text
25 > 12
```

podemos eliminar:

```text
[1, 4, 8, 12]
```

Restando:

```text
[17, 25, 30]
```

O processo continua até encontrar o elemento.

Complexidade:

```text
O(log n)
```

---

# ⚔️ 31. Pesquisa Linear x Pesquisa Binária

| Característica | Pesquisa Linear | Pesquisa Binária |
|---|---|---|
| Estrutura precisa estar ordenada? | Não | Sim |
| Melhor caso | `O(1)` | `O(1)` |
| Pior caso | `O(n)` | `O(log n)` |
| Implementação | Simples | Um pouco mais elaborada |
| Grandes estruturas | Menos eficiente | Muito eficiente |

---

# 🔢 32. Exemplo com 1 Milhão de Elementos

Considere uma estrutura com:

```text
1.000.000 de elementos
```

---

## Pesquisa Linear

No pior caso pode precisar de aproximadamente:

```text
1.000.000 de comparações
```

---

## Pesquisa Binária

A quantidade aproximada seria:

```text
log₂(1.000.000) ≈ 20
```

Ou seja:

```text
Pesquisa Linear:
~1.000.000 comparações

Pesquisa Binária:
~20 comparações
```

A diferença é enorme.

---

# ❓ 33. Qual é o Melhor Método?

Não existe um único algoritmo que seja o melhor para todas as situações.

A escolha depende de vários fatores:

```text
Tamanho da estrutura
        +
Estrutura ordenada ou não
        +
Memória disponível
        +
Complexidade
        +
Quantidade de pesquisas
        +
Necessidade de estabilidade
        +
Características dos dados
```

---

# 📦 34. Estruturas Pequenas

Para uma estrutura com poucos elementos:

```text
10 elementos
```

um algoritmo simples como Bubble Sort pode ser suficiente.

Sua simplicidade pode ser mais importante do que diferenças mínimas de desempenho.

---

# 📦 35. Estruturas Grandes

Agora imagine:

```text
10.000.000 de elementos
```

Um algoritmo:

```text
O(n²)
```

pode apresentar desempenho muito ruim.

Nesse caso, algoritmos próximos de:

```text
O(n log n)
```

normalmente são mais adequados.

---

# 🔍 36. Escolhendo um Método de Pesquisa

Considere uma lista desordenada:

```text
[34, 5, 19, 2, 81]
```

A pesquisa linear pode ser utilizada diretamente:

```text
O(n)
```

A pesquisa binária não pode ser aplicada imediatamente porque exige dados ordenados.

Primeiro seria necessário transformar:

```text
[34, 5, 19, 2, 81]
```

em:

```text
[2, 5, 19, 34, 81]
```

Somente depois seria possível utilizar a pesquisa binária.

---

# 🤔 37. Vale a Pena Ordenar Antes de Pesquisar?

Depende da quantidade de pesquisas.

---

## Apenas uma pesquisa

Imagine:

```text
1.000.000 de elementos desordenados
```

e precisamos realizar:

```text
1 pesquisa
```

Talvez seja melhor utilizar:

> **Pesquisa Linear**

porque ordenar toda a estrutura antes pode custar mais do que realizar apenas uma pesquisa.

---

## Muitas pesquisas

Agora imagine:

```text
1.000.000 de elementos
```

e:

```text
10.000 pesquisas
```

Pode ser vantajoso:

```text
Ordenar uma vez
      ↓
Utilizar pesquisa binária
      ↓
Utilizar pesquisa binária
      ↓
Utilizar pesquisa binária
      ↓
...
```

Assim, o custo inicial da ordenação pode ser compensado pelas pesquisas seguintes.

---

# 📝 38. Questões Conceituais Importantes

## Qual a diferença entre pesquisa e ordenação?

**Ordenação** organiza os elementos de uma estrutura.

**Pesquisa** procura determinado elemento dentro de uma estrutura.

---

## Qual a diferença entre memória principal e secundária?

**Memória principal:**

- RAM;
- Mais rápida;
- Temporária;
- Menor capacidade.

**Memória secundária:**

- HD;
- SSD;
- Arquivos;
- Mais lenta;
- Maior capacidade;
- Armazenamento permanente.

---

## O que Big O representa?

Big O representa:

> O crescimento do custo computacional de um algoritmo conforme o tamanho da entrada aumenta.

---

## O que é um algoritmo estável?

É um algoritmo que:

> Mantém a ordem relativa dos elementos que possuem a mesma chave de ordenação.

---

# 🧠 39. Resumo Rápido

## Ordenação

```text
Ordenação
    ↓
Organizar os dados
```

---

## Pesquisa

```text
Pesquisa
    ↓
Encontrar dados
```

---

## Memória Principal

```text
Memória Principal
        ↓
       RAM
        ↓
Mais rápida
```

---

## Memória Secundária

```text
Memória Secundária
        ↓
   HD / SSD / Arquivos
        ↓
Mais lenta
```

---

## Pesquisa Linear

```text
Pesquisa Linear
       ↓
Não precisa estar ordenada
       ↓
O(n)
```

---

## Pesquisa Binária

```text
Pesquisa Binária
       ↓
PRECISA estar ordenada
       ↓
O(log n)
```

---

## Bubble Sort

```text
Bubble Sort
      ↓
Compara vizinhos
      ↓
Realiza trocas
      ↓
O(n²)
```

---

## Selection Sort

```text
Selection Sort
       ↓
Procura o menor
       ↓
Coloca na posição correta
       ↓
O(n²)
```

---

## Insertion Sort

```text
Insertion Sort
       ↓
Insere na posição correta
       ↓
O(n²) no pior caso
       ↓
Bom para listas quase ordenadas
```

---

## Estabilidade

```text
Algoritmo estável
       ↓
Preserva a ordem relativa
       ↓
Elementos com a mesma chave
```

---

# 🏆 40. O Que Mais Vale Decorar para a Prova

```text
O(1)
↓
Constante
```

```text
O(log n)
↓
Pesquisa binária
↓
Muito eficiente
```

```text
O(n)
↓
Pesquisa linear
```

```text
O(n log n)
↓
Algoritmos eficientes de ordenação
↓
Merge Sort / Quick Sort médio
```

```text
O(n²)
↓
Bubble
Selection
Insertion no pior caso
Cocktail
```

---

# ⚠️ Pegadinhas Importantes

## 1. Pesquisa Binária

Não esqueça:

> **Pesquisa binária exige uma estrutura ordenada.**

---

## 2. Estabilidade

Não significa que a lista nunca fica temporariamente fora de ordem.

Significa:

> Elementos com a mesma chave mantêm sua ordem relativa.

---

## 3. Complexidade Fatorial

Correto:

```text
O(n!)
```

Incorreto:

```text
O(!n)
```

---

## 4. Melhor Algoritmo

Não existe um algoritmo universalmente melhor.

A resposta correta geralmente começa com:

> **Depende das características do problema.**

É necessário considerar:

- Quantidade de elementos;
- Estado inicial dos dados;
- Memória disponível;
- Quantidade de pesquisas;
- Complexidade;
- Necessidade de estabilidade.

---

# 📝 41. Mini Simulado

## Questão 1

Qual é a principal diferença entre ordenação e pesquisa?

---

## Questão 2

Qual memória é normalmente utilizada por arrays e listas durante a execução de um programa?

- A) Memória secundária
- B) Memória principal
- C) HD
- D) Banco de dados

---

## Questão 3

Qual algoritmo exige que os dados estejam previamente ordenados?

- A) Pesquisa Linear
- B) Pesquisa Sequencial
- C) Pesquisa Binária
- D) Bubble Sort

---

## Questão 4

A complexidade da pesquisa binária é:

- A) `O(n²)`
- B) `O(n)`
- C) `O(log n)`
- D) `O(n!)`

---

## Questão 5

A pesquisa linear possui no pior caso:

- A) `O(1)`
- B) `O(log n)`
- C) `O(n)`
- D) `O(n²)`

---

## Questão 6

Bubble Sort possui normalmente complexidade:

- A) `O(log n)`
- B) `O(n)`
- C) `O(n²)`
- D) `O(n!)`

---

## Questão 7

O que significa dizer que um algoritmo de ordenação é estável?

---

## Questão 8

Qual das seguintes complexidades cresce mais rapidamente?

```text
O(log n)

O(n)

O(n²)
```

---

## Questão 9

Por que não podemos afirmar que existe um único melhor algoritmo de ordenação?

---

## Questão 10

Uma lista possui 5 milhões de elementos, já está ordenada e serão realizadas milhares de pesquisas.

Entre pesquisa linear e pesquisa binária, qual seria a melhor escolha?

Explique.

---

# ✅ 42. Gabarito

## Questão 1

Ordenação organiza os dados, enquanto pesquisa procura determinado dado.

---

## Questão 2

```text
B — Memória principal
```

---

## Questão 3

```text
C — Pesquisa Binária
```

---

## Questão 4

```text
C — O(log n)
```

---

## Questão 5

```text
C — O(n)
```

---

## Questão 6

```text
C — O(n²)
```

---

## Questão 7

Um algoritmo estável preserva a ordem relativa dos elementos que possuem a mesma chave de ordenação.

---

## Questão 8

```text
O(n²)
```

---

## Questão 9

Porque a escolha depende de fatores como:

- Tamanho da estrutura;
- Estado inicial dos dados;
- Memória disponível;
- Complexidade;
- Necessidade de estabilidade;
- Quantidade de operações que serão realizadas.

---

## Questão 10

A melhor escolha seria a:

```text
Pesquisa Binária
```

Porque:

- A estrutura já está ordenada;
- Serão realizadas muitas pesquisas;
- A pesquisa binária possui complexidade `O(log n)`;
- É muito mais eficiente para grandes estruturas ordenadas.

---

# 🎯 Revisão Final

Antes da prova, lembre principalmente destas relações:

| Conceito | Informação principal |
|---|---|
| Ordenação | Organiza os dados |
| Pesquisa | Encontra dados |
| Memória principal | RAM |
| Memória secundária | HD / SSD / arquivos |
| Pesquisa Linear | `O(n)` |
| Pesquisa Binária | `O(log n)` |
| Pesquisa Binária | Exige estrutura ordenada |
| Bubble Sort | Compara vizinhos |
| Selection Sort | Procura o menor |
| Insertion Sort | Insere na posição correta |
| Bubble Sort | `O(n²)` |
| Selection Sort | `O(n²)` |
| Insertion Sort | `O(n²)` no pior caso |
| Merge Sort | `O(n log n)` |
| Algoritmo estável | Mantém ordem relativa de chaves iguais |
| Melhor algoritmo | Depende do problema |

---

# 📖 Ordem Recomendada de Estudo

Para revisar antes da prova:

1. **Big O e complexidade**
2. **Pesquisa Linear**
3. **Pesquisa Binária**
4. **Diferenças entre Linear e Binária**
5. **Bubble Sort**
6. **Selection Sort**
7. **Insertion Sort**
8. **Cocktail e Comb Sort**
9. **Estabilidade**
10. **Memória principal e secundária**
11. **Critérios para escolher um algoritmo**

---

> **Dica:** não tente apenas decorar os algoritmos. Procure entender qual problema cada algoritmo resolve, como ele funciona e em quais situações ele é uma boa ou má escolha.
