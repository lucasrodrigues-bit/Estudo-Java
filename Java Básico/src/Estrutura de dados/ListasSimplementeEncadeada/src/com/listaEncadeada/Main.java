package com.listaEncadeada;

public class Main {
    static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertBegin(3);
        list.insertBegin(12);
        list.insertBegin(82);
        list.insertBegin(17);
        list.insertEnd(99);
        list.insertAnyPosition(100,3);
        list.deleteBegin();
        list.deleteLast();
        list.deleteAnyPosition(2);
        list.display();
    }

}
