
package exercicios;

public class Ex2 {
    public static void main(String[] args) {
        int n = 10; 
        int primeiroTermo = 0;
        int segundoTermo = 1;
        int contador = 0;
        
        System.out.println("Os primeiros " + n + " números da sequência de Fibonacci são:");
        
        
        do {
            System.out.print(primeiroTermo + " ");

            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;

            contador++;
        } while (contador < n);
    }
}
   

