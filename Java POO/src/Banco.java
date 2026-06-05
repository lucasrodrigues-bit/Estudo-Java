public class Banco{
    static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Lucas Deiró",0,"5577-3","CC",false);
        conta1.exibirDadosConta();
        conta1.abrirConta();
        conta1.exibirDadosConta();
        conta1.depositar();
        conta1.exibirDadosConta();
        conta1.pagarMensalidade();
        conta1.exibirDadosConta();
        conta1.sacar();
        conta1.exibirDadosConta();
        conta1.fecharConta();
        conta1.exibirDadosConta();
    }
}


