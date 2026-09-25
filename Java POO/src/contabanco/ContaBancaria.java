package contabanco;

import java.util.Scanner;

public class ContaBancaria implements ContaActions {

    private String numConta;
    private String tipo;
    private String titularConta;
    private boolean status;
    private double saldo;
    private String banco;

    private final Scanner teclado = new Scanner(System.in);

    // Construtor completo
    public ContaBancaria(
            String titularConta,
            double saldo,
            String numConta,
            String tipo,
            String banco,
            boolean status
    ) {
        this.titularConta = titularConta;
        this.saldo = saldo >= 0 ? saldo : 0;
        this.numConta = numConta;
        this.tipo = tipo;
        this.banco = banco;
        this.status = status;
    }

    // Construtor vazio
    public ContaBancaria() {
    }

    @Override
    public boolean abrirConta(String tipo) {

        if (status) {
            System.out.println("Conta já está ativa.");
            return true;
        }

        if (tipo == null || tipo.trim().isEmpty()) {
            System.out.println("Tipo de conta inválido.");
            return false;
        }

        tipo = tipo.trim();

        switch (tipo.toUpperCase()) {

            case "CC":
                this.tipo = "CC";
                this.saldo += 50;
                this.status = true;
                System.out.println("Conta corrente aberta com sucesso!");
                break;

            case "CP":
                this.tipo = "CP";
                this.saldo += 150;
                this.status = true;
                System.out.println("Conta poupança aberta com sucesso!");
                break;

            default:
                System.out.println("Tipo de conta inválido. Digite CC ou CP.");
                return false;
        }

        return true;
    }

    @Override
    public boolean fecharConta() {

        if (!status) {
            System.out.println("Conta já está inativa.");
            return false;
        }

        if (saldo > 0) {
            System.out.println("Impossível realizar o fechamento. Retire o saldo da conta primeiro.");
            return false;
        }

        String decisao;

        do {
            System.out.println("Tem certeza que deseja fechar sua conta?");
            System.out.println("Digite SIM ou NAO:");

            decisao = teclado.nextLine().trim();

            if (!decisao.equalsIgnoreCase("sim")
                    && !decisao.equalsIgnoreCase("nao")) {

                System.out.println("Resposta inválida. Tente novamente.");
            }

        } while (!decisao.equalsIgnoreCase("sim")
                && !decisao.equalsIgnoreCase("nao"));

        switch (decisao.toLowerCase()) {

            case "sim":
                this.status = false;
                System.out.println("Conta fechada com sucesso.");
                break;

            case "nao":
                System.out.println("Ótima decisão. A conta continuará ativa.");
                break;
        }

        return this.status;
    }

    @Override
    public void depositar() {

        if (!status) {
            System.out.println("Conta inativa.");
            return;
        }

        System.out.println("Deseja depositar quanto?");

        double valor = teclado.nextDouble();
        teclado.nextLine();

        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        this.saldo += valor;

        System.out.printf("Depósito realizado com sucesso!%n");
        System.out.printf("Saldo atual: R$ %.2f%n", this.saldo);
    }

    @Override
    public void sacar() {

        if (!status) {
            System.out.println("Conta inativa.");
            return;
        }

        System.out.printf("Saldo disponível: R$ %.2f%n", saldo);
        System.out.println("Deseja sacar quanto?");

        double valor = teclado.nextDouble();
        teclado.nextLine();

        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        this.saldo -= valor;

        System.out.printf("Saque realizado com sucesso!%n");
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    @Override
    public void transferir() {

        if (!status) {
            System.out.println("Conta inativa.");
            return;
        }

        System.out.println("Funcionalidade de transferência ainda não implementada.");
    }

    @Override
    public void pagarMensalidade() {

        if (!status) {
            System.out.println("Conta inativa.");
            return;
        }

        switch (tipo.toUpperCase()) {

            case "CC":
                saldo -= 12;
                break;

            case "CP":
                saldo -= 20;
                break;

            default:
                System.out.println("Tipo de conta inválido.");
                return;
        }

        System.out.printf("Mensalidade paga. Saldo atual: R$ %.2f%n", saldo);
    }

    @Override
    public void exibirDadosConta() {

        System.out.println("=================================");
        System.out.println("          CONTA BANCÁRIA         ");
        System.out.println("=================================");

        System.out.printf("Titular: %s%n", getTitular());
        System.out.printf("Número da conta: %s%n", getNumConta());
        System.out.printf("Tipo da conta: %s%n", getTipo());
        System.out.printf("Banco: %s%n", banco);
        System.out.printf("Status: %s%n", isStatus() ? "Ativa" : "Inativa");
        System.out.printf("Saldo: R$ %.2f%n", getSaldo());

        System.out.println("=================================");
    }

    // Getters

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

    public boolean isStatus() {
        return status;
    }

    // Setters

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

}