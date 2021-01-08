package tsi.ensg.jee.tp2.exo2;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Library {

    @Autowired
    private Set<Book> books;

    public Library(){
        this.books = new HashSet<Book>();
    }

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
