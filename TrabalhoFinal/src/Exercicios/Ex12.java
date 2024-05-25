
package Exercicios;

import javax.swing.JOptionPane;

/**
 * TRABALHO FINAL
 * Disciplina: Linguagem Orientada a Objeto 
 * Data: 19/05/2024
 * @author: Layla Glicério
 *  Exercício 12 - Baseado nas questões anteriores Utilizando a Escritura Swich Case.
 *                      Crie um menu para entrar nas questões:
 *                       Escolha um programa:
 *                       1 - Antecessor ou sucessor. (Ex. 1)
 *                       2 - Soma , Subtração, Multiplicação, Divisão e Potencia (Ex 2)
 *                       3 - Dias Vividos (Ex 3)
 *                       4 - Cotação do Dolar (Ex 6)
 *                       5 – Troca de variáveis (Ex7)
 *                       6 – Números Impares ou pares
 *                       7 – Números Negativos ou Positivos.
 */

public class Ex12 {
    public static void main(String[] args) {
        
        String opcao = "Escolha um programa: \n\n" +
                "1 - Antecessor ou sucessor\n" +
                "2 - Soma, Subtração, Multiplicação, Divisão e Potencia\n" +
                "3 - Dias Vividos\n" +
                "4 - Cotação do Dolar\n" +
                "5 - Troca de variáveis\n" +
                "6 - Números Impares ou pares\n" +
                "7 - Números Negativos ou Positivos\n";
        
          JOptionPane.showMessageDialog(null, opcao);
         
         int escolha =  Integer.parseInt(JOptionPane.showInputDialog("Informe a opção escolhida: "));
        
        switch (escolha) {
                case 1:
                     int numEscolhido = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
                     int num = Integer.parseInt(JOptionPane.showInputDialog("Digite '1' para conhecer o antecessor do número digitado ou '2' para conhecer o sucessor:"));
       
                     String invalido = "Opção escolhida inválida!";
        
                    switch (num) {

                        case 1:
                            int antecessor = numEscolhido - 1;
                                JOptionPane.showMessageDialog(null, antecessor);
                            break;

                        case 2:
                            int sucessor = numEscolhido + 1;
                                JOptionPane.showMessageDialog(null, sucessor);
                            break;

                        default:
                            JOptionPane.showMessageDialog(null,invalido);
                            break;

    }
                break;
                
                case 2:
                    String mensagem = "Este programa irá calcular o resultado da \n"
                                        +" - Soma\n"
                                        +" - Subtração\n"
                                        +" - Multiplicação\n" 
                                        +" - Divisão\n" 
                                        +" - Potencia\n"
                                        +" - Mode\n"
                                        + "dos dois números que você vai escolher!";

                    JOptionPane.showMessageDialog(null,mensagem);

                    int num1 = Integer.parseInt(JOptionPane.showInputDialog("O primeiro número escolhido é:"));
                    int num2 = Integer.parseInt(JOptionPane.showInputDialog("O segundo número escolhido é:"));

                    int somar = num1 + num2;
                    int subtrair = num1 - num2;
                    int multiplicar = num1 * num2;
                    int dividir = num1 / num2;
                    int potencia = (int) Math.pow(num1, num2);
                    int modulo = num1 % num2;

                    String resultados = "A soma é igual a = " + somar + "\n"
                                       +       
                           "A subtração é igual a = " + subtrair + "\n"
                                       +  
                           "A multiplicação é igual a = " + multiplicar + "\n"
                                       + 
                           "A divisão é igual a = " + dividir + "\n"
                                       + 
                           "A potenciação é igual a = " + potencia + "\n"
                                       + 
                           "O módulo é igual a = " + modulo + "\n";

                   JOptionPane.showMessageDialog(null, resultados); 
                break;
                
                case 3:
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
                    int diasdeVida = idade*365; 

                    String total = "Você tem no total: " + diasdeVida + " dias de vida!";

                    JOptionPane.showMessageDialog(null,total);                    
                break;
                
                case 4:
                    String nome = JOptionPane.showInputDialog("Informe o nome do funcionário:");
                    double salarioInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario do funcionário"));

                    double salarioFinal = salarioInicial * 1.07;

                    String mensagemFinal = " Nome do funcionário: " + nome +"\n"
                                    + " Seu salario inicial: " + salarioInicial + "\n"
                                    + " Seu salário final após o reajuste: " + salarioFinal + "\n";

                    JOptionPane.showMessageDialog(null, mensagemFinal);
                break;
                
                case 5:
                    String Nome = JOptionPane.showInputDialog("Informe o nome do funcionário:");
                    double salarioI = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario do funcionário"));
                    double PorcentagemDesejada = Double.parseDouble(JOptionPane.showInputDialog("Porcentagem desejada para seu aumento salarial: "));

                    if (PorcentagemDesejada > 13){
                        String invalida = "Opção escolhida inválida!";
                        JOptionPane.showMessageDialog(null,invalida);

                    } else if (PorcentagemDesejada <= 13) {
                        double Porcentagem = PorcentagemDesejada / 100;
                        double SalarioFinal = salarioI + (salarioI * Porcentagem);

                        String mensagemF = " Nome do funcionário: " + Nome +"\n"
                                    + " Seu salario inicial: " + salarioI + "\n"
                                    + " Seu salário final após o reajuste de " + PorcentagemDesejada + "% será: R$" + SalarioFinal + "\n";

                    JOptionPane.showMessageDialog(null, mensagemF);
                    }
                break;
                
                case 6:
                    double ValorDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em dolar que você deseja converter para real: "));
        
                    double ValorReal = ValorDolar * 5.12;

                    String mens = "Convertendo US$" + ValorDolar + " dolares para reais é: R$" + ValorReal + " reais!";

                    JOptionPane.showMessageDialog(null, mens);
                break;
                
                case 7:
                    int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
                    int n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));

                    String mensagem1 = "A sequência inicial é: " + n1 + ", " + n2;
                    JOptionPane.showMessageDialog(null, mensagem1);

                    int auxiliar = n1;
                    num1 = n2;
                    num2 = auxiliar;

                    String mensagem2 = "A sequência final é: " + n1 + ", " + n2;
                    JOptionPane.showMessageDialog(null, mensagem2);
                break;
                
                default:
                    String invalid = "Opção escolhida inválida!";
                    JOptionPane.showMessageDialog(null,invalid);
                break;
    }
    }
}
    

