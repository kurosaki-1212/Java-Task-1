import java.util.Scanner;

abstract class BasicStudent {
    protected String name;
    protected String no;
    protected String schholName;

    abstract void constract();

    public BasicStudent(String name, String no, String schoolName) {
        this.name = name;
        this.no = no;
        this.schholName = schoolName;
    }
}

class ITStudent extends BasicStudent {
    private double html;
    private double javaScript;
    private double java;

    public ITStudent(String name, String no, String schoolName, Double html, Double javaScript, Double java) {
        super(name, no, schoolName);
        this.html = html;
        this.javaScript = javaScript;
        this.java =java;
    }

    static double calcAve(Double a, Double b, Double c) {
        return (a + b + c) / 3;
    }

    @Override
    void constract() {
        System.out.println(schholName + "の学生番号" + no + " " + name + "さんの平均点は" + calcAve(html, javaScript, java)); 
    }
}

class BookKeepingStudent extends BasicStudent {
    private double accounting;
    private double business;

    public BookKeepingStudent(String name, String no, String schoolName, double accounting, double business) {
        super(name, no, schoolName);
        this.accounting = accounting;
        this.business = business;
    }

    static double calcAve(Double a, Double b) {
        return (a + b) / 2;
    }

    @Override
    void constract() {
        System.out.println(schholName + "の学生番号" + no + " " + name + "さんの平均点は" + calcAve(accounting, business)); 
    }
}

public class M13_2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("簿記学校生の名前を入力して下さい：");
        String name = stdIn.next();
        System.out.print(name + "さんの学生番号を入力してください：");
        String no = stdIn.next();
        System.out.print(name + "さんの学校名を入力してください：");
        String schoolName = stdIn.next();
        System.out.print(name + "さんの会計学の得点を入力してください：");
        double accounting = stdIn.nextDouble();
        System.out.print(name + "さんのビジネスの得点を入力してください：");
        double business = stdIn.nextDouble();

        System.out.print("情報学校生の名前を入力して下さい：");
        String name2 = stdIn.next();
        System.out.print(name2 + "さんの学生番号を入力してください：");
        String no2 = stdIn.next();
        System.out.print(name + "さんの学校名を入力してください：");
        String schoolName2 = stdIn.next();
        System.out.print(name + "さんのの得点を入html力してください：");
        double html = stdIn.nextDouble();
        System.out.print(name + "さんのjavaScriptの得点を入力してください：");
        double javaScript = stdIn.nextDouble();
        System.out.print(name + "さんのjavaの得点を入力してください：");
        double java = stdIn.nextDouble();

        BookKeepingStudent bookKeepingStudent = new BookKeepingStudent(name, no, schoolName, accounting, business);
        bookKeepingStudent.constract();

        ITStudent itStudent = new ITStudent(name2, no2, schoolName2, html, javaScript, java);
        itStudent.constract();

        stdIn.close();
    }
}
