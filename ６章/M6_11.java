import java.util.Scanner;

public class M6_11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("行数の入力");
        int num = stdIn.nextInt();
        if (num < 2 || num > 20) {
            System.out.println("値が正しくありません");
        } else {
            System.out.print("列数の入力");
        int num1 = stdIn.nextInt();
        if (num1 < 2 || num1 >20) {
            System.out.println("値が正しくありません");
        } else {
            for (int i = 1; i <= num; i++) {
                for(int j = 1; j <= num1; j++)
                System.out.print("*");
            System.out.println();
            stdIn.close();
        }
    }
    }
}
}

        