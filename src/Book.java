public class Book {
    private Author author;
    private String title;
    private int page;
    private String type;
    private boolean isHardCover;
    private int currentPage;
    private static int counter = 0;//metaspace

    public Book(Author author, String title, int page, String type, boolean isHardCover, int currentPage) {
        this.author = author;
        this.title = title;
        this.page = page;
        this.type = type;
        this.isHardCover = isHardCover;
        this.currentPage = currentPage;
        author.setBook(this);
        instanceCounter();
    }

    private static void instanceCounter() {
        counter++;
    }

    static int howManyInstance() {
        return counter;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
