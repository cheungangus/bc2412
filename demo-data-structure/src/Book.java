
import java.util.Objects;

public class Book {
    private String name;

    public Book(String name){
        this.name = name;
    }

    public String getNmae(){
        return this. name;
    }
    public void setName(String name){
        this.name =name;
    }

    @Override
    public int hashCode(){
        return Object.hash(this.name);
                
    }


    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
            if(!(obj instanceof Book))
            return false;
            Book book = (Book) obj;
            return Objects.equals(this.name, book.getNmae());

    }

    @Override
    public String toString(){
        return "Book["//
        +"name=" + this.name //
        +"]";
    }
}
