public class ProgramaCaneta {
    static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic cristal";
        c1.cor = "Azul";
        //c1.ponta=0.5f; -->ERRO:ponta é privado!
        c1.carga=80;//deixa usar o atributo protegido pq o metodo(main) está utilizando um objeto(c1) que está dentro de um classe Caneta() que utiliza a classe caneta
        c1.tampada=true;

        c1.status();
    }
}