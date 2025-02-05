
import org.w3c.dom.Node;


public class NodeExample {
    private Node node; // node -> address
    // private String name; name -> address
    private int value;

    public Node(){

    }

    public Node(int value){  // 可以public Node(int value) or public Node(int value)
        this.value = value;
    }
    // You are setting the next node to the current node
    public void setNode (Node node){
        this.node = node;
    }

    // getter
    // public Node getNode(){
        public Node next(){
        return this.node;
    }
    public int getValue(){
        return this. value;
    }

    public static void main(String[] args) {
        // 3 objects ( 3個new = 3個 objects) 
        Node head = new Node(40);
        Node node2 = new Node(50);
        head.setNode(node2);
        Node node3 = new Node(60);
        node2.setNode(node3);
        node3.setNode(new Node(70));  //直接插入node3 . lost "new node(70) address"

        Node temp = head;
        while(temp != null){ // can I exit?
            System.out.println(temp.getValue());
            temp = temp.next();
        }

        // array vs linkedlist
    }
}
