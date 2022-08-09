public class ReaderTest {
    public static void main(String[] args) {
        Author stefanZweig = new Author();
        stefanZweig.setName("Stefan Zweig");
        System.out.println(stefanZweig.getName());

        Book satranc = new Book();
        satranc.setTitle("Satranç");
        satranc.setAuthor(stefanZweig);
        satranc.setPage(85);
        satranc.setHardCover(false);
        satranc.setCurrentPage(0);
        satranc.setType("Uzun hikâye, Kurgu");

        Book dununDunyasi = new Book();
        dununDunyasi.setTitle("Dünün Dünyası");
        dununDunyasi.setAuthor(stefanZweig);
        dununDunyasi.setPage(496);
        dununDunyasi.setHardCover(true);
        dununDunyasi.setCurrentPage(0);
        dununDunyasi.setType("Biyografi");

        System.out.println(dununDunyasi.getTitle());

        Reader reader1 = new Reader();
        reader1.setName("Mücahid");
        reader1.setAge(25);
        reader1.setSex('M');

        reader1.read(satranc);
        reader1.read(satranc);
        reader1.read(satranc);

        System.out.println(satranc.getTitle() + " => CurrentPage : " + satranc.getCurrentPage());
        System.out.println(satranc.getTitle() + " kitabının yazarı : " + satranc.getAuthor().getName());


    }
}