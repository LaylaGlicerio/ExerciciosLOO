package ifElse_switchCase;

import java.util.Scanner;
/*

Programa: Consultando os feriados do ano de 2024 

Autora: Layla Glicério
Aula: LOO
Matéria: Switch Case e If Else
Professor: Leonardo
*/
public class Ex2 {
    public static void main(String[] args) {
         Scanner ler = new Scanner (System.in);
         
        System.out.println("Escolha qual tipo de Feriado do ano de 2024 você quer saber:");
        System.out.println("1. Facultativos");
        System.out.println("2. Feriados Mundiais e Brasileiros");
        
        System.out.println("Digite a opção escolhida:");
               int feriado = ler.nextInt();
               
               
         if (feriado == 1) {
                    System.out.println("Você escolheu conhecer os feriados facultativos de 2024!");
                    System.out.println("");
                    System.out.println("Agora escolha o mês específico que deseja conhecer:");
                    System.out.println("");
                    System.out.println("1. Fevereiro");
                    System.out.println("2. Maio");
                    System.out.println("3. Outubro");
                    
                    int escolha = ler.nextInt();
                    
                    switch (escolha){
                        case 1:
                            System.out.println("Os feriados facultativos de Fevereiro de 2024 são: ");
                            System.out.println("12 de fevereiro: Carnaval (segunda-feira);");
                            System.out.println("13 de fevereiro: Carnaval (terça-feira);");
                            System.out.println("14 de fevereiro: Quarta-Feira de Cinzas (quarta-feira);");
                        break;
                         
                        case 2:
                            System.out.println("Os feriados facultativos de Maio de 2024 são:");
                            System.out.println("");
                            System.out.println("30 de maio: Corpus Christi (quinta-feira)");
                        break;
                        
                        case 3: 
                            System.out.println("Os feriados facultativos de Outubro de 2024 são:");
                            System.out.println("");
                            System.out.println("28 de outubro: Dia do Servidor Público (segunda-feira)");
                        break;
                        
                        default:
                            System.out.println("Opção inválida.");
                        break;
                         
                    }
         } else if (feriado == 2) {
                    System.out.println("Você escolheu conhecer os Feriados Mundiais e Brasileiros de 2024!");
                    System.out.println("");
                    System.out.println("Agora escolha o mês específico que deseja conhecer:");
                    System.out.println("");
                    System.out.println("1. Janeiro");
                    System.out.println("2. Março");
                    System.out.println("3. Abril");
                    System.out.println("4. Maio");
                    System.out.println("5. Setembro");
                    System.out.println("6. Outubro");
                    System.out.println("7. Novembro");
                    System.out.println("8. Dezembro");
                    int escolha = ler.nextInt();
                    
                    switch (escolha){
                        case 1:
                            System.out.println("Os Feriados de Janeiro de 2024 são: ");
                            System.out.println("");
                            System.out.println("1º de janeiro: Confraternização Universal (segunda-feira)");
                        break;
                        
                        case 2:
                            System.out.println("Os Feriados de Março de 2024 são: ");
                            System.out.println("");
                            System.out.println("29 de março: Sexta-Feira Santa (sexta-feira)");
                        break;
                        
                        case 3:
                            System.out.println("Os Feriados de Abril de 2024 são: ");
                            System.out.println("");
                            System.out.println("21 de abril: Tiradentes (domingo)");
                        break;
                        
                        case 4:
                            System.out.println("Os Feriados de Maio de 2024 são: ");
                            System.out.println("");
                            System.out.println("1º de maio: Dia do Trabalho (quarta-feira)");
                        break;
                        
                        case 5:
                            System.out.println("Os Feriados de Setembro de 2024 são: ");
                            System.out.println("");
                            System.out.println("7 de setembro: Independência do Brasil (sábado)");
                        break;
                        
                        case 6:
                            System.out.println("Os Feriados de Outubro de 2024 são: ");
                            System.out.println("");
                            System.out.println("12 de outubro: Dia de Nossa Sra. Aparecida (sábado)");
                        break;
                        
                        case 7:
                            System.out.println("Os Feriados de Novembro de 2024 são: ");
                            System.out.println("");
                            System.out.println("2 de novembro: Finados (sábado)");
                            System.out.println("15 de novembro: Proclamação da República (sexta-feira)");
                            System.out.println("20 de novembro: Dia Nacional de Zumbi e da Consciência Negra (quarta-feira)");
                        break;
                        
                        case 8:
                            System.out.println("Os Feriados de Dezembro de 2024 são: ");
                            System.out.println("");
                            System.out.println("25 de dezembro: Natal (quarta-feira)");
                        break;
                        
                        default:
                            System.out.println("Opção inválida.");
                        break;
                        
                        
                            
                            }
                                    
                    
                    
    }
    }
}


