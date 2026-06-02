public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    //alt+fn1+insert=cria automaticamente setters,getters e constructors
    public Caneta(){
        this.tampar();
        this.cor="Azul";
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public float getPonta(){
        return ponta;
    }
    public void setPonta(float ponta){
        this.ponta=ponta;
    }

    public void tampar(){
        this.tampada=true;
    }

    public void destampar(){
        this.tampada=false;
    }

    public void status(){
        System.out.println("Características da caneta:");
        System.out.printf("Cor:%s%n",this.cor);
        System.out.printf("Modelo:%s%n",getModelo());
        System.out.printf("Ponta:%.2f%n",getPonta());
        System.out.println("Tampada:"+this.tampada );
    }

}
