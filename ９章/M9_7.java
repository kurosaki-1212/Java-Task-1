import java.util.Scanner;
import java.util.Arrays;

public class M9_7{
    static void sum(Integer[] x, int num) {
        if (Arrays.asList(x).contains(num)) {
            System.out.println(num + "は配列の中にあります");
        }
        else{
            System.out.println(num + "は配列の中にありません");
        }
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Integer[] num = {4, 10, 59, 679, 1991, 3994, 6789, 19324};

        System.out.print("整数を入力してください：");
        int nuum = stdIn.nextInt();
        
        sum(num, nuum);

        stdIn.close();
    }
}
