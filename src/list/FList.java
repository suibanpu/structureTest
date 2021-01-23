public class FList {

    Node head = new Node(-1);

    public FList(int[] a) {
        Node p = head;
        for(int i = 0; i < a.length; i++){
            p.value = a[i];
            if (i < a.length - 1) {
                p.next = new Node();
                p =  p.next;
            }
        }
    }

    public Node fan() {
        Node p = head.next;
        Node prev = head;
        Node temp = null;
        while(p != null) {
            temp = p.next;        
            p.next = prev;
            prev = p;
            p = temp;
        }
        head.next = null;
        return prev;
    }

    public String toString(Node h) {
        Node p = h == null ? head : h;
        while(p != null) {
            if(p.value != -1) {
                System.out.println(p.value);
            }
            p = p.next;
        }
        return "";
    }

    public class Node {
        private Node() {}
        private Node(int value) {
            this.value = value;
        }
        int value;
        Node next;
    }

    public static void main(String[] args) {
        // int[] a = {1,2,3,4,5,6};
        // FList list = new FList(a);
        // list.toString(null);
        // System.out.println("-----------");
        // Node h = list.fan();
        // list.toString(h);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("aaa", 10);
        map.put("aaa", 11);

        for(Map.Entry entry : map.entrySet()){
            System.out.println("MAP = " + entry.getKey() + entry.getValue());
        }
    }
}