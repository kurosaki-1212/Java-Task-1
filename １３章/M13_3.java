interface IPerson {
    public void introduce();
}

class Teachers implements IPerson {

    private String name = "";

    private String job = "";

    private String subject = "";
    
    public Teachers(String name, String job, String subject) {
        this.name = name;
        this.job = job;
        this.subject = subject;
    }

    @Override
    public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職業：" + job);
        System.out.println("担当科目：" + subject);
    }

}

class Coook implements IPerson {
    private String name;
    private String job;
    private String specialties;

    public Coook(String name, String job, String specialties) {
        this.name = name;
        this.job = job;
        this.specialties = specialties;
    }

    public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("得意料理：" + specialties);
    }
}

public class M13_3 {
    public static void main(String[] args) {
        Teachers teacher = new Teachers("竹井一馬", "教員", "情報処理");
        Coook cook = new Coook("大原太郎", "シェフ", "オムライス");

        teacher.introduce();
        cook.introduce();
    }
}
