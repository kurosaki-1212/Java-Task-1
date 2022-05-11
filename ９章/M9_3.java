import java.util.Scanner;

public class M9_3 {
    static void mozi (String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }
        public static void main(String[] args) {
            Scanner stdIn = new Scanner(System.in);

            System.out.print("文字を入力：");
            String str = stdIn.next();
            System.out.print("数字を入力：");
            int num = stdIn.nextInt();

            System.out.print("文字を入力：");
            String str1 = stdIn.next();
            System.out.print("数字を入力：");
            int num1 = stdIn.nextInt();

            System.out.print("文字を入力：");
            String str2 = stdIn.next();
            System.out.print("数字を入力：");
            int num2 = stdIn.nextInt();

            mozi(str, num);
            mozi(str1, num1);
            mozi(str2, num2);

            stdIn.close();
        }
    }
