package estudos.exercicios.Sintaxe;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
    //Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

        Scanner input = new Scanner(System.in);
        double numeroQualquer, numeroReajustado;

        System.out.println("Informe um número qualquer:");
        numeroQualquer = input.nextDouble();
        numeroReajustado = (numeroQualquer * 0.05) + numeroQualquer;
        System.out.println("O número informado com um ajuse de 5% é igual a " + numeroReajustado);

    }
}
