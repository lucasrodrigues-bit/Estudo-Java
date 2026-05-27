public class ContaBancaria {
    private String titularConta;
    private double saldoConta;

    public void setDados(String titularConta,double saldoconta){

        this.titularConta=titularConta;
        this.saldoConta=saldoconta;

    }
    public void exibirSaldo(){

        System.out.println("Titular da conta:"+titularConta);
        System.out.printf("Saldo da conta:%.2f",saldoConta);

    }

    public boolean sacar(double valor){
        if(saldoConta>=valor){
            saldoConta-=valor;
            return true;
        }
        return false;
    }

}
