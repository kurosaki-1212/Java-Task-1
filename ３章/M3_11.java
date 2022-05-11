import java.util.Scanner;

public class M3_11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("文字列１：");
        String str = stdIn.next();
        System.out.print("文字列２：");
        String str1 = stdIn.next();

        System.out.println(str1 + str);

        stdIn.close();
    }
}
