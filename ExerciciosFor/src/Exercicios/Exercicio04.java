package Exercicios;

/**
 *Exercício 4
 * @author: Layla Glicério
 * Disciplina: Linguagem Orientada a Objeto
 * Matéria: Estrutura de Controle de Fluxo
 * Atividade: Calcule a soma dos números de 1 a 100.
 */

public class Exercicio04 {
    public static void main(String[] args) {
        
        int soma = 0;
        
        for (int i = 1; i <= 100; i++) {
        soma +=i;
        }
        System.out.println(soma);
        }
    }

