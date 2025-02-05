
import java.util.Optional;

public class DemoOptional {
    //Never use Optional Type as attribute type
    // firstName still can be null. but what is this meaning?
    private Optional<String> firstName;
    public static void main(String[] args) {
        // caller
        // Advantage : able to avoid null pointer exception
        Optional<String> result = concat("abc", "def");
        //isPresent
        if(result.isPresent()){
            System.out.println(result.get());
        }

        String result2 = concat(Optional.of("abc"),Optional.of("def"));
    }
 // 1. Optional can only be used as a return type of method
 // if you decided to have a return type of optional, 
 // if implies you the result may be null
 
 // if a or b is null, then result is null 
 //if 
     public static Optional<String> concat(String a, String b){
        if (a == null || b == null)
        return Optional.empty();
        return Optional.of(a.concat(b));
    }

    // 2. never use optional as input parameter 
    // x and y  still can be null (not safe)
    public static String concat(Optional<String> x, Optional<String>y){
        if (x == null || y == null)
        return null;
        if (!x.isPresent() || !y.isPresent())
        return null;
        return x.get().concat(y.get());
    }
}
