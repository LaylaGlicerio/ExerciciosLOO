package ifElse_switchCase;
import java.util.Scanner;

/*

Programa de consulta de valores de materiasis escolares em um Saldão na Papelaria Cartolina Azul 

Autora: Layla Glicério
Aula: LOO
Matéria: Switch Case e If Else
Professor: Leonardo
*/

public class Ex4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int escolha;
        int lapis, caderno;   

        System.out.println("................................................");
        System.out.println("SALDÃO PAPELARIA CARTOLINA AZUL!!");
        System.out.println("................................................");
        System.out.println("");
        System.out.println("Escolha o tipo de material escolar e descubra as ofertas:");
        System.out.println("");
        System.out.println("................................................");
        System.out.println("");
        System.out.println("1. Caixa de lápis de cor");
        System.out.println("2. Cadernos");

        System.out.println("Digite um numero do pedido escolhido:");
        escolha = ler.nextInt();

       
        switch (escolha) {
            case 1:
                 System.out.println("As marcas de caixa de lápis de cor inclusas no saldão são: ");
                 System.out.println("1. Caixa de lápis de cor - Faber Castell");
                 System.out.println("2. Caixa de lápis de cor - Cis");;
                 System.out.println("A opção que você deseja saber o valor é: ");
                    lapis = ler.nextInt();
                    
                    if (lapis == 1) {
                    System.out.println("Caixa de lápis de cor - Faber Castell, o valor é de R$17,00");
                } else if (lapis == 2) {
                    System.out.println("Caixa de lápis de cor - Cis, o valor é de R$10,00");
                } else {
                    System.out.println("Opção inválida.");
                }   
                break;
                
            case 2:
                System.out.println("As marcas de caixa de lápis de cor inclusas no saldão são: ");
                 System.out.println("1. Caderno 10 matéria fem/masc - Tilibra ");
                 System.out.println("2. Caderno 1 matéria fem/masc - Tilibra");
                 System.out.println("A opçã2. Caderno 1 matéria fem/masc - Tilibo que você deseja saber o valor é: ");
                    caderno = ler.nextInt();
                    
                    if (caderno == 1) {
                    System.out.println("Caderno 10 matéria fem/masc - Tilibra, o valor é de R$29,90");
                } else if (caderno == 2) {
                    System.out.println("Caderno 1 matéria fem/masc - Tilibra, o valor é de R$12,00");
                } else {
                    System.out.println("Opção inválida.");
                }
                break;
            
            default:
                System.out.println("Opção inválida.");
        }

        
        System.out.println("Obrigado pela preferência!");
    }
}


