public class Caneta {
    public String cor;
    public String modelo;
    private double ponta;
    protected int carga;
    protected  boolean tampada;
    public void status(){
        System.out.println("Caneta:" + this.cor);//this(autoreferencia)-->aponta para o objeto(c1)
        System.out.println("Está tampada?" + this.tampada);
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Ponta:" + this.ponta);
        System.out.println(("Carga:" + this.carga));

    }
        public void rabiscar(){
        if(this.tampada || this.carga==0){
            System.out.println("Não consegue rabiscar no momento!");
        }else{
            System.out.println("Pode rabiscar!");
        }
    }
    protected void tampar(){
        this.tampada=true;
    }
    protected void destampar(){
        this.tampada=false;
    }
}
