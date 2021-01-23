public class Queue {

    private Node head = new Node(0);
    private Node tail = head;

    public void enqueue(int value){ 
        Node temp = tail;
        tail = new Node(value);   
        temp.next = tail;
        head.value++;
    }

    public Node dequeue() {
        if(head.next == null){
            return null;
        }
        Node firstNode = head.next;
        head.next = head.next.next;
        head.value--;
        return firstNode;
    }

    private class Node {
        int value;
        Node next;

        private Node(int value) {
            this.value = value;
        }
        
    }

    public static void main(String[] args){

    }
}