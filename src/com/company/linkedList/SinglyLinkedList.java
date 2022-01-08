package com.company.linkedList;

public class SinglyLinkedList {
    private Node header;
    private Node lastNode;
    private int size;

    public SinglyLinkedList() {
        header = new Node(null);
        lastNode = header;
    }

    /**
     * adds the element to the beginning of the list
     * @param data
     */
    public void prepand(Integer data){
        Node n = new Node(data);
        if(size == 0){
            header.next = n;
            lastNode = n;
            size++;
        }else{
            Node temp = header.next;
            header.next = n;
            n.next = temp;
            size++;
        }
    }

    /**
     * adds the element to the ending of the list
     * @param data
     */
    public void append(Integer data){
        Node n = new Node(data);

        if(size == 0){
            header.next = n;
            lastNode = n;
            size++;
        }else{
            lastNode.next = n;
            lastNode = n;
            size++;
        }
    }

    /**
     * inserts element at a given index
     * @param index place where data should be placed
     * @param data actual data
     */
    public void insertAt(int index, Integer data){

        int count = 1;
        if(index <= 0 || index > size){
            return;
        }else if(index == 1){
            prepand(data);
        }else if(index == size){
            append(data);
        }else {
            Node n = new Node(data);
            Node indexNode = header;
            while (count != index - 1) {
                indexNode = indexNode.next;
                count++;
            }
            Node temp = indexNode.next;
            indexNode.next = n;
            n.next = temp;
            size++;
        }

    }

    /**
     * removes the data in the given index
     * @param index
     */
    public void removeAt(int index){

        if(index<=0 || index > size){
            return;
        }else if(index == 1){
            removeFirst();
        }else if(index == size){
            removeLast();
        }else {
            int count = 1;
            Node n = header;
            while (count != index) {
                n = n.next;
                count++;
            }
            Node temp = n.next.next;
            n.next = temp;
            size--;
        }
    }

    /**
     * removed the first element in the list
     */
    public void removeFirst(){
        if(size>1) {
            header.next = header.next.next;
            size--;
        }else{
            header.next = null;
            size--;
        }
    }

    /**
     * removes the last element in the list
     */
    public void removeLast(){
        if(size == 1){
            header.next = null;
            lastNode = header;
            size--;
        }else if(size!=0){
            Node n = header.next;
            int count = 1;

            while(count != size-1){
                n = n.next;
                count++;
            }
            n.next = null;
            lastNode = header;
            size--;
        }
    }

    /**
     * @return size of the list
     */
    public int getSize(){
        return size;
    }

    /**
     * @return prints the list
     */
    public String toString(){
        Node n = header.next;
        String temp = "";

        while(n != null){
            temp = temp + n.data + " ";
            n = n.next;
        }

        return temp;
    }
}
