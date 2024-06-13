/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;

public class Aluno {
     String nome;
     int idade;
     double nota1;
     double nota2;
     String turma;
     String curso;
     String matricula;
     String endereco;

    // Método para calcular a média das notas
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    // Método para exibir as informações do aluno
    public void exibirInformacoes() {
        System.out.println("Informações do Aluno:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Turma: " + turma);
        System.out.println("Curso: " + curso);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Endereço: " + endereco);
        System.out.println("Média: " + calcularMedia());
        System.out.println("Aprovado: " + (estaAprovado() ? "Sim" : "Não"));
    }

    // Método para verificar se o aluno está aprovado
    public boolean estaAprovado() {
        return calcularMedia() >= 6.0;
    }
}
    
