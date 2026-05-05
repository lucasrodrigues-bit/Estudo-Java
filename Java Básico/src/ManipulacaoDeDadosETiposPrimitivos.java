
public class ManipulacaoDeDadosETiposPrimitivos {
    public static void main(String[] args) {
        //float sal = (float)1876.90f;
        float sal = 1893.87f;
        int n1 = 134;
        double n2 = 123.345;
        double res = (int)(sal + n1 + n2);
        System.out.println(res);
        testes(args);
        testes2();

    }

    static void testes(String[] args) {
        Integer idade = (18);
        Float sal = (1876.90f);
        Double res = (double)(idade+sal);
        System.out.println(res);

    }
    //Situação                Status
    // new Integer(18)❌      Depreciado, evite
    // Integer idade = 18     (autoboxing)✅ Use sempre
    // Wrapper em coleções    (List<Integer>)✅ Obrigatório
    // Métodos utilitários    (parseInt, etc)✅ Muito usados

    static void testes2(){
        String fun = "joao";
        float sal = 1876.90f;
        System.out.printf("funcionário:%s%nsalário:%.2f",fun,sal);
    }
}
