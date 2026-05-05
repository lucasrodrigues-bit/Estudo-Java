

public class Estudar {
    String disciplina;
    int tempoDuracao;
    int horario;
    boolean thereIsTempoLivre;
    boolean thereIsexercicios;

    int pausa() {
        if (tempoDuracao >= 3.5) {
            System.out.println("Descanse 20 minutos");
            return 20;

        } else {
            return 0;
        }
    }

    void voltar() {
        if (pausa() >= 20) {
            System.out.println("Volte a estudar");
        } else {
            System.out.println("Continue o descanso");
        }
    }
    void parar(){
        this.thereIsexercicios=false;
        this.thereIsTempoLivre=false;
    }
    void estudar(){


    }
    void status(){
        System.out.printf("O aluno estudará %s por %d horas às %d ",disciplina,tempoDuracao,horario);
    }
}

