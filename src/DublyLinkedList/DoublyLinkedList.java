package DublyLinkedList;

public class DoublyLinkedList {
    private Node header;
    private Node lastNode;
    private int size;

    public DoublyLinkedList() {
        header = new Node(null);
        lastNode = header;
    }

    /**
     * adds the element to the beginning of the list
     * @param data for adding into our LinkedList
     */
    public void prepend(Integer data){
        Node n = new Node(data);
        if(size == 0){
            header.next = n;
            lastNode = n;
            lastNode.previous = header;
            size++;
        }else{
            Node temp = header.next;

            header.next = n;
            n.previous = header;

            n.next = temp;
            temp.previous = n;

            size++;
        }
    }

    /**
     * adds the element to the ending of the list
     * @param data adding into our LinkedList
     */
    public void append(Integer data){
        Node n = new Node(data);

        if(size == 0){
            header.next = n;
            lastNode = n;
            lastNode.previous = header;
            size++;
        }else{
            lastNode.next = n;
            n.previous = lastNode;
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

        if(index <= 0 || index > size){
            return;
        }else if(index == 1){
            prepend(data);
        }else if(index == size){
            append(data);
        }else {
            Node n = new Node(data);
            Node indexNode = header.next;
            int count = 1;
            while (count != index) {
                indexNode = indexNode.next;
                count++;
            }
            n.next = indexNode;
            n.previous = indexNode.previous;
            indexNode.previous.next = n;
            indexNode.previous = n;
            size++;
        }

    }

    /**
     * removes the data in the given index
     * @param index to remove the element from our LinkedList
     */
    public void removeAt(int index){

        if(index<=0 || index > size){
            return;
        }else if(index == 1){
            removeFirst();
        }else if(index == size){
            removeLast();
        }else {
            Node n = header;
            int count = 1;
            while (count <= index) {
                n = n.next;
                count++;
            }
            n.previous.next = n.next;
            n.next.previous = n.previous;
            size--;
        }
    }

    /**
     * removed the first element in the list
     */
    public void removeFirst(){
        if(size!=0) {
         header.next.next.previous = header;
         header.next = header.next.next;
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

            lastNode = lastNode.previous;
            lastNode.next = null;

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
     * @return the reverse of LinkedList
     */
    public String printReverse(){
       String result = "";
       Node last = lastNode;
       int length = size;
       while(length >= 1){
           result = result + last.data + " ";
           last = last.previous;
           length--;
       }
       return result;
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
