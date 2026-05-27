public class Filme {

    private String titulo;
    private String genero;

    private int duracao;
    private int classificacao;

    public void setDados(
            String titulo,
            String genero,
            int duracao,
            int classificacao
    ){
        this.titulo=titulo;
        this.genero=genero;
        this.duracao=duracao;
        this.classificacao=classificacao;
    }
    public void mostrarDetalhes(){

        System.out.println("Título de cartaz:"+titulo);
        System.out.println("Gênero:"+genero);

        System.out.println("Duração do filme:"+duracao + "min");
        System.out.println("Classificação:"+classificacao + "anos");

        System.out.println("Filme para maior de idade?"+(verificacaoIdade() ? "Sim" : "Não"));

    }

    public void verificacaoDuracao(){
       if(duracao<=120){
           System.out.println("Filme curto");
       }else if (duracao<=150) {
           System.out.println("Duração normal");
       }else{
           System.out.println("Filme longo");
       }
        }
        private boolean verificacaoIdade(){
        return classificacao>=18;

    }
    }

