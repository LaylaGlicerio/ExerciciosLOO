
package exercicios;
import java.util.Scanner;

/**
 *Exercício 4
 * Data: 01/04/2024
 * @author: Layla Glicério
 * Disciplina: Linguagem Orientada a Objeto
 * Matéria: Estruturas de Repetição (While) 
 * Atividade: Escreva um programa que peça ao usuário para adivinhar um número entre 1 e 100 
 *             e dê dicas sobre se o número é maior ou menor, usando um loop `while` até que 
 *             o usuário adivinhe corretamente.
 */
public class Ex4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int num = 44;
        int tentativa = 0;
        
        System.out.println("Tente adivinhar o número entre 1 e 100:");
        System.out.println("DICA: è um número par!");

        while (tentativa != num) {
            System.out.print("Digite seu palpite: ");
            tentativa = ler.nextInt();

            if (tentativa < num) {
                System.out.println("O número é maior.");
            } else if (tentativa > num) {
                System.out.println("O número é menor.");
            }
        }

        System.out.println("Parabéns! Você acertou o número.");

   
    }
}
        
   

