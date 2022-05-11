abstract class Person {
    protected String name;
    protected String job;

    abstract void introduce();

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }
}

class Teacher extends Person {

    private String subject;

    public Teacher(String name, String job, String subject) {
        super(name, job);
        this.subject = subject;
    }

    @Override
    void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("担当科目：" + subject);
    }
}

class Cook extends Person {
    private String specialties;

    public Cook(String name, String job, String specialties) {
        super(name, job);
        this.specialties = specialties;
    }

    @Override
    void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("担当科目：" + specialties);
    }
}


public class M13_1{
    public static void main(String[] args) {
        Teacher teacher = new Teacher("竹井一馬", "教員", "情報処理");
        Cook cook = new Cook("大原太郎", "シェフ", "オムライス");

        teacher.introduce();
        System.out.println("");
        cook.introduce();
    }
}
