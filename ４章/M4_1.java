import java.util.Scanner;

public class M4_1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("0～100 までの得点（整数値）を入力してください：");
        int num = stdIn.nextInt();

        if (num >= 80) {
            System.out.println("合格です");
        }
        stdIn.close();
    }
}
