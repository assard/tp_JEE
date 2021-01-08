package tsi.ensg.jee.tp2.exo2;

public class Book {

    private String title;
    private long ref;

    public Book(String title, long ref){
        this.title = title;
        this.ref = ref;
    }

    @Override
    public String toString(){
        return "Title of the book : " + this.title + "\n reference : " + this.ref;
    }

}
