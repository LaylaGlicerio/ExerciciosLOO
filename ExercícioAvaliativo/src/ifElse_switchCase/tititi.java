
package ifElse_switchCase;

import java.util.Scanner;

public class tititi {
    public static void main(String[] args) {
        int num;
        Scanner ler= new Scanner(System.in);
        
        do{
            System.out.println("Digite um número positivo:");
            num = ler.nextInt();
        }while (num<= 0);
                System.out.println("Você digitou um num positivo");
    }
    
}
