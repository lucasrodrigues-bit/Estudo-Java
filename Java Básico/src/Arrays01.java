public class Arrays01 {
    static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 15;
        idades[1] = 22;
        idades[2] = 43;
        /*for (int i = 0; i < idades.length; i++) {
            System.out.println(idades);// retorna o tipo + endereço de memória.
            }
            //for (int num:idades){
            // System.out.println(num);for each atribui a  num cada elemento do array a cada iteração.
            }*/
            for (int i=2;i<idades.length;i--){
              System.out.println(idades[i]);//
            }
        }
    }

