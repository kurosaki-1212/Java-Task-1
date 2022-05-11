import java.util.Scanner;

public class M6_6 {
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);

        System.out.print("開始数：");
        int num = stdIn.nextInt();

        System.out.print("終了数：");
        int num1 = stdIn.nextInt();

        int sum = 0;

        for (int i = num; i < num1 + 1; i++) {
            sum += i;
        } System.out.println(sum);
        stdIn.close();
    }
}
