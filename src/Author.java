public class Author {
    private String name;
    private Book book;

    public Author(String name, Book book) {
        this.name = name;
        this.book = book;
    }
    public Author(String name) {
        this(name, null);
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
