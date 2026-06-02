public class ContaBancaria {
    private String titularConta;
    private double saldoConta;

        public ContaBancaria(String titularConta,double saldoConta) {
        this.titularConta = titularConta;
        if(saldoConta>=0){
            this.saldoConta=saldoConta;
        }
        else{
            this.saldoConta=0;
        }
    }

    public String getTitular() {
            return titularConta;
    }
    public double getSaldoConta(){
            return saldoConta;
    }

    public void setTitularConta(String titularConta){
            this.titularConta=titularConta;
    }

    public boolean depositar(double valor){
            if(valor<=0){
                return false;
            }
            else {
                saldoConta += valor;
                return true;
            }
    }

    public boolean sacar(double valor) {
        if (saldoConta >= valor && valor>0) {
            saldoConta-=valor;
            return true;
        }
        else{
            return false;
        }

        }
        public void status(){
            System.out.printf("Titular da conta:%s%n",getTitular());
            System.out.printf("Saldo da conta:%.2f%n",getSaldoConta());
        }
}