import java.util.Scanner;

public class Condicionais {
    static void main() {
        System.out.println("Digite o ano que nasceu:");
        Scanner sc = new Scanner(System.in);
        int ano = sc.nextInt();
        int idade = 2026-ano;
        System.out.printf("Você tem %d%n",idade);
        if(idade<16){
            System.out.println("Não vota");
        }
        else if((idade>=16 && idade<18)|| idade>70){
            System.out.println("Voto opcional");
        }
        else{
            System.out.println("voto obrigatório");
        }
        testesCondicionais();
    }
    static void testesCondicionais(){
        System.out.println("Nota primeira unidade:");
        Scanner teclado = new Scanner(System.in);
        double n1 = teclado.nextDouble();
        System.out.println("Nota segunad unidade:");
        double n2 = teclado.nextDouble();
        double m = (n1+n2)/2;
        String mensagem = "Sua média é";
        if (m>=9){
            System.out.printf("Parabens %s:%.2f!",mensagem,m);
        }
        else if (m==6) {
            System.out.printf("Está na média,%s:%.2f",mensagem,m);
        }
        else if(m>6 && m<=8){
            System.out.printf("está no caminho!%s:%.2f",mensagem,m);
        }
        else{
            System.out.printf("REPROVADO,%s:%.2f",mensagem,m);
        }
    }
}
class Switch{
    static void main(String[] args) {
        System.out.println("Quantas pernas?");
        //int num_p = (int) (1+Math.random()*(8-1)); escolha aleatória pelo sistema
         Scanner teclado = new Scanner(System.in);
         int pernas = teclado.nextInt();
        System.out.print("Isso é um ");
         String tipo;
         switch (pernas) {
             case 1:
                tipo = "Saci";
                 break;
             case 2:
                 tipo = "bípede";
                 break;
             case 3:
                 tipo = "Tripé";
                 break;
             case 4:
                 tipo = "quadrupede";
                 break;
             case 6,8:
                 tipo = "aranha";
                 break;
             default:
                 tipo="ET";
                 break;//não é nescessário

         }
        System.out.print(tipo);
}
}


