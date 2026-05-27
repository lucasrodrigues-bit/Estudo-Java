public class Produto {

    private String nome;
    private double preco;
    private int estoque;

    public void setDados(String nome,double preco,int estoque){

        this.nome=nome;
        this.preco=preco;
        this.estoque=estoque;

    }
    public void mostrarProduto(){

        System.out.println("Nome:"+nome);
        System.out.println("Preço:"+preco);
        System.out.println("Estoque:"+estoque);
        System.out.println("Tem disponibilidade?"+verificarDisponibilidade());

    }

    private boolean verificarDisponibilidade(){
        return estoque>0;
    }

}
