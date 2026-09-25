package contabanco;

public interface ContaActions {

    boolean abrirConta(String tipo);

    boolean fecharConta();

    void depositar();

    void sacar();

    void transferir();

    void pagarMensalidade();

    void exibirDadosConta();
}