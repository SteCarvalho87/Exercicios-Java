package estudos.exercicios.Sintaxe;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //1. Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

        Scanner reader = new Scanner(System.in);

        int A, B, C, sum;

        System.out.println("Enter the number A");
        A = reader.nextInt();
        System.out.println("Enter the number B");
        B = reader.nextInt();
        System.out.println("Enter the number C");
        C = reader.nextInt();

        sum = A + B;
        System.out.println("The sum of the numbers A and B is: " + sum);

        if (sum > C){
            System.out.println("The sum of A + B is greater than C");
        }else{
            System.out.println("The sum of A + B isn't greater than C");
        }
    }
}