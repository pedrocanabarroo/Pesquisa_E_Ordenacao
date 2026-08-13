# Algoritmos Simples - Altos em complexidade
- bolha - simples [O(n²)] - estável
  parte ordenada está no final da estrutura
  a ideia da bolha é pq o maior valor está em cada "passada" é levado até o final da estrutura.
- seleção - simples [O(n²)] - instável
  parte ordenada está no início da estrutura
  a ideia da seleção é pq a cada célula do vetor, ao avançar, se seleciona (ou laça) o menor valor para aquela posição.
- inserção - simples [O(n²)] - estável
  parte ordenada está no início da estrutura
  a ideia do inserção é pq cada valor da porção da direita da estrutura é inserido na sua posição correta no porção da esquerda.

  todos esses métodos rodam na memória ram


### Qual melhor algoritmo de ordenação?
- Depende
  - Tamanho
  - Grau de Ordenação
## MVC
- <<package>> Model
  - utilidades
  - popular.Lista(...)
- <<package>>  View
  - ListaView
  - exibirLista(...)
  - exibirTempo(...)
- <<package>> Controller
  - ListaController
  - listaBolha
  - listaSelecao
  - listaInsercao
  - popularListaBolha
  - popularListaSelecao
  - popularListaInsercao
  - ?.bolha(listaBolha)
  - ?.selecao(listaSelecao)
  - ?.insercao(listaInsercao)
- Classe Ordenada (ficará onde?? Controller ou Model)
  - bolha(...)
  - selecao(...)
  - insercao(...)
