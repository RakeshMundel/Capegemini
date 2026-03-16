package dependencyInjection;


import java.util.List;

public class Library1 {

    private int id;
    private String name;
    private List<Book> books;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", booklist=" + books +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBook() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }



}