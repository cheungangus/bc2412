public class Person { // buleprint - define a person 
    // attirbutes
  private String name;
  private int age;
  private String emailAddress;

  // constructor ( Not method)
  // constructor is to creat object
  public Person(String name, int age, String emailAddress){
    this.name = name;
    this.age = age;
    this.emailAddress = emailAddress;
  }

    // getter (instance = object)
    // instance Method is able to return self value
    public String getName(){
      return this.name;
    }
    public int getAge(){
      return this.age;
    }
    public String getEmailAddress(){
      return this.emailAddress;
    }
    //setter 
    // void -> return
    public void setAge (int age){
      this.age = age;
    }
      public void setName(String name){
        this.name = name;
      }
      public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
      }

    
  }
    