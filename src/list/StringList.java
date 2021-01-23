public class StringList {
    Node head = new Node("");
    int size;
    public StringList(String str) {
        Node cur = head;
        Node prev = null;
        String[] temp = str.split("");
        for(int i = 0; i < temp.length; i++){
            cur.prev = prev;
            cur.value = temp[i];
            if(i == temp.length - 1) {
                cur.next = head;
                head.prev = cur;
            } else {
                cur.next = new Node("");
                prev = cur;
                cur = cur.next;
            }
            size = i + 1;
        }
    }

    public String toString(){
        Node p = head;
        int count = 0;
        while(p != null && count < size) {
            System.out.println(p.value);
            p =p.next;
            count++;
        }
        return "";
    }

    public class Node {

        public Node(String value) {
            this.value = value;
        }
        String value;
        Node next;
        Node prev;
    }

    public static void main(String[] args) {
        StringList list = new StringList("abcefecba");
        Node start = list.head;
        Node end = list.head.prev;
        int count = 0;
        while(true) {
            if(start.value.equals(end.value)) {
                start = start.next;
                end = end.prev;
            }
            count++;
            boolean exit = list.size %  2 == 0 ? (count == list.size / 2) : (count == (list.size - 1) / 2);
            if(exit) {
                System.out.println(start.value + "---" + end.value + "--" + list.size);
                System.out.println(list.toString());
                break;
            }
        }
    }
}





