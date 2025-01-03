public class Dog extends Animal {
    // private String name;
    private int age;
    // constructor (Class Cannot inherit parent constructor)
    public Dog( String name, int age){
        // this.name = name;
        super(name);
        this.age = age ;
    }

    // walk()
    public void walk(){
            System.out.println("Dog is walking");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("DEF",9);
        dog.walk();
        System.out.println(dog.getName());
    }

}
