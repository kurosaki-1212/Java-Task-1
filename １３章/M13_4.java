import java.util.Scanner;

interface CalcAddSub {
    public void dispAdd(int num1, int num2);

    public void dispSub(int num1, int num2);
}

interface ClacMultiDiv {
    public void dispMulti(int num1, int num2);
    
    public void dispDiv(int num1, int num2);
}

class ClacExcuter implements CalcAddSub,ClacMultiDiv{
    public void dispAdd(int num1, int num2) {
        System.out.println("足し算の結果：" + (num1 + num2));
    }

    public void dispSub(int num1, int num2) {
        System.out.println("引き算の結果：" + (num1 - num2));
    }

    public void dispMulti(int num1, int num2) {
        System.out.println("掛け算の結果：" + (num1 * num2));
    }

    public void dispDiv(int num1, int num2) {
        System.out.println("割り算の結果：" + (num1 / num2));
    }
}


public class M13_4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("１個目の整数を入力してください：");
        int num = stdIn.nextInt();
        System.out.print("２個目の整数を入力してください：");
        int num2 = stdIn.nextInt();
        
        ClacExcuter calcexcuter = new ClacExcuter();
        calcexcuter.dispAdd(num, num2);
        calcexcuter.dispSub(num, num2);
        calcexcuter.dispMulti(num, num2);
        calcexcuter.dispDiv(num, num2);

        stdIn.close();

    }
}
