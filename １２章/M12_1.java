import java.util.Scanner;

class Calculater {
    public int calcSum(int a, int b) {
    return a + b;
    }

    public double calcAve(int a, int b) {
        return (a + b) /2;
    }
}

class CalcMore extends Calculater {
    public int calcPower(int a, int b) {
        int sum = 1;
        for (int i = 1; i <= b; i++) {
            sum = sum * a;
        }
        return sum;
    }
}

public class M12_1 {
   public static void main(String[] args) {
       Scanner stdIn = new Scanner(System.in);

       System.out.print("整数を入力してください：");
       int num = stdIn.nextInt();
       System.out.print("整数を入力してください：");
       int num1 = stdIn.nextInt();

       CalcMore moreCalc = new CalcMore();
       
       int result = moreCalc.calcSum(num, num1);
       double result1 = moreCalc.calcAve(num, num1);
       int result2 = moreCalc.calcPower(num, num1);

       System.out.println("Sum" + num + "and" + num1 + "=" + result);
       System.out.println("Average" + num + "and" + num1 + "=" + result1);
       System.out.println("Power" + num + "of" + num1 + "=" + result2);

       stdIn.close();
   } 
}