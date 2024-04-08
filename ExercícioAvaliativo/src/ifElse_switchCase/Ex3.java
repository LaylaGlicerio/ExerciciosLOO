package ifElse_switchCase;

import java.util.Scanner;
/*

Programa: Calculadora onde tem entrada de dois números a pessoa pode escolher a operação que deseja e 
          é retornado o resultado e se o valor é ímpar ou ´par

Autora: Layla Glicério
Aula: LOO
Matéria: Switch Case e If Else
Professor: Leonardo
*/
public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Digite a operação (+, -, *, /):");
        char operador = scanner.next().charAt(0);

        double resultado = 0;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
                
            case '-':
                resultado = num1 - num2;
                break;
                
            case '*':
                resultado = num1 * num2;
                break;
                
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    return;
                }
                break;
                
            default:
                System.out.println("Operador inválido!");
                return;
        }

        System.out.println("O resultado é: " + resultado);

        if (resultado % 2 == 0) {
            System.out.println(resultado + " É um número par.");
        } else {
            System.out.println(resultado + " É um número ímpar.");
        }
    }
}

