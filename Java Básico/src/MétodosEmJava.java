import java.util.Scanner;

public class MétodosEmJava {
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        /*int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
        String res = saudar("Lucas");
        System.out.println(res);*/
        int res=soma(2,5);
        System.out.println(res);

    }

    static String saudar(String name) {
        return name;

    }
    static int soma(int x,int y){
        return x*y;
    }

}
