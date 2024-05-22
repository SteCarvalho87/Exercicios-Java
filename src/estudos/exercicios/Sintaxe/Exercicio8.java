package estudos.exercicios.Sintaxe;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1, numero2, numero3;
        int maiorNumero, meioNumero, menorNUmero;

        System.out.println("Informe o primeiro numero: ");
        numero1 = input.nextInt();
        System.out.println("Informe o segundo numero: ");
        numero2 = input.nextInt();
        System.out.println("Informe o terceiro numero: ");
        numero3 = input.nextInt();

        if (numero1 >= numero2 && numero1 >= numero3) {
            maiorNumero = numero1;
            if (numero2 >= numero3) {
                meioNumero = numero2;
                menorNUmero = numero3;
            }else{
                meioNumero = numero3;
                menorNUmero = numero2;
            }

        }else if (numero2 >= numero1 && numero2 >= numero3) {
            maiorNumero = numero2;
            if (numero1 >= numero3) {
                meioNumero = numero1;
                menorNUmero = numero3;
            }else{
                meioNumero = numero3;
                menorNUmero = numero1;
            }

        }else{
            maiorNumero = numero3;
            if (numero1 >= numero2) {
                meioNumero = numero1;
                menorNUmero = numero2;
            }else{
                meioNumero = numero2;
                menorNUmero = numero1;
            }
        }
        System.out.println(maiorNumero);
        System.out.println(meioNumero);
        System.out.println(menorNUmero);
    }
}