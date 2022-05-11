import java.util.Scanner;

public class M4_19 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値を入力してください");
        int num = stdIn.nextInt();

        if (num > 0) {
            System.out.println("正の数です");
        } else if (num < 0) {
            System.out.println("負の数です");
        } stdIn.close();
    }
}
