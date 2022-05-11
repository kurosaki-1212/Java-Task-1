import java.util.Scanner;

public class M6_16 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);


        int sum = 0;
        for (int i = 1; i <11; i++) {
            System.out.print(i + "回目の入力：");
            int num = stdIn.nextInt();
            if (num == 0) {
                System.out.println("0入力されました");
                break;
            }
            sum += num;
        }System.out.println("合計：" + sum);
        stdIn.close();
    }
}
