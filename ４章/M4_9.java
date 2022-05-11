import java.util.Scanner;

public class M4_9 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("0～100 までの得点（整数値）を 2 つ入力してください：");
        int num = stdIn.nextInt();
        int num1 = stdIn.nextInt();

        if (num >= 80 || num1 >= 80) {
            System.out.println("合格です");
        } else {
            System.out.println("不合格です");
        }
        stdIn.close();
    }
}
