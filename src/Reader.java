import java.util.ArrayList;

public class Reader {
    private String name;
    private int age;
    private char sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    void read(Book book) {
        if (book.getPage() == book.getCurrentPage())
            System.out.println("Book reading completed.");
        else if (book.getPage() <= book.getCurrentPage() + 10) {
            book.setCurrentPage(book.getPage());
            System.out.println("Book reading completed.");
        } else {
            book.setCurrentPage(book.getCurrentPage() + 10);
            System.out.println("10 pages read.");
        }
    }
}

