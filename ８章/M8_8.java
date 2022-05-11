import java.util.Scanner;

class Sample8_8 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        /* 整数値を3つ入力させリストに格納後、最大値と最小値を表示する */
        int max, min;
        /* 整数値リスト */
        int[] array = new int[3];
        
        System.out.println("整数値を3つ入力してください。");
        /* 入力された整数値をリストに格納 */
        for (int i=0; i < array.length; i++){
            System.out.print((i+1) + "つ目の整数値：");
            array[i] = stdIn.nextInt();
        }

        max = min = array[0];
        for (int i=1; i < array.length; i++){
            if ( max < array[i]){
                max = array[i];
            }
            if (min > array[i]){
                min = array[i];
            }
        }
    
        /* 最大値を表示 */
        System.out.println("最大値：" + max);
        
        /* 最小値を表示 */
        System.out.println("最小値：" + min);

        stdIn.close();
    }
}