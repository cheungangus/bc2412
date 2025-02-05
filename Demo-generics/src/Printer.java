

public class Printer {
    private Integer x;

    public Printer(Integer x){
        this.x = x;
    }
    public String print(){
        return "this is " + this.x ;
    }
    public static void main(String[] args) {
        Printer p1 = new Printer(10);
        System.out.println(p1.print());
        
        //what if Double Printer ? Long Printer ? BigDecimal Printer?
        // Another solution : Generics
        // 10 -> Integer 10 -> Long 10(Not OK)
        // 10L -> long 10
        GeneralPrinter<Long> longPrinter = new GeneralPrinter<Long>(10L);
        System.out.println(longPrinter.print());
        // you defind T as Long.

        GeneralPrinter<Book> bookPrinter = new GeneralPrinter<>(new Book ("ABC"));
        System.out.println(bookPrinter.print());
    }
}
