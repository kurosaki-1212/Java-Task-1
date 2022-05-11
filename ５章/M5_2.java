import java.util.Scanner;

public class M5_2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("クラス番号（１～３）の値を入力してください：");
        int num = stdIn.nextInt();

        switch (num) {
            case 1:
                System.out.println("情報処理コース");
                break;
            case 2:
                System.out.println("OA ビジネスコース");
                break;
            case 3:
                System.out.println("税理士コース");
                break;
            default:
                System.out.println("不正な入力です");
            stdIn.close();
        }
    }
}
