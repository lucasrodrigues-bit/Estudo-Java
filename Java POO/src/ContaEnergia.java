public class ContaEnergia {

     private int numeroConta;
     private double consumoKWh;
     private double valorTotal;

     public void setDados(
             int numeroConta,
             double consumoKWh
     ){
         this.numeroConta=numeroConta;
         this.consumoKWh=consumoKWh;
         this.valorTotal=0.0;
     }

     public void exibirConta(){
         System.out.println("Número da conta:"+ this.numeroConta);
         System.out.printf("Consumo de KWh:%.2f%n",this.consumoKWh);
         System.out.printf("Valor Total:%.2f",this.valorTotal);
     }

     public void  calcularValor(double precoPorKWh){
          this.valorTotal = this.consumoKWh * precoPorKWh;
     }
}
