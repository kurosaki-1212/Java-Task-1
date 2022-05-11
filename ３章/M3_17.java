import java.util.Scanner;

public class M3_17 {
    public static void main(String[] args) {
            Scanner stdIn = new Scanner(System.in);
            System.out.println("台形の面積を求めます");
            System.out.print("上底の長さ：");
            int upper = stdIn.nextInt();

            System.out.print("下底の長さ：");
            int bottom = stdIn.nextInt();

            System.out.print("高さ：");
            int height = stdIn.nextInt();

            System.out.println((upper + bottom) * height / 2);
            stdIn.close();
        }
    }