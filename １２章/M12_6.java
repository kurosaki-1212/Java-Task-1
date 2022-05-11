class Book {
    private static int counter = 0;
    protected String title = "";
    protected String auther = "";
    protected int price = 0;
    protected int id = 0;

    public static int getCount() {
        return counter;
    }

    public Book(String title, String auther, int price) {
        this.title = title;
        this.auther = auther;
        this.price = price;
        counter ++;
        this.id = getCount();
    }

    public void construct() {
        System.out.println("書名：" + title);
        System.out.println("著作名：" + auther);
        System.out.println("価格：" + price);
        System.out.println("識別番号：" + id);
    }


}

class PaperBook extends Book {
    private int page;

    public PaperBook(String title, String auther, int price, int page) {
        super(title, auther, price);
        this.page = page;
    }
@Override
    public void construct() {
        System.out.println("書名：" + title);
        System.out.println("著作名：" + auther);
        System.out.println("価格：" + price);
        System.out.println("識別番号：" + id);
        System.out.println("ページ数：" + page);
    }
}


class EBook extends Book {
    private int fileSize;

    public EBook(String title, String auther, int price, int fileSize) {
        super(title, auther, price);
        this.fileSize = fileSize;
    }
@Override
    public void construct() {
        System.out.println("書名：" + title);
        System.out.println("著作名：" + auther);
        System.out.println("価格：" + price);
        System.out.println("識別番号：" + id);
        System.out.println("ファイルサイズ；" + fileSize);
    }
}

public class M12_6 {
    public static void main(String[] args) {
        PaperBook book1 = new PaperBook("吾輩は猫である", "夏目漱石", 850, 245);
        PaperBook book2 = new PaperBook("ノルウェイの森", "村上春樹", 1200, 328);
        EBook book3 = new EBook("Python入門", "Python. org", 2400, 9824);
        EBook book4 = new EBook("Web技術の仕組み", "www. org", 4530, 12458);

        book1.construct();
        book2.construct();
        book3.construct();
        book4.construct();

        System.out.println("与えた識別番号＝" + Book.getCount());
    }
}



