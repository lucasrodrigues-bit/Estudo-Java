public class ProgramaNotebooks {
    static void main(String[] args) {
        Notebook myNotebok = new Notebook();
        myNotebok.cor="Cinza";
        myNotebok.modelo="Samsung";
        myNotebok.carga=49;
        myNotebok.isAberto=true;
        myNotebok.isCarregado=true;
        myNotebok.isLigado=true;
        myNotebok.isNavegadorAberto=true;
        myNotebok.isJavaInstalado=true;
        myNotebok.status();
        myNotebok.desligar();
        myNotebok.ligar();
        myNotebok.abrir();
        myNotebok.pesquisar();
        myNotebok.codarEmJava();


    }


}
