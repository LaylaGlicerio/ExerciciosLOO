
package Exercicios;

import java.util.Scanner;

/**
 *Exercício 9
 * @author: Layla Glicério
 * Disciplina: Linguagem Orientada a Objeto
 * Matéria: Estrutura de Controle de Fluxo
 * Atividade: Peça o usuário que digite um número e Imprima a tabuada dele até 10.
 */
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        
        System.out.println("Digite um número para ver a tabuada dela até 10:");
        int escolha = ler.nextInt();
        
        
        for (int i =1; i<=10; i++) {
            int resultado = escolha * i;
            System.out.println(escolha + " X " + i + " = " + resultado);
        }
        
    }
}
