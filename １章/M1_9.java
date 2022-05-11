import java.util.Scanner;

public class M1_9 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("お名前を入力してください＞");
        String str = stdIn.next();

        System.out.print("こんにちは" + str + "さん！");
        stdIn.close();
    }
}
