import java.util.Scanner;

public class M3_14 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("長方形の面積を求めます");
        System.out.print("縦の長さ：");
        int num = stdIn.nextInt();

        System.out.print("横の長さ");
        int num1 = stdIn.nextInt();

        System.out.println("長方形の面積 = " + (num * num1));
        stdIn.close();
    }
        
}
