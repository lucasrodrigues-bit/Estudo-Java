public class Notebook {
    boolean isLigado;
    boolean isAberto;
    boolean isCarregado;
    int carga;
    String modelo;
    String cor;
    boolean isNavegadorAberto;
    boolean isJavaInstalado;

    void status() {
        System.out.printf("O notebook %s %s está com %d de bateria%n", this.modelo, this.cor, this.carga);
    }

    void ligar() {
        if (this.isCarregado && this.isAberto && !this.isLigado) {
            System.out.println("Ligando...");

        } else if (this.isLigado && this.isAberto) {
            System.out.println("Já está ligado");
        } else {
            System.out.println("Impossível de ligar");
        }
    }

    void desligar() {
        if (this.isCarregado && this.isAberto && this.isLigado) {
            System.out.println("Desligando...");

        } else if (!this.isLigado || this.isCarregado) {
            System.out.println("Já está desligado");
        }
    }

    void codarEmJava() {
        if (isJavaInstalado) {
            System.out.println("Pode codar em java");
        }
    }

    void abrir() {
        if (!this.isAberto) {
            System.out.println("Abrindo...");
        } else {
            System.out.println("Já está aberto");
        }
    }


    void pesquisar(){
        if(isNavegadorAberto && isLigado && isAberto){
            System.out.println("Pode pesquisar no navegador!");
        }
    }
}
