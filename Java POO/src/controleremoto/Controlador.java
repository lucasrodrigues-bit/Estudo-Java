package controleremoto;

interface Controlador {
    public void ligar();
    public void desligar();
    public void abrirMenu();
    public void fecharMenu();
    public void maisVolume(int volume);
    public void menosVolume(int volume);
    public void ligarMudo();
    public void desligarMudo();
    public void play();
    public void pause();
}
