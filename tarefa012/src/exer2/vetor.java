package exer2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class vetor {

    public static void main(String[] args) {
        int vetor[] = new int[10];
        int valor;
        int i = 0;
        Scanner s = new Scanner( System.in );

        try{
            System.out.println("Digite os valores:");
            valor = s.nextInt();

            while(valor != 0){
                vetor[i] = valor;
                valor = s.nextInt();

                i++;
            }

        }catch (ArrayIndexOutOfBoundsException aibe){
            System.out.println("Tamanho do vetor excedido.");

        } catch (InputMismatchException inputMismatchException){
            System.out.println("Só é digitar numeros");
        }

    }
}