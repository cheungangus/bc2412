
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoSorting {
    public static void main(String[] args) {
        
        // bubbtle sort ( Nested Loop)
        List<Integer> integers = Arrays.asList(1,3,10,-4,2);
        
        //
        Collections.sort(integers); // pass by reference
        System.out.println(integers); //[-4, 1, 2, 3, 10]

        int[] arr = new int[] {10,2,9};
        allZero(arr);
        System.out.println(Arrays.toString(arr));  //[0, 0, 0]

        // In Java, array and all custom type are always pass by reference.
        //primitive , wrapper class & String are always pass by value ( a copy of value )

        // Custom Type(Book)
        Book book = new Book("Sun");
        changeBookName(book); // pass by Book reference
        System.out.println(book); /// Book[name=hello]

        // Primitives
        int a = 3;
        int b = 4;
        sum(a, b);
        System.out.println(sum(a,b)); //300 , passing a copy of values to the method
        System.out.println(a);  //3, but not 100, because we pass by value for primitives
        System.out.println(b);  // 4, but not 200, because we pass by value for primitives

        // Sort String by Collections.sort();
        BigDecimal bd1 = BigDecimal.valueOf(10);
        BigDecimal bd2 = BigDecimal.valueOf(3);
        System.out.orintln(addBigDecimal(bd1, bd2.doubleValue()));
        System.out.println(bd1.doubleValue());
        System.out.println(bd2.doubleValue());
    }
        public static int sum(int a, int b){ // a copy of value
            a = 100;
            b = 200;
            return a + b;
        }

        public static String concat(String x, String y){
            return x. concat(y);
        }

        // overflow -> int * int -> int
        // long * long -> long -> long
        public static Long multiply(int x, int y){
            return (long) x * (long) y; //  avoid overflow
        }

        public static void allZero(int[] arr){ 
  //      public static int[] allZero(int[] arr)  // pass by object reference 將一個given array update to zero
            for ( int i = 0; i < arr.length; i++){
                arr[i] =0;

            }
        }

    

    public static void changeBookName(Book book){
            book.setName("Hello");
        }
    // public static Book changeBookName( Book book){
    // return new Book("hello"); // Similar to BigDecimal
    // }
    

        // BigDecimal ? pass by value Or pass by reference
        // similar to String 
        public static void addBigDecimal(BigDecimal original, BigDecimal delta){
        // can you revise the value inside a BigDecimal Object?
        return original.add(delta); // always return a new BigDecimal Object
        }
    }

