

import java.util.Scanner;

public class Pessoa {
    String nome;
    int idade;
    String cpf;
    String telefone;
    String ocupacao;

}

  class  Aluno extends Pessoa{
      boolean pagamento;
      String matricula;
      String turma;
      double media;

      boolean isPagamentoEmDia() {
        return pagamento;
    }

    String situacao() {
        if(isPagamentoEmDia() && media>=6){
            return "aprovado";
        }else{
            return "reprovado";
        }
    }
}

 class SistemaEscolar{
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aluno escolaAlunos = new Aluno();

        System.out.println("Seu nome:");
        escolaAlunos.nome=input.nextLine();

        System.out.println("Digite sua matrícula:");
        escolaAlunos.matricula= input.nextLine();

        System.out.println("Digite seu cpf:");
        escolaAlunos.cpf=input.nextLine();

        escolaAlunos.pagamento= false;

        System.out.println("Digite sua média:");
        escolaAlunos.media=input.nextDouble();

        System.out.printf("Nome:%s%n",escolaAlunos.nome);
        System.out.printf("CPF:%s%n",escolaAlunos.cpf);
        System.out.printf("Matrícula:%s%n",escolaAlunos.matricula);
        System.out.printf("Situação:%s",escolaAlunos.situacao());




    }
}
