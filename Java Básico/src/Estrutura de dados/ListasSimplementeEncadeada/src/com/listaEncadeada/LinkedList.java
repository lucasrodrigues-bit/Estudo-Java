package com.listaEncadeada;

public class LinkedList {
        private Node head;
        private Node tail;
        private int size;


        public LinkedList(){
            this.size = 0;
        }

    public void insertBegin(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertEnd(int val){
            if(tail == null){
                insertBegin(val);
                return;
            }
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size++;
    }

    public void insertAnyPosition(int val,int target){
       if(target == 0){//Verifica se é a inserção é no início,se for chama insertBegin()
           insertBegin(val);
           return;
       }
       if(target == size){//Verifica se é a inserção é no final,se for chama insertEnd()
           insertEnd(val);
           return;
       }

       Node temp = head;
       for(int i=1; i<target;i++){
           temp = temp.next;
       }
        Node node = new Node(val,temp.next);
         temp.next=node;
         size++;
    }

    public Node getIndex(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public Node find(int value){
            Node node = head;
            while(node!=null){
                if(node.value == value){
                    return node;
                }else {
                    node = node.next;
                }
            }
            return null;
    }

    public void deleteAnyPosition(int target){

            if(target == 0){
                deleteBegin();
            }
            if(target==size - 1){
                deleteLast();
            }
            Node temp = getIndex(target-1);
            temp.next = temp.next.next;
            size--;
    }
    public int deleteBegin(){
            int value = head.value;
            head = head.next;
            if(head == null){
                tail = null;
            }
            size--;
            return value;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteBegin();
        }

        Node secondLast = getIndex(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public void display(){
            Node temp = head;

            while(temp != null){
            System.out.print(temp.value + " ->  ");
            temp = temp.next;
        }
        System.out.println("End");
    }




    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
