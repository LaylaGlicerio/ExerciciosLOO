
package ifElse_switchCase;

import java.util.Scanner;
/*
Programa Simulador de pagamento, onde a pessoa escolhe a maneira em que ela vai fazer seu pagamento e ele te retorna se haverá troco ou não 

Autora: Layla Glicério
Aula: LOO
Matéria: Switch Case e If Else
Professor: Leonardo
*/

public class Ex5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao Simulador de Pagamento!");
        System.out.println("Por favor, insira o valor total da compra:");
        double valorTotal = ler.nextDouble(); 
        
        System.out.println("Selecione o método de pagamento:");
        System.out.println("");
        System.out.println("1. Dinheiro");
        System.out.println("2. Cartão ");

        
        int opcao = ler.nextInt();
        
        switch(opcao) {
            case 1:
                System.out.println("Você selecionou pagamento em dinheiro.");
                System.out.println("Digite o valor recebido:");
                double valorRecebido = ler.nextDouble();
                if (valorRecebido >= valorTotal) {
                    double troco = valorRecebido - valorTotal;
                    System.out.println("Troco: R$ " + troco);
                } else {
                    System.out.println("Valor insuficiente. Pagamento não concluído.");
                }
                break;
            case 2:
                System.out.println("Você selecionou pagamento com cartão.");
                System.out.println("Selecione o tipo de cartão:");
                System.out.println("1. Cartão de Crédito");
                System.out.println("2. Cartão de Débito");
                int tipoCartao = ler.nextInt();
                if (tipoCartao == 1) {
                    System.out.println("Você selecionou pagamento com cartão de crédito.");
                    System.out.println("Processando pagamento com cartão de crédito...");
                    
                } else if (tipoCartao == 2) {
                    System.out.println("Você selecionou pagamento com cartão de débito.");
                    System.out.println("Processando pagamento com cartão de débito...");    
                }break;
          
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
}
