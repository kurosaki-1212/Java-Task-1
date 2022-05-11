import java.util.Scanner;

public class M4_2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("0～100 までの得点（整数値）を 2 つ入力してください：");
        int num = stdIn.nextInt();
        int num1 = stdIn.nextInt();

        if (num == 100 && num1 == 100) {
            System.out.println("満点です");
        }
        stdIn.close();
    }
}
