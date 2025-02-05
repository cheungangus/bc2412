import java.util.LinkedList;

// Last in First out
// in -> push
// out -> pop
public class MyStack<T> {
  private LinkedList<T> linkedList;

  public MyStack() {
    this.linkedList = new LinkedList<>();
  }

  public T pop() {
    return this.linkedList.pollLast();
  }

  public void push(T data) {
    this.linkedList.addLast(data);
  }

  public static void main(String[] args) {
    MyStack<String> strings = new MyStack<>();
    strings.push("ABC");
    strings.push("DEF");
    System.out.println(strings.pop()); // DEF
  }
}