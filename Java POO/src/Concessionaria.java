public class Concessionaria {
    public static void main(String[] args) {
    ContaEnergia conta = new ContaEnergia();
    conta.setDados(
            4235,
            223.43
    );
    conta.calcularValor(0.75);

    conta.exibirConta();

    }
}
