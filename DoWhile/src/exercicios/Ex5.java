
package exercicios;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numero;
        int soma = 0;
        
        do {
            System.out.print("Insira um número inteiro (insira 0 para parar): ");
            numero = ler.nextInt();
            
            soma += numero;
        } while (numero != 0);
        
        System.out.println("A soma dos números é: " + soma);
    }
 
}
