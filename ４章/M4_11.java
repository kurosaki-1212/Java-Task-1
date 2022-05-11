import java.util.Scanner;

public class M4_11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("西暦を入力して下さい");
        int num = stdIn.nextInt();

        // 別解 if ((num % 4 == 0 && num % 100 != 0) || (num % 4 == 0 && num % 400 == 0))

        if (num % 400 == 0) {
            System.out.println("閏年");
        } else if (num % 100 == 0) {
            System.out.println("平年");
        } else if (num % 4 == 0) {
            System.out.println("閏年");
        } else {
            System.out.println("平年です");
        } stdIn.close();
    }
}
