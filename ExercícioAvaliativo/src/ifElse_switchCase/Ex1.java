
package ifElse_switchCase;
import java.util.Scanner;
/*

Programa: A idéia desse programa é simular um Menu de uma Cafeteria, onde você escolhe 
              qual produto quer consumir e ele retorna o valor ao cliente

Autora: Layla Glicério
Aula: LOO
Matéria: Switch Case e If Else
Professor: Leonardo
*/

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
            int pedido;
            int cafe, cha, agua, refri;
            
            System.out.println("................."); 
            System.out.println("CAFETERIA DO SOL");
            System.out.println(".................");  
            System.out.println("");   
            System.out.println("Escolha seu pedido:");
            System.out.println("");  
            System.out.println(".....MENU.....");
            System.out.println(""); 
            System.out.println("1. Café");
            System.out.println("2. Chá");
            System.out.println("3. Água");
            System.out.println("4. Refrigerante");
            
            System.out.println("Digite um numero do pedido escolhido:");
                pedido = scanner.nextInt();
            
            
            switch (pedido){
                case 1:
                    System.out.println("Você escolheu Café, agora escolha qual Café deseja, te retornaremos o valor: ");
                    System.out.println("1. Café Tradicional");
                    System.out.println("2. Café Descafeinado");
                    System.out.println("3. Café com Leite");
                    
                    System.out.println("Digite o número do pedido escolhido:");
                    cafe = scanner.nextInt();
                    
                    if (cafe == 1) {
                    System.out.println("Você escolheu Café Tradicional, o valor é de R$2,00");
                } else if (cafe == 2) {
                    System.out.println("Você escolheu Café Descafeinado, o valor é de R$4,00");
                } else if (cafe == 3) {
                    System.out.println("Você escolheu Café com Leite, o valor é de R$3,00");
                } else {
                    System.out.println("Opção inválida.");
                }
                    break;
                case 2:
                    System.out.println("Você escolheu Chá, agora escolha qual Chá deseja, te retornaremos o valor: ");
                    System.out.println("1. Chá de Hortelã");
                    System.out.println("2. Chá de Camomila");
                    System.out.println("3. Chá de Erva Cidreira");
                    
                    System.out.println("Digite o número do pedido escolhido:");
                    cha = scanner.nextInt();
                    
                     if (cha == 1) {
                    System.out.println("Você escolheu Chá de Hortelã, o valor é de R$3,00");
                } else if (cha == 2){
                    System.out.println("Você escolheu Chá de Camomila, o valor é de R$5,00");
                } else if (cha == 3) {
                    System.out.println("Você escolheu Chá de Erva Cidreira, o valor é de R$3,00");
                } else {
                    System.out.println("Opção inválida.");
                }
                    break;
                    
                case 3:
                    System.out.println("Você escolheu Água, agora escolha qual café deseja, te retornaremos o valor: ");
                    System.out.println("1. Água com gás");
                    System.out.println("2. Água Mineral");
                    
                    System.out.println("Digite o número do pedido escolhido:");
                    agua = scanner.nextInt();
                    
                     if (agua == 1) {
                    System.out.println("Você escolheu Água com gás, o valor é de R$4,00");
                } else if (agua == 2) {
                    System.out.println("Você escolheu Água Mineral, o valor é de R$2,50");
                } else {
                    System.out.println("Opção inválida.");
                }
                    break;
                case 4:
                    System.out.println("Você escolheu Refrigerante, agora escolha qual dos refrigerantes que temos você deseja, te retornaremos o valor: ");
                    System.out.println("1. Coca cola 1L");
                    System.out.println("2. Guaraná Antártica 500ml");
                    System.out.println("3. Fanta Laranja 2L");
                    
                    System.out.println("Digite o número do pedido escolhido:");
                    refri = scanner.nextInt();
                    
                    if (refri == 1) {
                    System.out.println("Você escolheu Coca cola 1L, o valor é de R$12,00");
                } else if (refri == 2) {
                    System.out.println("Você escolheu Guaraná Antártica 500ml, o valor é de R$8,50");
                } else if (refri == 3) {
                    System.out.println("Você escolheu Fanta Laranja 2L, o valor é de R$15,00");
                } else {
                    System.out.println("Opção inválida.");
                }
                default:
                    System.out.println("Opção inválida.");
                    break;
                    
            }  
             System.out.println("Nós da Cafeteria do Sol agradecemos pela preferência!!");
    }
}
