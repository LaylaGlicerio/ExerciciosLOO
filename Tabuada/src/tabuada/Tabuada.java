package tabuada;

import java.util.Scanner;

/**
 *Exercício Avaliativo
 * Data: 26/04/2024
 * @author: Layla Glicério
 * Disciplina: Linguagem Orientada a Objeto 
 * Atividade: Criar um programa que faça a tabela tabuada de um determinado número digitado. 
 *           - Deve usar a estrutura Do-While
 *           - Deve usar a estrutura While
 *           - Deve mesclar com o switch case
 */
public class Tabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual estrutura você deseja usar?");
        System.out.println("1. Do-While");
        System.out.println("2. While");
        System.out.println("Opção:");
        int escolha = ler.nextInt();
        
        switch (escolha){
            
            case 1:
                System.out.println("Digite o número da tabuada que deseja conhecer:");
                int numTab = ler.nextInt();
                
                int i = 1;
                while (i <= 10){
                    System.out.println( numTab + "x" + i + "="+ (numTab * i));
                    i++;
                }
                break;
                
            case 2:
                System.out.println("Digite o número a tabuada que deseja conhecer:");
                int numTab2 = ler.nextInt();
                
                int cont = 1;
                
                do{
                     System.out.println( numTab2 + "x" + cont + "="+ (numTab2 * cont));
                     cont++;
                     
                }while( cont <= 10 );
                
                break;
                
            default:
                System.out.println("Opção Inválida!");
     
    }
    }
    }
    
