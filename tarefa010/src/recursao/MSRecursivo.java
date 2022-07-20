package recursao;

public class MSRecursivo {

    void merge(int valor[], int inicio, int meio, int fim) {
        int i, j, k;
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;
        int esquerda[] = new int[n1];
        int direita[] = new int[n2];

        for (i = 0; i < n1; i++){
            esquerda[i] = valor[inicio + i];
        }

        for (j = 0; j < n2; j++){
            direita[j] = valor[meio + 1 + j];
        }
        k = inicio; j = 0; i = 0;

        while (i < n1 && j < n2){
            if(esquerda[i] <= direita[j]) {
                valor[k] = esquerda[i];
                i++;
            } else {
                valor[k] = direita[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            valor[k] = esquerda[i];
            i++;
            k++;
        }
        while (j<n2){
            valor[k] = direita[j];
            j++;
            k++;
        }
    }

    void mergeSort(int vetor[], int inicio, int fim)
    {
        if (inicio < fim)
        {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }
    }
}