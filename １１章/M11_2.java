class CalcExecutor {
    /* """ 計算実行クラス """ */
    static int x;
    static int y;

    CalcExecutor(int x, int y) {
        CalcExecutor.x = x;
        CalcExecutor.y = y;
    }

    /* """ 合計値を取得 """ */
    int sum() {
        int res = 0;
        for (int num = x; num < y + 1; num++){
            res += num;
        }
        return res;
    }
}

class Sample11_2 {
    public static void main(String[] args){

        /* # 計算実行と結果の表示 */

        /* # 計算実行インスタンスの生成 */
        CalcExecutor calc_exec = new CalcExecutor(100, 200);

        /* # 合計値を取得 */
        int total = calc_exec.sum();
        /* # 結果を表示 */
        System.out.println(CalcExecutor.x + "から" + CalcExecutor.y + "の合計値は" + total + "です。");
    }
}

