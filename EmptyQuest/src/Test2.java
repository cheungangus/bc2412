
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
       
        List<String> names = Arrays.asList("Peter", 
        "Paul", "Mary", "Peter");
        
        long count = names.stream()
        .distinct()
        .count();
        System.out.println(count);
        
        // filtering 
        List<String> names1 = Arrays.asList(
            "Peter", "Carl", "Benny" , "Alex"
        );
        List<String> filteredNames = names.stream()
        .filter(name -> name.contains("A"))
        .collect(Collectors.toList());
        System.out.println(filteredNames);

        // mapping
        List<String> mappedNames = names.stream()
        .map(name -> name.toUpperCase())
        .collect(Collectors.toList());
        System.out.println(mappedNames);

        //matching 
        boolean hasAlex = names.stream()
        .anyMatch(name -> name.contains("Alex"));
        System.out.println(hasAlex);

        //generating a sequence of numbers from 1 to 10
        List<Integer> numbers = Stream.iterate(1, n -> n + 1)
        .limit(10)
        .collect(Collectors.toList());
        System.out.println(numbers);

        // reducing - adding numbers in a list with initial value  of 0
        Integer reduced = numbers.stream()
        .reduce(0, (a,b) -> a + b);
        System.out.print(reduced);
    }


}
