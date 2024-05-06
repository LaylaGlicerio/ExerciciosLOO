
package exerciciojpane;
import javax.swing.JOptionPane;

public class ExercicioJPane {
    public static void main(String[] args) {
        
      int pessoas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de pessoas:"));
        int refrigerantes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de pessoas que irão consumir refrigerante:"));
        int sucos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de pessoas que irão consumir suco:"));
        int cervejas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de pessoas que irão consumir cerveja:"));

        // Calcula a quantidade necessária de carne
        double carneBoi = pessoas * 0.12; // 120g por pessoa
        double carnePorco = pessoas * 0.10; // 100g por pessoa
        double linguiça = pessoas * 0.05; // 50g por pessoa
        double asinhaFrango = pessoas * 0.05; // 50g por pessoa

        // Calcula a quantidade necessária de bebidas
        double refrigerante = refrigerantes * 0.4; // 400ml por pessoa
        double suco = sucos * 0.3; // 300ml por pessoa
        double cerveja = cervejas * 3.0; // 3000ml por pessoa

        // Exibe os resultados para o usuário
        String mensagem = "Quantidade de carne necessária:\n"
                + "Carne de Boi: " + carneBoi + " kg\n"
                + "Carne de Porco: " + carnePorco + " kg\n"
                + "Linguiça: " + linguiça + " kg\n"
                + "Asinha de Frango: " + asinhaFrango + " kg\n\n"
                + "Quantidade de bebidas necessária:\n"
                + "Refrigerante: " + refrigerante + " litros\n"
                + "Suco: " + suco + " litros\n"
                + "Cerveja: " + cerveja + " litros\n";

        JOptionPane.showMessageDialog(null, mensagem);
    
    }
    
}
