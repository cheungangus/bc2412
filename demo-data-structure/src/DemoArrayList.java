import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        System.out.println("==========================");

        // Many String = String[]
        // Array : fixed length
        String[] ss = new String[3];
        String[] ss2 = new String[] {"abc", "ijk", "xyz"};
        // ss2 is an address of the array, ss2[0]
        System.out.println(ss2[1]); // ijk, read the "ijk" position directly
        // ArrayList: Variable Length
        // Underlying data strucutre -> array
        System.out.println("==========================");
        ArrayList<String> strings = new ArrayList<>(); 
        strings.add("ABC");  // arr with size 0
        strings.add("IJK"); // arr with size 1
        System.out.println(strings.size()); //2, arr.length
        System.out.println(strings.get(1));// IJK,  jump to the elements with index 1 directly
        System.out.println(strings.get(0)); // ABC
        // System.out.println(strings.get(2)); // java.lang.IndexOutOfBoundsException
        System.out.println("==========================");

        // Book[]
        ArrayList<Book> books = new ArrayList();
        books.add(new Book("ABC"));
        books.add(new Book("IJK"));
        books.remove(0); // remove book by index
        System.out.println(books.size()); // 1  -> After remove
        books.add(new Book("XYZ"));
        books.remove(new Book("IJK")); // after @Override equals() in Book. class
        // ArrayList. remove(object obj) -> Book.equals()
        // Generics Design ensure the Type must contains equals()
        System.out.println(books.size()); // 1


            // Requires @Override equals()
            System.out.println(books.contains(new Book("XYZ"))); // true
            System.out.println(books.indexOf(new Book("XYZ")));  // 0
            System.out.println("==========================");

            books.clear(); // create a new array with size 0
            System.out.println(books.add(new Book("ABCD")));
            System.out.println(books.isEmpty());
        // search part of the title for  book - for loop
        // for- each support Array list
        // boolean found = false;
        String bookName = "Not Found." ;
        for (Book book : books){
            if (book.getNmae().contains("BC")){
                //found = true ;
                bookName= book.getNmae();
                break;
            }
        }
        System.out.println("Book " +  bookName + " is available.");
    }
}

