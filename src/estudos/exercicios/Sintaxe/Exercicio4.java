package estudos.exercicios.Sintaxe;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        //Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
        Scanner reader = new Scanner(System.in);

        int num;

        System.out.println("Enter a number: ");
        num = reader.nextInt();

        System.out.println("The predecessor of "+ num + " is " + (num-1));
        System.out.println("The successor of "+ num + " is " + (num+1));
    }
}
