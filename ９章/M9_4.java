import java.util.Scanner;

public class M9_4 {
    static void Ave(int a) {
        System.out.println(a + "の9倍は" + a * 9 + "です");
    }
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数を入力してください：");
        int num = stdIn.nextInt();

        Ave(num);

        stdIn.close();
    }
}
