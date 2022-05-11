import java.util.Scanner;

public class M3_16 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("円の半径を求めます");
        System.out.print("半径：");
        int num = stdIn.nextInt();

        double PI = 3.14;

        System.out.println(num * num * PI);

        stdIn.close();
    }
}
