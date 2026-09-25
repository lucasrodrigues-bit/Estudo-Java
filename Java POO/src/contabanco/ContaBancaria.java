package contabanco;

public interface ContaBancaria {
    public Boolean abrirConta();
    public Boolean fecharConta();
    public void entrar();
    public void depositar();
    public void sacar();
    public void transferir();
    public String toString();
}
