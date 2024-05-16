package estudos.exercicios.Sintaxe;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
        Scanner reader = new Scanner(System.in);

        int number;

        System.out.println("Enter a number:");
        number = reader.nextInt();

        if (number % 2 == 0) {
            System.out.println("the number is even");
        }else {
            System.out.println("the number is odd");
        }

    }
}
