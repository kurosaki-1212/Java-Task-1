class Persoon {
    String status = "正常";
    String name;
    int age;
    String home;
    String mail;

    Persoon(String name, int age, String home, String mail) {
        this.status = "正常";
        this.set_name(name);
        this.set_age(age);
        this.set_home(home);
        this.set_mail(mail);
    }
    void set_name(String name) {
        this.name = name;
    }
    void set_age(int age) {
        this.age = age;

        if (this.is_valid_age(age) == false) {
            this.status = "異常";
        }
    }

    void set_home(String home) {
        this.home = home;
    }

    void set_mail(String mail) {
        this.mail = mail;

        if(this.is_valid_mail(mail) == false) {
            this.status = "異常";
        }
    }

    boolean is_valid_age(int age) {
        boolean result = true;
        if(age < 0 || age > 99) {
            result = false;
        }
        return result;
    }

    boolean is_valid_mail(String mail) {
        boolean result = true;

        if (mail.indexOf("@") <= 0) {
            result = false;
        }
        return result;
    }

    void disp_info() {
        System.out.println(this.name + "さん" + this.age + "歳" + this.home + "　" + this.mail + "　" + this.status);
    }
}

public class M11_8 {
    public static void main(String[] args) {
        Persoon person1 = new Persoon("A", 18,"千代田区神田神保町 1-1", "aaa@mail.com");
        Persoon person2 = new Persoon("B", -3,"横浜市西区桜木町 2-2-2", "bbb@mail.com");
        Persoon person3 = new Persoon("C", 20,"さいたま市北区大原 3-3", "@email.co.jp");

        person1.disp_info();
        person2.disp_info();
        person3.disp_info();
    }
}
