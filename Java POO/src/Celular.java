import java.util.Scanner;

class Celular {
        String model;
        String color;
        int charge;
        boolean isCharged;
        boolean isOpened;
        boolean isGoogleOpened;
         String ligar() {
             if (isCharged && isOpened) {
                 return "Ligando...";

             } else {
                 return "Impossível de ligar";

             }
         }
         String desligado(){
              if(!isOpened || charge==0){
                     return "Desligado";
                 }else{
                     return ligar();
                 }
             }
              String pesquisar(){
                 if(isOpened && isGoogleOpened){
                     return "Pode pesquisar no google";

                 }else {
                     return "Não consegue pesquisar";
                 }
             }




}
class Programa {
    public static void main(String[] args) {
        Celular meuCelular;
        Scanner teclado= new Scanner(System.in);
        meuCelular = new Celular();
        System.out.println("Qual a porcentagem da bateria");
        int charge = teclado.nextInt();
        meuCelular.charge=charge;
        meuCelular.isCharged = charge>0;
        meuCelular.isGoogleOpened=true;
        meuCelular.isOpened=true;
        System.out.println(meuCelular.pesquisar());

    }
}



