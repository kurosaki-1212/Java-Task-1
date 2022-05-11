public class M9_6 {
    static void sum(int[] x) {
        int t = 0;
        for(int a : x) {
            t += a;
        }
        System.out.println("合計値＝" + t );
    }
    public static void main(String[] args) {
        int[] num = {4,10,59,679,1991,3994,6789,19324};
        sum(num);
    }
}
