import java.util.Scanner;

public class Aluno {
    private String nome;
    private int idade;
    private double nota;

    public void setDados(String nome, int idade, double nota) {
        this.nome=nome;
        this.idade=idade;
        this.nota=nota;
    }
    public void exibirDados(){
        System.out.println("Nome:"+nome);
        System.out.println("Idade:"+idade);
        System.out.println("Nota:"+nota);
    }
    public void verificarAprovacao(){
        if(nota>=6){
            System.out.println("Aluno aprovado!");
        }
        else{
            System.out.println("Aluno reprovado!");
        }
    }
}
