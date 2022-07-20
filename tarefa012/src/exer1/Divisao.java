package exer1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

    public static int dividir(int dividendo, int divisor){
        return dividendo/divisor;
    }

    public static void main(String[] args) {

        int dividendo;
        int divisor;

        Scanner s = new Scanner( System.in );

        try{
            System.out.println( "Dividendo: ");
            dividendo = s.nextInt();

            System.out.println( "Divisor: ");
            divisor = s.nextInt();

            System.out.println("Resultado: " + dividir(dividendo,divisor));

        }catch (ArithmeticException arithmeticException){
            System.out.println("Não é possivel fazer uma divisão por 0");

        } catch (InputMismatchException inputMismatchException){
            System.out.println("Só é possivel a divisão de numeros");
        }

    }
}