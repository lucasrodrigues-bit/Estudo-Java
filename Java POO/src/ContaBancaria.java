import java.util.Scanner;

//Classe principal
public class ContaBancaria {

    private String numConta;
    private String tipo;
    private String titularConta;
    private boolean status;
    private double saldo;
    private final Scanner teclado = new Scanner(System.in);

    //método construtor
    public ContaBancaria(
            String titularConta,
            double saldo,

            String numConta,
            String tipo,
            boolean status
    ) {
        this.titularConta = titularConta;
        this.saldo = saldo >= 0 ? saldo : 0;

        this.numConta = numConta;
        this.tipo = tipo;

        this.status = status;
    }

    //métodos da classe principal
    public void abrirConta() {
        if(status){
            System.out.println("Conta já ativa");
            return;
        }
        System.out.println("Qual o tipo da conta?digite Cc para conta corrente ou Cp para conta poupança");
        System.out.println("digite Cc para conta corrente ou Cp para conta poupança");
        String tipoInformado = teclado.nextLine();
        this.tipo = tipoInformado;


        while (!this.tipo.equalsIgnoreCase("Cc") && !this.tipo.equalsIgnoreCase("Cp")) {
            System.out.println("Tipo inválido tente novamente");
            tipo = teclado.nextLine();
        }

        switch (tipo.toUpperCase()) {
            case "CC":
                saldo += 50;
                this.status=true;
                break;

            case "CP":
                saldo += 150;
                this.status=true;
                break;

        }
    }
    public void fecharConta() {
        String decisao;
        if(!status){
            System.out.println("Conta já inativa");
            return;
        }
        if(getSaldo()>0){
            System.out.println("Impossível de realizar fechamento da conta");
            return;
        }

            do {
                System.out.println("Tem certeza que deseja fechar sua conta?");
                decisao = teclado.nextLine();

                if (!decisao.equalsIgnoreCase("sim")
                        && !decisao.equalsIgnoreCase("nao")) {
                    System.out.println("Resposta inválida. Tente novamente.");
                    return;
                }

            } while (!decisao.equalsIgnoreCase("sim")
                    && !decisao.equalsIgnoreCase("nao"));

            if (decisao.equalsIgnoreCase("sim")) {

                if (Math.abs(saldo) >= 0.01) {
                    System.out.println("Impossível fechar a conta. O saldo deve ser zero.");
                    return;
                }
                status = false;
                System.out.println("Conta fechada.");


            }else{
                System.out.println("Obrigado por continuar conosco!");
            }

        }

    public void depositar() {
        if(!status){
            System.out.println("Conta inativa.");
            return;
        }
        System.out.println("Deseja depositar quanto?");

        double valor = teclado.nextDouble();
        teclado.nextLine();

        if(valor <= 0){
            System.out.println("Valor infalido.");
            return;
        }

        saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    }


    public void sacar(){
        //status de conta ativa precisa ser o primeiro a ser verifiado.
        if(!isStatus()){
        System.out.println("Conta inativa");
        return;
    }
        System.out.println("Disponível para saque:"+getSaldo());
        System.out.println("Deseja sacar quanto?");

        double valor = teclado.nextDouble();
        teclado.nextLine();

        if(valor <= 0){
            System.out.println("Valor inválido");
            return;
        }

        if (valor > saldo){
            System.out.println("Saldo insuficiente");
            return;
        }

        saldo -= valor;
        System.out.println("Saque autorizado,saldo atual:"+getSaldo());
    }

    public void pagarMensalidade() {
        if(status) {
            switch (getTipo().toUpperCase()) {
                case "CC":
                    saldo -= 12;
                    break;
                case "CP":
                    saldo -= 20;
            }
        }
    }

    public void exibirDadosConta() {
        System.out.printf("Titular da conta:%s%n", getTitular());
        System.out.printf("Número da conta:%s%n",getNumConta());
        System.out.printf("Tipo da conta:%s%n",getTipo());
        System.out.println("Status da conta:"+isStatus());
        System.out.printf("Saldo da conta:%.2f%n",getSaldo());
        System.out.println("==============================================================");

    }

    //Métodos getters
    public String getTitular() {
        return titularConta;
    }

    public String getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isStatus(){
        return this.status;

    }
}

