
package Exercicios;

import javax.swing.JOptionPane;

/**
 * TRABALHO FINAL
 * Disciplina: Linguagem Orientada a Objeto 
 * Data: 07/05/2024
 * @author: Layla Glicério
 *  Exercício 5 - Crie um algoritmo que lê o salário de um funcionário, pergunte a ele qual a
 *                 porcentagem ele quer ter de aumento, (o Aumento so poderá ser até 13%)
 *                caso seja maior que 13%, o programa devera emitir uma saída informando que
 *                 a porcentagem é invalida, a mes da deverá ser menor ou igual a 13%. Informe
 *                para ele que ele receberá um reajuste para o salário novo salario em X %,
 *                mostrar na saída: O nome do Funcionário, O Salario Antigo, e o novo salario
 *                após reajuste de X%;
 */


public class Ex05 {
    public static void main(String[] args) {

        String Nome = JOptionPane.showInputDialog("Informe o nome do funcionário:");
        double salarioInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario do funcionário"));
        double PorcentagemDesejada = Double.parseDouble(JOptionPane.showInputDialog("Porcentagem desejada para seu aumento salarial: "));
        
        if (PorcentagemDesejada > 13){
            String invalido = "Opção escolhida inválida!";
            JOptionPane.showMessageDialog(null,invalido);
            
        } else if (PorcentagemDesejada <= 13) {
            double Porcentagem = PorcentagemDesejada / 100;
            double SalarioFinal = salarioInicial + (salarioInicial * Porcentagem);
            
            String mensagem = " Nome do funcionário: " + Nome +"\n"
                        + " Seu salario inicial: " + salarioInicial + "\n"
                        + " Seu salário final após o reajuste de " + PorcentagemDesejada + "% será: R$" + SalarioFinal + "\n";
                        
        JOptionPane.showMessageDialog(null, mensagem);
    
    }     

}    
}
