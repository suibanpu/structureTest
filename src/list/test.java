public class StringList {
    Node head = new Node();
    public StringList(char[] str) {
        Node p = head;
        for(int i = 0; i < char.length; i++){
            p.next = new Node{char[i]};;
            p = p.next;
        }
    }

    public String toString(){
        Node p = head;
        while(p != null) {
            System.out.println(p.value);
            p =p.next;
        }
    }

    public class Node {

        public Node(String value) {
            value = v;
        }
        String value;
        Node next;
    }

    public static void main(String[] args) {
        StringList list = new StringList{"abc d cba"};
        list.toString();
    }
}





