package exercicios;
import java.util.Scanner;

/**
 *Exercício 2
 * Data: 26/03/2024
 * @author: Layla Glicério
 * Disciplina: Linguagem Orientada a Objeto
 * Matéria: Estruturas de Repetição (While) 
 * Atividade: Crie um programa que solicite ao usuário digitar um número e, em seguida, imprima 
 *                 todos os números de 1 até esse número usando um loop `while`
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         
        System.out.println("Informe um número inteiro: ");
        int num = ler.nextInt();
         
        int x = 0;
        while (x <= num){
            System.out.println(x);
            x = x+1;
        }
    }
}

