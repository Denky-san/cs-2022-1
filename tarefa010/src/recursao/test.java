package recursao;

import recursao.MSInterativo;
import recursao.MSRecursivo;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random gerador = new Random();
        long startTime;

        MSRecursivo recursivo = new MSRecursivo();
        MSInterativo interativo = new MSInterativo();

        /*100 numeros*/
        int vetor100rec[] = new int[100];
        int vetor100int[] = new int[100];
        int tamanho1 = vetor100int.length;

        for (int i = 0; i < tamanho1; i++) {
            vetor100int[i] = gerador.nextInt(100);
            vetor100rec[i] = vetor100int[i];
        }

        startTime = System.currentTimeMillis();
        interativo.mergeSort(vetor100int);
        System.out.println("\nO tempo para executar a ordenacao de 100 numeros com merge interativo eh: " + startTime);

        startTime = System.currentTimeMillis();
        recursivo.mergeSort(vetor100rec, 0, tamanho1 - 1);
        System.out.println("O tempo para executar a ordenacao de 100 numeros com merge recursivo eh: " + startTime);

        /*1000 numeros*/
        int vetor1000rec[] = new int[1000];
        int vetor1000int[] = new int[1000];
        int tamanho2 = vetor1000rec.length;

        for (int i = 0; i < tamanho2; i++) {
            vetor1000rec[i] = gerador.nextInt(1000);
            vetor1000int[i] = vetor1000rec[i];
        }

        startTime = System.currentTimeMillis();
        interativo.mergeSort(vetor1000int);
        System.out.println("\nO tempo para executar a ordenacao de 1000 numeros com merge interativo eh: " + startTime);

        startTime = System.currentTimeMillis();
        recursivo.mergeSort(vetor1000rec, 0, tamanho2 - 1);
        System.out.println("O tempo para executar a ordenacao de 1000 numeros com merge recursivo eh: " + startTime);

        /*10000 numeros*/

        int vetor10000rec[] = new int[10000];
        int vetor10000int[] = new int[10000];
        int tamanho3 = vetor10000rec.length;

        for (int i = 0; i < tamanho3; i++) {
            vetor10000rec[i] = gerador.nextInt(10000);
            vetor10000int[i] = vetor10000rec[i];
        }

        startTime = System.currentTimeMillis();
        interativo.mergeSort(vetor10000int);
        System.out.println("\nO tempo para executar a ordenacao de 10.000 numeros com merge interativo eh: " + startTime);

        startTime = System.currentTimeMillis();
        recursivo.mergeSort(vetor10000rec, 0, tamanho3 - 1);
        System.out.println("O tempo para executar a ordenacao de 10.000 numeros com merge recursivo eh: " + startTime);

    }


}
