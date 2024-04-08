
package exercicios;
import java.util.Scanner;

/**
 *Exercício 5
 * Data: 01/04/2024
 * @author: Layla Glicério
 * Disciplina: Linguagem Orientada a Objeto
 * Matéria: Estruturas de Repetição (While) 
 * Atividade: Crie um programa que solicite ao usuário digitar uma palavra e, 
 *             em seguida, imprima cada letra dessa palavra separadamente em 
 *             linhas diferentes usando um loop `while`
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        
        System.out.println("Digite uma palavra:"); 
        String palavra = ler.nextLine(); 
        
        for (int i = 0; i < palavra.length(); i++) { 
            System.out.println(palavra.charAt(i)); 
        }
        
       
    }
}
    
