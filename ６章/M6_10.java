import java.util.Scanner;

public class M6_10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("2~20までの整数値を入力してください");
        int num = stdIn.nextInt();

    if (num > 1 && num < 21) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++)
            System.out.print("*");
        System.out.println();
        } 
        } else {
            System.out.print("値が正しくありません");
        }
        stdIn.close();
    }
}
