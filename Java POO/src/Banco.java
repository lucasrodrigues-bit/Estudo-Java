public class Banco {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.setDados(
                "Lucas Deiró",
                2342.87
        );

        conta.exibirSaldo();

        boolean saqueRealizado = conta.sacar(2000);

        System.out.println("Saque realizado?"+saqueRealizado);

        conta.exibirSaldo();
    }
}
