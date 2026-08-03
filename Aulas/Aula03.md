Aula direcionada para pesquisa dos métodos de ordenação

# Métodos de Ordenação

## 1. Bubble Sort (Ordenação por Bolha)

### Conceito
O **Bubble Sort** é um dos algoritmos de ordenação mais simples. Ele percorre repetidamente o vetor comparando elementos adjacentes e trocando suas posições quando estão fora de ordem. A cada passagem, o maior elemento "flutua" para o final da lista, formando gradualmente a porção ordenada.

### Características
- **Tipo de memória:** Memória interna
- **Estabilidade:** Estável
- **Complexidade:**
  - Melhor caso: **O(n)** (quando já está ordenado e há otimização)
  - Caso médio: **O(n²)**
  - Pior caso: **O(n²)**
- **Porção ordenada:** Final do vetor

### Vantagens
- Fácil implementação.
- Baixo consumo de memória.
- Preserva a ordem de elementos iguais.

### Desvantagens
- Muito lento para grandes conjuntos de dados.
- Grande quantidade de comparações e trocas.

---

# 2. Selection Sort (Ordenação por Seleção)

## Conceito
O **Selection Sort** procura o menor elemento da parte não ordenada do vetor e o coloca na primeira posição disponível da parte ordenada. Esse processo é repetido até que todos os elementos estejam ordenados.

### Características
- **Tipo de memória:** Memória interna
- **Estabilidade:** Instável
- **Complexidade:**
  - Melhor caso: **O(n²)**
  - Caso médio: **O(n²)**
  - Pior caso: **O(n²)**
- **Porção ordenada:** Início do vetor

### Vantagens
- Poucas trocas de elementos.
- Implementação simples.

### Desvantagens
- Sempre realiza o mesmo número de comparações.
- Não é eficiente para listas grandes.

---

# 3. Insertion Sort (Ordenação por Inserção)

## Conceito
O **Insertion Sort** constrói a lista ordenada inserindo cada elemento na posição correta da parte já ordenada do vetor.

### Características
- **Tipo de memória:** Memória interna
- **Estabilidade:** Estável
- **Complexidade:**
  - Melhor caso: **O(n)**
  - Caso médio: **O(n²)**
  - Pior caso: **O(n²)**
- **Porção ordenada:** Início do vetor

### Vantagens
- Excelente desempenho para listas pequenas.
- Muito eficiente quando a lista já está quase ordenada.
- Implementação simples.

### Desvantagens
- Ineficiente para listas grandes.

---

# 4. Comb Sort (Ordenação por Pente)

## Conceito
O **Comb Sort** é uma evolução do Bubble Sort. Em vez de comparar apenas elementos vizinhos, ele compara elementos separados por uma distância (*gap*). Esse intervalo diminui gradualmente até chegar a 1.

### Características
- **Tipo de memória:** Memória interna
- **Estabilidade:** Instável
- **Complexidade:**
  - Melhor caso: **O(n log n)** (aproximadamente)
  - Caso médio: **O(n² / 2^p)** (melhor que Bubble Sort)
  - Pior caso: **O(n²)**
- **Porção ordenada:** Final do vetor

### Funcionamento
- Move elementos distantes rapidamente para posições próximas da correta.
- O gap normalmente é dividido por **1,3** a cada iteração.

### Vantagens
- Mais rápido que Bubble Sort.
- Implementação simples.

### Desvantagens
- Ainda perde para algoritmos modernos.

---

# 5. Cocktail Sort (Shake Sort)

## Conceito
Também chamado de **Shake Sort** ou **Cocktail Sort**, é uma melhoria do Bubble Sort. Enquanto o Bubble percorre apenas da esquerda para a direita, o Cocktail percorre em ambos os sentidos.

### Características
- **Tipo de memória:** Memória interna
- **Estabilidade:** Estável
- **Complexidade:**
  - Melhor caso: **O(n)**
  - Caso médio: **O(n²)**
  - Pior caso: **O(n²)**
- **Porção ordenada:** Início e final simultaneamente

### Funcionamento
- Resolve melhor o problema de elementos pequenos posicionados no final da lista.
- Alterna uma passagem da esquerda para direita e outra da direita para esquerda.

### Vantagens
- Melhor que Bubble Sort em alguns cenários.

### Desvantagens
- Pouco utilizado na prática.
- Inferior a algoritmos como Quick Sort e Merge Sort.

---

# 6. Shell Sort

## Conceito
O **Shell Sort** é uma melhoria do Insertion Sort. Ele realiza inserções considerando elementos separados por intervalos (gaps), reduzindo-os até chegar a 1.

### Características
- **Tipo de memória:** Memória interna
- **Estabilidade:** Instável
- **Complexidade:**
  - Melhor caso: **O(n log n)** (depende da sequência de gaps)
  - Caso médio: Entre **O(n^1,3)** e **O(n log² n)**
  - Pior caso: **O(n²)**
- **Porção ordenada:** Vai sendo construída gradualmente.

