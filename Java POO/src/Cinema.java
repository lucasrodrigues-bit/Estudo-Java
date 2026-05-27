public class Cinema {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setDados("Vindagores:Guerra Infinita","Ação",1259,17);
        filme.mostrarDetalhes();
        filme.verificacaoDuracao();
    }
}
