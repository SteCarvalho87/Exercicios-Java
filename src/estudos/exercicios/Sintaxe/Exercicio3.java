package estudos.exercicios.Sintaxe;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        // Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores, caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.
        Scanner reader = new Scanner(System.in);

        int num1, num2, result;

        System.out.println("Enter the first number: ");
        num1 = reader.nextInt();
        System.out.println("Enter the second number: ");
        num2 = reader.nextInt();

        if(num1 == num2){
            result = num1 + num2;
        }else{
            result = num1 + num2;
        }

        System.out.println("the result is: " + result);
    }
}
