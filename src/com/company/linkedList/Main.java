package com.company.linkedList;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);

        list.prepand(4);
        list.prepand(5);
        list.prepand(6);
        System.out.println(list);
        System.out.println("after prepand(): " + list.getSize());

        list.insertAt(3, 9);
        list.insertAt(1, 9);
        list.insertAt(list.getSize(), 9);
        System.out.println(list);
        System.out.println("after insertAt(): " + list.getSize());

        list.removeAt(list.getSize());
        list.removeAt(1);
        list.removeAt(5);
        System.out.println(list);
        System.out.println("after removeAt(): " + list.getSize());






    }
}
