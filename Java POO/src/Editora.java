public class Editora {
    public static void main(String[] args) {
        
        Livro livro = new Livro();

        livro.setDados(
                "Além do Bem e do Mal",
                "nietzsche",
                1886
        );

        livro.exibirInformacoes();
    }
}
