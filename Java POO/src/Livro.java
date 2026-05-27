public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicado;

    public void setDados(String titulo,String autor,int anoPublicado){

        this.titulo=titulo;
        this.autor=autor;
        this.anoPublicado=anoPublicado;
    }
    public void exibirInformacoes(){

        System.out.println("Título:"+titulo);
        System.out.println("Autor:"+autor);
        System.out.println("Ano de publicação:"+anoPublicado);
        System.out.println("Livro antigo?"+verificarLivroAntigo());
    }
    public boolean verificarLivroAntigo(){
        return anoPublicado <=1970;
        }
    }

