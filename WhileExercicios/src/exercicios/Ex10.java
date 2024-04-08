
package exercicios;
import java.util.Scanner;

/**
 *Exercício 10
 * Data: 01/04/2024
 * @author: Layla Glicério
 * Disciplina: Linguagem Orientada a Objeto
 * Matéria: Estruturas de Repetição (While) 
 * Atividade: Escreva um programa que peça ao usuário para inserir uma sequência de números inteiros, 
 *             parando apenas quando o usuário inserir um zero. Em seguida, o programa deve calcular 
 *             e imprimir a soma dos números inseridos usando um loop `while`.
 */

public class Ex10 {
    public static void main(String[] args) {
          Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira uma sequência de números inteiros (insira 0 para parar):");
        
        int numero;
        int soma = 0;
        
        while (true) {
            numero = ler.nextInt();
            
            if (numero == 0) {
                break;
            }
            
            soma += numero;
        }
        
        System.out.println("A soma dos números inseridos é: " + soma);
    }
}
