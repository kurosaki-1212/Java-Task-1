import java.util.Scanner;

class Circle {
    static final double PI = 3.1415;

    double getEnsyu(int a) {
        double result = a * 2 * PI;
        return result;
    }
    double getMenseki(int a) {
        double result = a * a * PI;
        return result;
    }
}

public class M11_1 {
        public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("半径を整数値で入力：");
        int num = stdIn.nextInt();

        Circle circle = new Circle();

        double ensyu = circle.getEnsyu(num);

        double menseki = circle.getMenseki(num);

        System.out.println("円周" + ensyu);
        System.out.println("面積" + menseki);

        stdIn.close();
    }
}
