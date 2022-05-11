import java.util.Scanner;

public class M9_5 {
    static void kazu (int a, int b) {
    System.out.println(a + "+" + b + "=" + (a + b));
    System.out.println(a + "-" + b + "=" + (a - b));
    System.out.println(a + "*" + b + "=" + (a * b));
    System.out.println(a + "/" + b + "=" + (a / b));
    System.out.println(a + "%" + b + "=" + (a % b));
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数を入力してください：");
        int num = stdIn.nextInt();
        System.out.print("整数を入力してください：");
        int num1 = stdIn.nextInt();

        kazu(num, num1);

        stdIn.close();
    }
}
