import java.util.Random;

public class M9_11 {
    static String uranai(int a) {
        String num = "絶好調";
        if (a == 2) num = "好調";
        if (a == 3) num = "不調";
        if (a == 4) num = "絶不調";

        return num;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int cum = random.nextInt(1,5);

        System.out.println("今日の運勢：" + uranai(cum));
    }
}
