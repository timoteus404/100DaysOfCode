package leetcode;

import DublyLinkedList.Node;

public class DetectLoop {


    public static boolean detectLoop(Node head){
        if(head == null){
            return false;
        }
        Node first = head;
        Node second = head.next;

        while(first != null && second != null){

            if(first == second){
                return true;
            }
            first = first.next;
            if(second.next == null){
                return false;
            }
            second = second.next.next;
        }
        return false;
    }
}
