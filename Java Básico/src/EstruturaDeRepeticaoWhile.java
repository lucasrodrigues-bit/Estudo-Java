import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class EstruturaDeRepeticaoWhile{
    static void main(String[] args) {
        int cc=0;
        while (cc<10){
            cc++;
            if(cc==5 || cc == 7){
                continue;//se o contador for 5 ou 7 ele retorna o looping(não conta nenhum dos 2
            }
            System.out.printf("cambalhota %d%n",cc);

        }
        testes();
        testes2();

    }
    static void testes(){
        int passos=1;
        while (passos<=30){
            System.out.printf("%nprecisa andar mais,foram apenas %d passos%n",passos);
            passos++;

        }
        int compras=1;
        while(compras<=10) {
            compras++;
            if (compras == 3 || compras == 5) {
                continue;
            }
            System.out.printf("vc fez %d%n",compras);
        }

    }

    static void testes2() {
        int cc=0;
        while (cc<10){
            cc++;
            if(cc==2 || cc == 3 || cc==4){
                continue;//se o contador for 5 ou 7 ele retorna o looping(não conta nenhum dos 2
            }
            if(cc==7){
                break;
            }
            System.out.printf("cambalhota %d%n",cc);
        }

    }
}
class EstruturaDo {
    static void main(String[] args) {
        int cc = 0;
        do {
            System.out.println("cambalhota");
            cc++;
        } while (cc<4);
        testes();
    }
    static void testes(){
        int n;
        int s=0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Digite um número");
            n = teclado.nextInt();
            s+=n;
            System.out.println("Quer continuar? [S/N]");
            resp = teclado.next();

        }while (resp.equalsIgnoreCase("S")||resp.equalsIgnoreCase("sim"));
        System.out.printf("A soma de todos os valor é %d",s);
    }
}
/*Utiliza do/while porque se usar o while ele vai tentar  verificar resp antes de executar qualquer coisa. Mas resp ainda não tem valor nenhum! O programa vai travar com erro antes mesmo de perguntar o número.
    While (resp.equalsIgnoreCase("S")) {
    System.out.println("Digite um número");
    n = teclado.nextInt();
    s += n;
    System.out.println("Quer continuar? [S/N]");
    resp = teclado.next(); valor de resp só é atribuido aqui
}*/
class EstruturaFor{
    static void main(String[] args) {
       for (int cc=0; cc<4;cc++){
           System.out.println("cambalhota");
       }
       /*testes();
       pares();
       tabuada();
        somaAcumulada();
        fatorial();
        estrelas();
        impares();
        fizzBuzz();
        piramide();*/
    }
    static void testes(){
        for (int i=10;i>=0;i--){
            System.out.println(i);
        }
    }
    static void pares(){
        for (int i=0;i<=20;i+=2){
            System.out.println(i);
        }
    }
    static void tabuada(){
        System.out.println("Digite um número");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();//número que será calculado
        for (int t=1;t<=10;t++){//tabuada
            System.out.println(n*t);
        }
    }
    static void somaAcumulada(){
            int s=0;
        for (int i=1;i<=10;i++) {
            int soma = s += i;
            System.out.println(soma);}

    }
    static void fatorial(){
        System.out.println("Digite um número");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int mult=1;
        for (int i=1;i<=num;i++) {
            mult*=i;

        }System.out.println(mult);

    }
    static void estrelas(){
        System.out.println("Quantas estrelas deseja?");
        Scanner teclado = new Scanner(System.in);
        int quantEstrelas =teclado.nextInt();
        String linha ="";
        for(int i=1; i<=quantEstrelas;i++){;
            linha+="*";
            System.out.println(linha);
        }

    }
    static void impares(){
        for (int i=99;i>=1;i-=2){
            System.out.println(i);
        }
    }
    static void fizzBuzz(){
        for(int i=1;i<=30;i++){
            if (i%3==0 && i%5==0){
                System.out.printf("FizzBuzz:%d%n",i);
            }
            else if(i%5==0){
                System.out.printf("Buzz:%d%n",i);
            }
            else if(i%3==0){
                System.out.printf("Fizz:%d%n",i);
            }
            else{
                System.out.println(i);
            }
        }
    }
    static void piramide(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Até qual linha?");
        int linhas = teclado.nextInt();

        for(int i = 1; i <= linhas; i++){        // for EXTERNO → controla as linhas
            for(int j = 1; j <= i; j++){         // for INTERNO → controla os números
                System.out.print(j + " ");       // imprime sem pular linha
            }
            System.out.println();                // pula linha ao terminar cada linha
        }
    }



}
