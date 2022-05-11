import java.util.Scanner;

public class M3_15 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("三角形の面積を求めます");
        System.out.print("底辺の長さ");
        int num = stdIn.nextInt();
        
        System.out.print("高さ");
        int num1 = stdIn.nextInt();

        System.out.println("三角形の面積" + (num * num1 /2));
        stdIn.close();
    }
}
