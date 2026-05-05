public class Compras_Mercado {
    static void main(String[] args) {
        Produtos();
    }

    static void Produtos() {
        int sabao = 2;
        int arroz = 3;
        int carne = 1;
        int pao = 10;
        int detergente = 3;
        double valor_total = ((sabao * 3) + (arroz * 3.45) + (carne*50)+(pao*2.5)+(detergente*13));
        System.out.println("R$"+valor_total);
    }
}
