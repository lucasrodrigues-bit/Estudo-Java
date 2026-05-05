import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Vetores {
    static void main(String[] args) {
         /*int[] n ={2,4,2,8,1,16,0,32,435,8};
        //System.out.printf("total de casas de n:%d%n",n.length);//tamanho do vetor(no caso:10[0-9])
         for(int i=0;i<n.length;i++){//vai de 0 até o tamanho do vetor[0-9
             System.out.printf("Na posição %d temos o valor %d%n",i,n[i]);
         }*/
         //mesDias();
         bissexto();
    }
    static void mesDias(){
        String [] mes = {"jan", "fev","mar","abr","mai","jun"};
        int [] dias = {31,28,31,31,30,31,30};
        for(int i=0;i<mes.length;i++){//length-->comprimento/tamanho
            System.out.printf("%s tem %d dias",mes[i],dias[i]);
        }

    }
    static void bissexto(){
        String [] mes = {"jan", "fev","mar","abr","mai","jun"};
        int [] dias = {31,28,31,31,30,31,30};
        System.out.println("Digite o ano");
        Scanner teclado = new Scanner(System.in);
        int ano = teclado.nextInt();
        if(ano%4==0){
            dias[1]=29;
            System.out.println("Ano bissexto");
        }
        for(int i=0;i<mes.length;i++){
            System.out.printf("%s tem %d dias%n",mes[i],dias[i]);

        }


    }


}
class VetoresForEach{
    static void main(String[] args) {
        VetorEmOrdem();
    }
    static void VetorEmOrdem(){
        double num[]={6,3,9.23,-12,-3,43,3.423,3.424,10,-34,-11,-13,-9.23,-10.53,-10.54,54,-10.55};
        Arrays.sort(num);//coloca vetor em ordem
        for(double crescente:num){//para cada valor de num[] coloque dentro de crescente
            System.out.println(crescente);
        }
    }

}
class VetorBusca{
    static void main() {
        int vet[]={3,5,1,8,4};
        //Arrays.binarySearch(vetor,key(valor))
        for(int v:vet){
            System.out.print(v+" ");
        }
        int pos = Arrays.binarySearch(vet,1);//qual posição ele encontrou o valor 1
        System.out.printf("Encontrei o valor na posição:%d",pos);
    }
}
class PreenchimentoDoVetor{
    static void main(String[] args) {
        int v[]= new int[20];
        Arrays.fill(v,6);//todos os 20 itens do vetor valem 6
        for(int valor:v){
            System.out.println(valor + " ");
        }

    }
}
