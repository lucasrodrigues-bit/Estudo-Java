package controleremoto;

public class UseControle {
    static void main(String[] args) {
        ControleRemoto c1 = new ControleRemoto(0,true,false);
        c1.maisVolume(30);
        c1.abrirMenu();
        c1.menosVolume(15);
        c1.abrirMenu();
    }
}
