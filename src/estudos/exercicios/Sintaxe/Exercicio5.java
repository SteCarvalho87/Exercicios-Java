package estudos.exercicios.Sintaxe;

public class Exercicio5 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

        double employeeSalary = 5650.00;
        double minWage = 1293.20;
        double amountWages;

        amountWages = employeeSalary / minWage;
        System.out.printf("The employee receives %.2f minimum wages%n", amountWages);
    }
}
