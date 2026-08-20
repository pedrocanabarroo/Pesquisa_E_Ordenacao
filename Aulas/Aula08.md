bolha - agitação (estáveis)
seleção (instável)
inserção (estável)

pente - (comb sort)
    - uso da distancia - variável de comparação de valores
    - instável


void pente (List<int> lista){
    int i, tmp, dist = list.size();
    bool houveTroca;

    do{
        dist = (int) dist/1.3;
        if(dist < 1){
            dist = 1;
        }
        houveTroca = false;

        for (i = 0; i + dist < lista.size(); i++){
            if(lista[i] > lista [i+dist]){
                houveTroca = True;
                tmp = lista[i];
                lista[j] = lista[i+dist]
                lista[i+dist] = tmp
            }
        }
    }
    while (dist > 1 || houveTroca)
}


class Processo{
    int id;
    Date data;

    1525 - 20/08/2026
    1347 - 29/08/2026
    1440 - 20/08/2026
}

1) como ordenar uma lista por alguma chave do objeto
2) como ordenar por data e id na segunda chave
