
package exercicios;
import java.util.Scanner;

/**
 *Exercício 7
 * Data: 01/04/2024
 * @author: Layla Glicério
 * Disciplina: Linguagem Orientada a Objeto
 * Matéria: Estruturas de Repetição (While) 
 * Atividade: Escreva um programa que peça ao usuário para inserir números inteiros positivos indefinidamente, 
 *            parando apenas quando o usuário inserir um número negativo. Em seguida, o programa deve calcular  
 *            e imprimir a média dos números inseridos usando um loop `while`. 
 */

public class Ex7 {
    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
        
        int soma = 0;
        int contador = 0;
        int numero;

        while ((numero = ler.nextInt()) >= 0) {
            soma += numero;
            contador++;
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média dos números inseridos é: " + media);
        } else {
            System.out.println("Nenhum número positivo foi inserido.");
        }
    }
}
