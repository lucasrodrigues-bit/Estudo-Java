public class ArraysForeach {
    static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int [] numeros3 = new int [] {1, 2, 3, 4, 5};
        System.out.println();
        //for (int i = 0; i < numeros3.length; i++) {//se precisar acessar um índice específico
           // System.out.println(numeros3[i]);
        //}
        for(int num:numeros3 ){//acessar todos os índicies
            System.out.println(num);
        }
    }
}
