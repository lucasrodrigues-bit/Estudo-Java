public class OperadoresAritmeticos {
    public static void main(String[] args) {

       /* soma(args);
        subtracao();
        multiplicacao();
        raiz();
        potenciacao();
        divisao();
        pi();*/
    }

    static void soma(String[] args) {
        System.out.println(12 + 4);
    }

    static void subtracao() {
        System.out.println(47 - 22);
    }

    static void multiplicacao() {
        System.out.println(10 * 12);
    }

    static void divisao() {
        System.out.println(144 / 12);
    }

    static void potenciacao() {
        double resultado = Math.pow(2, 3);
        System.out.println(resultado);
    }

    static void raiz() {
        double resultado = Math.sqrt(4);
        System.out.println(resultado);

        double resultado2 = Math.pow(27, 1.0 / 3);
        System.out.println(resultado2);

        double resultado3 = Math.cbrt(9);
        System.out.println(resultado3);

    }

    static void pi() {
        double resultado = Math.PI;
        System.out.println(resultado);
    }


    public class calculos {
        static void calculos_v(String[] args) {
            volume();
        }

        static void volume() {
            int comprimento = 12;
            int largura = 4;
            int altura = 2;
            int resultado = comprimento * largura * altura;
            System.out.println(resultado + "m³");

        }
    }




    }

    class calculos2 {
    static void main(String[] args) {

        int numero = 5;
        numero++;
        System.out.println(numero);
        //------------------------------------------------
        int numero2 = 8;
        numero2--;
        System.out.println(numero2);
        //------------------------------------------------
        int numero3 = 5;
        int valor = 5 + numero3++;
        System.out.println(valor);//--->10
        //int valor = 5+ ++numero3
        //System.out.println(valor) --->11
        //se vier após o "numero3"(numero3++) ele não soma antes de printar "valor",se vier antes(++numero3) ele soma.
        //------------------------------------------------
        int x = 4;
        x += 2;//x+=y o número de x somado com o número de y(serve para todos os operadores aritméticos)
        System.out.println(x);
        //------------------------------------------------
        int y = 9;
        y /= 3;
        System.out.println(y);
        //------------------------------------------------
        arredondamentos();
    }
        //------------------------------------------------
        static void arredondamentos() {
            float v = 8.9f;
            int arredondado = (int) Math.floor(v);//floor--->arredonda para baixo(8)
            System.out.println(arredondado);
            //------------------------------------------------

            float v2 = 2.1f;
            int arrendondado2 = (int) Math.ceil(v2);//ceil--->arredonda para cima(3)
            System.out.println(arrendondado2);
            //------------------------------------------------
            float v3 = 5.6f;
            int arredondado3 = Math.round(v3);//round--->arredondamento aritmético(6)
            System.out.println(arredondado3);

    }

}
class GeradorDeNumeros{
    static void main(String[] args) {
        double aleatorio = Math.random(); //random--->número aleatório de 0.0 até 1.0
        System.out.println(aleatorio);
        //----------------------------
        double aleatorio2 = 5+Math.random()*(10-5);//--->intervalo de 5 até 10(conta matemática
        System.out.println(aleatorio2);
        //----------------------------
        double aleatorio3 = (int) (10+Math.random()*(100-10));
        System.out.println(aleatorio3);
        int n1=2;
        int n2 = 5;
        double res =(double) n2/n1;//--->sem o double como typecast ele iria retornar 2.0,pq a divisão inteira entre 5 e 2 é 2,porém como o tipo primitivo da variavel é double iria retornar 2.0.
        System.out.println(res);
    }
}
