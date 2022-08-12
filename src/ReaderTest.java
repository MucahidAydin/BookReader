public class ReaderTest {
    public static void main(String[] args) {
        Author stefanZweig = new Author("Stefan Zweig");

        System.out.println(stefanZweig.getName());
        System.out.println("Oluşturulan nesne sayısı : " + Book.howManyInstance());


        Book satranc = new Book(stefanZweig, "Satranç", 85, "Uzun hikâye, Kurgu", false, 0);
        System.out.println(stefanZweig.getBook().getTitle());
        System.out.println("Oluşturulan nesne sayısı : " + Book.howManyInstance());


        Book dununDunyasi = new Book(stefanZweig, "Dünün Dünyası", 496, "Biyografi", true, 0);
        System.out.println("Oluşturulan nesne sayısı : " + Book.howManyInstance());

        System.out.println(dununDunyasi.getTitle());
        System.out.println(stefanZweig.getBook().getTitle());
        System.out.println("-----------------------");


        Reader reader1 = new Reader("Mücahid", 25, 'M');

        reader1.read(satranc);
        reader1.read(satranc);
        reader1.read(satranc);

        System.out.println(satranc.getTitle() + " => CurrentPage : " + satranc.getCurrentPage());
        System.out.println(satranc.getTitle() + " kitabının yazarı : " + satranc.getAuthor().getName());


    }
}