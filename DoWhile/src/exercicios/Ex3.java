
package exercicios;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
        
        int soma = 0;
        int contador = 0;
        int numero;
        
        do {
            System.out.print("Insira um número inteiro positivo (ou um número negativo para sair): ");
            numero = ler.nextInt();
            
            if(numero >= 0) {
                soma += numero;
                contador++;
            }
            
        } while(numero >= 0);
        
        if(contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média dos números inseridos é: " + media);
        } else {
            System.out.println("Nenhum número válido foi inserido.");
        }

    }
}
