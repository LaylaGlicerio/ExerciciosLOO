
package exerciciojoptionpane;
import javax.swing.JOptionPane;

public class ExercicioJOptionPane {
    public static void main(String[] args) {
        
        int pessoas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de pessoas que irão:"));
        int refrigerantes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de pessoas que irão consumir refrigerante:"));
        int sucos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de pessoas que irão consumir suco:"));
        int cervejas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de pessoas que irão consumir cerveja:"));

        int carneBoi = pessoas * 120;
        int carnePorco = pessoas * 100;
        int linguiça = pessoas * 50;
        int asinhaFrango = pessoas * 50;
        
        int refrigerante = refrigerantes * 400;
        int suco = sucos * 300; 
        int cerveja = cervejas * 3000;
        
        String mensagem = "Quantidade de carne necessária:\n"
                + "Carne de Boi: " + carneBoi + " g\n"
                + "Carne de Porco: " + carnePorco + " g\n"
                + "Linguiça: " + linguiça + " g\n"
                + "Asinha de Frango: " + asinhaFrango + " g\n\n"
                + "Quantidade de bebidas necessária:\n"
                + "Refrigerante: " + refrigerante + " ml\n"
                + "Suco: " + suco + " ml\n"
                + "Cerveja: " + cerveja + " ml\n";
        
        JOptionPane.showMessageDialog(null, mensagem);
    } 
}
