
import java.util.function.Function;

// Function ( Java Built-in interface)
public class StringlengthFunction implements Function<String, Integer> {
    
    @Override
    public Integer apply(String s){
        return s. length();
    }

    public static void main(String[] args) {
        // Traditional Class & Interface
        StringlengthFunction slf = new StringlengthFunction();
        System.out.println(slf.apply("hello"));

        // Lambda Expression ( runtime define formula)
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println(stringLength.apply("hello"));
    }
}
