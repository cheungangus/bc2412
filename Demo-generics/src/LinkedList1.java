public class LinkedList1 { // Alist of integers
    private Node head; // 儲存head

    //10 -> 20 -> 30 -> 40

    public LinkedList1(){

    }
    

    public void add(int value){
        if (this.head == null){
            this.head = new Node(value);
            return ;
        }
        Node first = head;
        while(first.next() != null){
            first = first.next();
        }
        first.setNode(new Node(value)); //0
    }

    public void remove() { // remove the head node.}
        if (this.head == null)
        return;
        this.head = this.head.next();
    }

    public int size(){
        int count = 0;
        Node first = this.head;
        while(first != null){
            first = first.next();
            count++;
        }
        return count;
    }

    @Override 
    public String toString(){
        Node first = this.head;
        String str = "Linkedlist1[";
        while(first == null){
            str += first .getValue() + ",";
            first = first.next();
    }
        return str.substring(0, str.length() - 1) + "]";
}
    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        System.out.println(ll.size());

    
}
}