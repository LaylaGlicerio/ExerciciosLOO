
package exercicios;

import java.util.Scanner;

/**
 *Exercício 9
 * Data: 01/04/2024
 * @author: Layla Glicério
 * Disciplina: Linguagem Orientada a Objeto
 * Matéria: Estruturas de Repetição (While) 
 * Atividade: Desenvolva um programa que solicite ao usuário digitar uma palavra e, 
 *             em seguida, imprima essa palavra de trás para frente usando um loop `while`. 
 */

public class Ex9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        
        System.out.print("Digite uma palavra: ");
        String palavra = ler.nextLine();
        
        
        String palavraInvertida = "";
        
        
        int indice = palavra.length() - 1;
        
        
        while (indice >= 0) {
            palavraInvertida += palavra.charAt(indice);
            indice--;
        }
        
       
        System.out.println("A palavra invertida é: " + palavraInvertida);
    }
}
