/** purpose : 
 * @author  vincent lau
 * @since 
 * @version 
 * date: 
 */
public class Person {
    private String name;
    private int age;
  
    public static Builder builder() {
      return new Builder();
    }
  
    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }
  
    private Person(Builder builder) {
      this.name = builder.name;
      this.age = builder.age;
    }
  
    public String getName() {
      this.name = name;
      return this.name;
    }
  
    public int getAge() {
      return this.age;
    }
  /**
   * 
   * @param name
   */
    public void setName(String name) {
      this.name = name;
    }
  
    public void setAge(int age) {
      this.age = age;
    }
  
    public static class Builder {
      private String name;
      private int age;
  
      // setter
      public Builder name(String name) {
        this.name = name;
        return this;
      }
  
      // setter
      public Builder age(int age) {
        this.age = age;
        return this;
      }
  
      public Person build() {
        return new Person(this);
      }
    }
  
    public static void main(String[] args) {
      Person p1 = new Person("Vincent", 18);
      Person p3 = new Person(null, 18); // not a good idea to pass null
  
      // advantages:
      // 1. You no longer need to pass null for those unnecessary attribute
      // 2. If there are many attribute (i.e. 20+ String), you have to manually check if the value is
      // passed to the right parameters
      Person p2 = Person.builder() //
          .name("Vincent") //
          .age(18) //
          .build();
      System.out.println(p2.getAge()); // 18
      System.out.println(p2.getName()); // Vincent
  
      Person p4 = Person.builder().build();
      System.out.println(p4.getAge()); // 0
      System.out.println(p4.getName()); // null
    }
  }