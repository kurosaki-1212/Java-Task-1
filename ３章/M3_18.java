import java.util.Scanner;

public class M3_18 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("税込価格を求めます");
        System.out.print("定価：");
        int num = stdIn.nextInt();

        System.out.print("消費税：");
        int num1 = stdIn.nextInt();

        System.out.println("定価 = " + num);
        System.out.println("税率 = " + num1);
        System.out.println("定価 = " + (num / num1 + num));

        stdIn.close();
    }
}
