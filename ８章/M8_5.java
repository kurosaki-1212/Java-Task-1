public class M8_5 {
    public static void main(String[] args) {
        int [] num = {1, 2, 3, 4, 5};

        int total = 0;
        double average = 0.0;

        for (int i = 0; i < num.length; i++) {
            total += num[i];
        }

        average = total / num.length;

        System.out.println(total);
        System.out.println(average);
    }
}