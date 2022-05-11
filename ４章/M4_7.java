import java.util.Scanner;

public class M4_7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("文字を2 つ入力してください：");
        String str = stdIn.next();
        String str1 = stdIn.next();

        if (str == str1) {
            System.out.println("同じ文字です");
        } else {
            System.out.println("異なる文字です");
        }
        stdIn.close();
    }
}
