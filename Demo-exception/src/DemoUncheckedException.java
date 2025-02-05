public class DemoUncheckedException {
    // 2 Types exceptions: 
    // 1) check exception  - Exception.class( Compile - time) 
    // 2) Unchecked Exception  - runtimeException.class (Runtime)

    // define Unchecked Exception
    public static class Businessexception extends Exception{

    }

    // define Unchecked Exception
    public static class BusinessRuntimeException extends  RuntimeException{

    }

    // who is the caller of main() method?
    // JVm (Java Virtual Machine ) call this main method
    public static void main(String[] args) throws Businessexception {
        int sum = 0;
        sum = sum (10,1);
        try {
            sum(1,null); // throw checked exception (comile time)
        System.out.println("sum=" + sum);
        } catch (Businessexception e) {
        System.out.println("x and y cannot be null. ");
       }

       // for runtime exception , you can cathc or not cathc (Syntax perspective)
       sum = sum2(10, null); // Syntax ok, but the exception still exits
       try {
           sum = sum2 ( 10, null); // throw unchecked exception (run time)
           System.out.println("sum=" + sum);
       } catch (Businessexception e) {
        System.out.println("x and y cannot be null.");
       }
    }
    public static int sum (Integer x , Integer y) throws Businessexception{
        
        if ( x == null || y == null)
        throw new Businessexception();
        return x.intValue() + y.intValue();
    }

    public static int sum2 (Integer x , Integer y) throws Businessexception{
        
        if ( x == null || y == null)
        throw new Businessexception();
        return x.intValue() + y.intValue();
    }

}
