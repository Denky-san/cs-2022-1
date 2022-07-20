package recursao;

public class MSInterativo {
    void merge(int vetor[], int inicio, int meio, int fim) {

        int trocar[] = new int[fim - inicio];
        int i = inicio;
        int j = meio;
        int k = 0;

        while(i < meio && j < fim) {

            if(vetor[i] <= vetor[j]) {
                trocar[k] = vetor[i];
                k++;
                i++;

            } else {
                trocar[k] = vetor[j];
                k++;
                j++;
            }
        }

        while(i < meio) {
            trocar[k] = vetor[i];
            k++;
            i++;
        }

        while(j < fim) {
            trocar[k] = vetor[j];
            k++;
            j++;
        }
        i = inicio;
        for(k = 0 ; i < fim; k++) {
            vetor[i] = trocar[k];
            i++;
        }
    }

    void mergeSort(int vetor[]) {

        int elementos = 1;
        int inicio;
        int meio;
        int fim;

        while(elementos < vetor.length) {

            inicio = 0;
            while(inicio + elementos < vetor.length) {
                meio = inicio + elementos;
                fim = inicio + 2 * elementos;

                if(fim > vetor.length){
                    fim = vetor.length;
                }

                merge(vetor, inicio, meio, fim);
                inicio = fim;
            }
            elementos = elementos * 2;
        }
    }
}
