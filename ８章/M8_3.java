// import java.net.PasswordAuthentication;
// import java.util.Arrays;
// import java.util.Scanner;

// public class M8_3 {
//     public static void main(String[] args) {
//         Scanner stdIn = new Scanner(System.in);
//         int sum = 1;
//         for (int i = sum; sum < 11; sum++) {
//         System.out.print( sum + "件目を入力 = ");
//         int num = stdIn.nextInt();
//         if (num % 2 == 0) {
//         int [] a = {num};
//         System.out.println("偶数列" + Arrays.toString(a));
//         } else {
//         int [] b = {num};
//         System.out.println("奇数列" + Arrays.toString(b));
//         }
//     }
//     }
// }

import java.util.Scanner;

class Sample8_3 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int num = 0, even_cnt = 0, odd_cnt = 0;

        /*  入力された整数を偶数値のリストと奇数値のリストにそれぞれ格納して表示 */

        /*  偶数値リスト */
        int[] even_array = new int[10];
        /*  奇数値リスト */
        int[] odd_array = new int[10];

        for (int i=0; i < 10; i++){
            System.out.print((i+1) + "件目：整数を入力 = ");
            num = stdIn.nextInt();

            /*  偶数と奇数の判定 */
            if (num % 2 == 0){
                /*  偶数値リストに追加 */
                even_array[even_cnt] = num;
                even_cnt++;
            } else {
                /*  奇数値リストに追加 */
                odd_array[odd_cnt] = num;
                odd_cnt++;
            }
        }

        /*  偶数値リストの内容を表示 */
        System.out.print("偶数値リスト = [" );
        for (int i=0; i < even_cnt; i++){
            System.out.print(even_array[i]);
            if ( i+1 != even_cnt){
                System.out.print(", ");
            }
        }
        System.out.println("]");

        /*  奇数値リストの内容を表示 */
        System.out.print("奇数値リスト = [" );
        for (int i=0; i < odd_cnt; i++){
            System.out.print(odd_array[i]);
            if ( i+1 != odd_cnt){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        stdIn.close();
    }
}
