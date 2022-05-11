class CalcExector {
    int total = 0;

public int sum(int num1, int num2) {
    for (int i = num1; i <= num2; i++) {
        total += i;
    }
    return total;
    }
}

public class M11_3 {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;

        CalcExector calcExec = new CalcExector();

        int result = calcExec.sum(x, y);

        System.out.println(x + "から" + y + "までの合計値は" + result + "です");
    }
}
