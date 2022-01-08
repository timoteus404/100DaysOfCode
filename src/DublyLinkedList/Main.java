package DublyLinkedList;

import java.sql.ClientInfoStatus;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.prepend(1);
        list.prepend(2);
        list.prepend(3);

        list.append(3);
        list.append(2);
        list.append(1);

        list.insertAt(2,4);
        System.out.println(list);
        list.removeAt(2);
        System.out.println(list);
        System.out.println(list.printReverse());
    }
}
