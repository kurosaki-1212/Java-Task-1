class Person {
    protected String name = "";
    protected String job = "";

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職業：" + job);
    }
}

class Teacher extends Person{
    private String subject = "";

    public Teacher(String name, String job, String subject) {
        super(name, job);
        this.subject = subject;
    }

    public void introduce() {
        System.out.println("氏名：" + super.name);
        System.out.println("職業：" + super.job);
        System.out.println("担当科目：" + subject);
    }
} 

class Cook extends Person{
    private String specialities = "";

    public Cook(String name, String job, String specialities) {
        super(name, job);
        this.specialities = specialities;
    }
        public void introduce() {
            System.out.println("氏名：" + super.name);
        System.out.println("職業：" + super.job);
        System.out.println("得意料理：" + specialities);
        }
}

public class M12_2 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("近藤勇", "教員", "Go言語");
        Cook cook = new Cook("沖田総司", "シェフ", "オムライス");

        teacher.introduce();
        System.out.println("");
        cook.introduce();
    }
}
