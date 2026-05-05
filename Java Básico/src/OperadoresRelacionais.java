import java.sql.Date;
import java.util.Locale;
import java.util.Scanner;
public class OperadoresRelacionais {
    public static void main(String[] args) {
        /*System.out.println("Qual sua idade?");
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        String status = idade>=18?"Maior de idade":"Menor de idade";
        System.out.printf("Você tem %d anos%n%s",idade,status);
        sc.close();*/
        verificador();

    }

    static void verificador() {
        System.out.println("Digite um número:");
        Scanner sc1 = new Scanner(System.in);
        sc1.useLocale(Locale.US);
        double n1 = sc1.nextDouble();


        System.out.println("Digite outro número :");
        Scanner sc2 = new Scanner(System.in);
        sc2.useLocale(Locale.US);
        double n2 = sc2.nextDouble();


        String status = n1==n2?"iguais":"diferentes";
        System.out.printf("Os números %.2f e %.2f são %s",n1,n2,status);

    }

}

class NumerosAleatoriosComparacao {
    static void main(String[] args) {
        int n1= (int)(Math.random()*100);
        System.out.println(n1);
        int n2 = (int)(Math.random()*100);
        System.out.println(n2);
        boolean resultado = n1==n2?true:false;
        String verif = resultado==true?"são iguais,parabéns!":"são diferentes";
        System.out.printf("Os números %d e %d %s",n1,n2,verif);
    }
}
class ComparacaoString{
    static void main() {
        String nome1 = "Lucas";
        String nome2 = "Lucas";
        String nome3 = new String("Lucas");
        String res = nome1==nome2?"igual":"diferente";//iguais,conteudo e estrutura
        System.out.println(res);
        String res2 = nome1==nome3?"igual":"diferente";//diferentes,conteúdo igual porém estrutura diferente
        System.out.println(res2);
        String res3 = nome1.equals(nome3)?"igual":"diferente";//iguais,equals verifica o conteúdo
        System.out.println(res3);

    }

}
class OperadoresLogicos{
    static void main(String[] args) {
        int x,y,z;
        x=4;
        y=7;
        z=12;
        boolean r;
        r=(x<y && y<z)?true:false;
        System.out.println(r);


    }
}
class AkinatorNumberGuess {
    static void main(String[] args) {
        int numberAkinator = (int) (1 + Math.random() * (5 - 1));//escolher número aleatóriamente de 1 a 5
        System.out.println("Escolha um número de 1 a 5:");
        Scanner teclado = new Scanner(System.in);
        int MyNumber = teclado.nextInt();
        String verificacao = numberAkinator == MyNumber ? "ACERTOU!" : "ERROU!";
        System.out.printf("%s Pensei em %d%n", verificacao, numberAkinator);
    }

    class ParOrImpar {
        static void main(String[] args) {
            System.out.println("Digite um número");
            Scanner teclado = new Scanner(System.in);
            int num = teclado.nextInt();
            String res = num % 2 == 0 ? "Par" : "Ímpar";
            System.out.println(res);

        }
    }
}

