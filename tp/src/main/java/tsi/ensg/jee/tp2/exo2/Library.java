package tsi.ensg.jee.tp2.exo2;

import java.util.List;
import java.util.Set;

public class Library {

    private Set<Book> books;

    public Library(Set<Book> books){
        this.books = books;
    }

    public String toString(){
        String str = "";
        for (Book book: this.books) {
            str += book.toString() + "\n";
        }
        return str;
    }

}
