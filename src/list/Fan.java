public class FList {

    Node head;

    public FList(int[] a) {
        Node p = head;
        for(int i = 0; i < a.length; i++){
            p.next = new Node();
            p.value = a[i];
            p = p.next;
        }
    }

    public void fan(){
        Node p = head;
        Node prev = null;
        while(true) {
            if(p.next == null) break;
            p.next = prev;
            prev = p;
            p = p.next;
        }
    }

    public void toString() {
        Node p = head;
        while(p != null) {
            System.out.print(p.value);
            p = p.next;
        }
    }

    public class Node {
        int value;
        Node next;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        FList list = new FList(a);
        list.toString();
        list.fan();
        list.toString();
    }
}