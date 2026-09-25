package controleremoto;

public class ControleRemoto implements Controlador {
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //métodos especiais(contrutor)

    public ControleRemoto(
            int volume,
            boolean ligado,
            boolean tocando
    ){
        this.volume=volume;
        this.ligado=ligado;
        this.tocando=tocando;
    }
    public ControleRemoto(){

    }

    //métodos abstratos da interface(controlador)
    public void ligar(){
        setLigado(true);
    }

    public void desligar(){
        setLigado(false);
    }

    public void abrirMenu() {
        System.out.println("Ligado?" + this.isLigado());
        System.out.println("Volume:" + getVolume());
        for (int i = 0; i <= getVolume(); i+=10) {
            System.out.println("|");
        }

    }

    public void fecharMenu(){
        System.out.println("Menu fechado");
    }

    public void maisVolume(int volume){
        if(isLigado() && getVolume()<100){
            do{
                setVolume(getVolume()+1);
            }
            while(getVolume() != volume);
        }

    }

    public void menosVolume(int volume){
        if(isLigado() && getVolume()>0){
            do{
                setVolume(getVolume()-1);
            }
            while(getVolume() != volume);
        }
    }

    public void ligarMudo(){
        if(isLigado() && getVolume()>0){
            setVolume(0);

        }
    }

    public void desligarMudo(){
        if(isLigado() && getVolume()==0){
            setVolume(50);

        }

    }

    public void play(){
        if(isLigado() && !isTocando()){
            setTocando(true);
        }

    }

    public void pause(){
        if(isLigado() && isTocando()){
            setTocando(false);
        }

    }



    //métodos especiais volume
    public int getVolume(){
        return this.volume;
    }
    public void setVolume(int valorVolume){
         this.volume=valorVolume;
    }

    //métodos especiais ligado
    public boolean isLigado(){
        return this.ligado;
    }
    public void setLigado(boolean valorLigado){
        this.ligado = valorLigado;
    }

    //métodos especiais tocando
    public boolean isTocando(){
        return this.tocando;
    }
    public void setTocando(boolean valorTocando){
        this.tocando=valorTocando;
    }


}

