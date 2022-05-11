import java.util.Scanner;

public class M9_10 {
    static void Hw(Float a, Float b) {
        System.out.println("BMI値は" + b / (a * a) + "です");
        System.out.println("適正体重は" +(a * a) * 22 + "kgです");
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("身長を入力してください：");
        Float num = stdIn.nextFloat();
        num = num / 100;
        System.out.print("体重を入力してください：");
        Float num1 = stdIn.nextFloat();

        Hw(num, num1);

        stdIn.close();
    }
}
