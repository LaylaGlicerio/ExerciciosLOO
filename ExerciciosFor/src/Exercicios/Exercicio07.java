package Exercicios;

/**
 *Exercício 7
 * @author: Layla Glicério
 * Disciplina: Linguagem Orientada a Objeto
 * Matéria: Estrutura de Controle de Fluxo
 * Atividade: Imprima os primeiros 10 números da sequência de Fibonacci.
 */

public class Exercicio07 {
    public static void main(String[] args) {
        
        int n = 10;
        int T1 = 0;
        int T2 = 1;
        
        for (int i = 1; i<=n; i++){
            System.out.println(T1);
            
            int TF = T1 + T2;
            T1 = T2;
            T2 = TF;
        }
    }
}
