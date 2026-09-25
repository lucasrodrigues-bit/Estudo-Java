package contabanco;

public class Main {

    public static void main(String[] args) {

        ContaActions conta = new ContaBancaria();

        conta.abrirConta("CC");

        conta.exibirDadosConta();

        conta.depositar();

        conta.exibirDadosConta();

        conta.sacar();

        conta.exibirDadosConta();

        conta.pagarMensalidade();

        conta.exibirDadosConta();

        conta.fecharConta();

        conta.exibirDadosConta();
    }
}