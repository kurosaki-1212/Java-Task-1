import java.util.Scanner;

public class M9_9 {
    static void en(Float a) {
        System.out.println("半径" + a + "の円周は" + a * 2 * 3.14);
        System.out.println("半径" + a + "の面積は" + a * a * 3.14);
    }
    public static void main(String[] args) {
        Scanner stdIn =new Scanner(System.in);

        System.out.print("半径を入力してください");
        Float num = stdIn.nextFloat();
        
        en(num);

        stdIn.close();
    }
}
