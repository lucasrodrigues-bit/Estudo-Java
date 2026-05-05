import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);//usar padrão dos eua,ou seja,vírgula vira ponto.
        System.out.println("Nome do Aluno:");
        String nome = sc.nextLine();
        System.out.println("Nota do Aluno:");
        float nota = sc.nextFloat();
        System.out.printf("a nota do aluno %s é %.2f ",nome,nota);
        sc.close();
        TestesTipos(args);
    }

    static void TestesTipos(String[] args) {
        int idade = 35;
        String valor = Integer.toString(idade);//Transforma número inteiro em String,forçando mesmo.(typecast não funciona)
        System.out.println(valor);
        String valor2 = "354";
        String valor3="30.8";
        int idade2 = Integer.parseInt(valor2); //Converte a String 30 para um número inteiro
        double idade3 = Double.parseDouble(valor3);//Converte a String 30 para um número decimal
        System.out.println(idade3);
        System.out.println(idade2);
    }

}
