import java.util.Scanner;

public class M5_1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("A～D の値を入力してください：");
        String num = stdIn.next();

        switch (num) {
            case "A":
                System.out.println("ランク A は評価「優」です");
                break;
            case "B":
                System.out.println("ランク B は評価「良」です");
                break;
            case "C":
                System.out.println("ランク C は評価「可」です");
                break;
            case "D":
                System.out.println("ランク D は評価「不可」です");
            stdIn.close();
        }
    }
}
