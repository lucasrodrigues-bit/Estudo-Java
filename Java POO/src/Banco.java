public class Banco {
     static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Lucas Deiró",-666);
        conta1.depositar(3000);
        conta1.sacar(2000);
        conta1.status();


        ContaBancaria conta2 = new ContaBancaria("Bárbara",11983);
        conta2.depositar(2000);
        conta2.sacar(9883);
        conta2.status();
    }

}