### Vantagens
- Muito eficiente para listas médias.
- Poucas trocas.

### Desvantagens
- O desempenho depende da sequência de gaps utilizada.

---

# 7. Bucket Sort

## Conceito
O **Bucket Sort** distribui os elementos em "baldes" (buckets). Cada balde é ordenado individualmente e, ao final, todos são concatenados.

### Características
- **Tipo de memória:** Memória externa (usa memória auxiliar)
- **Estabilidade:** Pode ser estável (depende da ordenação interna)
- **Complexidade:**
  - Melhor caso: **O(n + k)**
  - Caso médio: **O(n + k)**
  - Pior caso: **O(n²)**

Onde **k** representa a quantidade de baldes.

### Vantagens
- Muito rápido para dados distribuídos uniformemente.
- Excelente para números reais.

### Desvantagens
- Requer memória adicional.
- Não funciona bem quando os dados ficam concentrados em poucos baldes.

---

# 8. Radix Sort

## Conceito
O **Radix Sort** ordena números dígito por dígito, começando normalmente pelo menos significativo (LSD).

### Características
- **Tipo de memória:** Memória externa
- **Estabilidade:** Estável
- **Complexidade:**
  - Melhor caso: **O(d(n+k))**
  - Caso médio: **O(d(n+k))**
  - Pior caso: **O(d(n+k))**

Onde:
- **d** = quantidade de dígitos
- **k** = base numérica

### Vantagens
- Extremamente rápido para números inteiros.
- Não realiza comparações entre elementos.

### Desvantagens
- Limitado a determinados tipos de dados.

---

# 9. Heap Sort

## Conceito
O **Heap Sort** utiliza uma estrutura chamada **Heap Binária** para encontrar rapidamente o maior elemento.

### Características
- **Tipo de memória:** Memória interna
- **Estabilidade:** Instável
- **Complexidade:**
  - Melhor caso: **O(n log n)**
  - Caso médio: **O(n log n)**
  - Pior caso: **O(n log n)**

### Funcionamento
- Constrói um Max Heap.
- Remove sucessivamente o maior elemento.

### Vantagens
- Complexidade garantida de O(n log n).
- Não utiliza memória extra significativa.

### Desvantagens
- Geralmente mais lento que Quick Sort na prática.

---

# 10. Merge Sort

## Conceito
O **Merge Sort** utiliza a estratégia de **Dividir para Conquistar**. Divide o vetor ao meio até restarem listas de um elemento e depois realiza as intercalações ordenadas.

### Características
- **Tipo de memória:** Memória externa
- **Estabilidade:** Estável
- **Complexidade:**
  - Melhor caso: **O(n log n)**
  - Caso médio: **O(n log n)**
  - Pior caso: **O(n log n)**

### Vantagens
- Excelente desempenho.
- Muito utilizado em aplicações profissionais.
- Mantém estabilidade.

### Desvantagens
- Necessita memória auxiliar.

---

# 11. Quick Sort

## Conceito
O **Quick Sort** escolhe um elemento chamado **pivô**, particiona o vetor em elementos menores e maiores que ele e aplica o mesmo processo recursivamente.

### Características
- **Tipo de memória:** Memória interna
- **Estabilidade:** Instável
- **Complexidade:**
  - Melhor caso: **O(n log n)**
  - Caso médio: **O(n log n)**
  - Pior caso: **O(n²)** (quando o pivô é mal escolhido)

### Funcionamento
1. Escolhe um pivô.
2. Divide o vetor.
3. Ordena recursivamente as duas partes.

### Vantagens
- Um dos algoritmos mais rápidos na prática.
- Muito utilizado em bibliotecas de programação.

### Desvantagens
- Pode degradar para O(n²) caso o pivô seja mal escolhido.

---

# Comparação Geral

| Algoritmo | Estável | Memória | Melhor Caso | Caso Médio | Pior Caso |
|-----------|----------|----------|-------------|-------------|------------|
| Bubble Sort | Sim | Interna | O(n) | O(n²) | O(n²) |
| Selection Sort | Não | Interna | O(n²) | O(n²) | O(n²) |
| Insertion Sort | Sim | Interna | O(n) | O(n²) | O(n²) |
| Comb Sort | Não | Interna | O(n log n) | Melhor que O(n²) | O(n²) |
| Cocktail Sort | Sim | Interna | O(n) | O(n²) | O(n²) |
| Shell Sort | Não | Interna | O(n log n) | ≈ O(n^1,3) | O(n²) |
| Bucket Sort | Depende | Externa | O(n+k) | O(n+k) | O(n²) |
| Radix Sort | Sim | Externa | O(d(n+k)) | O(d(n+k)) | O(d(n+k)) |
| Heap Sort | Não | Interna | O(n log n) | O(n log n) | O(n log n) |
| Merge Sort | Sim | Externa | O(n log n) | O(n log n) | O(n log n) |
| Quick Sort | Não | Interna | O(n log n) | O(n log n) | O(n²) |
