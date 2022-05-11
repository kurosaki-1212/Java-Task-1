import java.util.Random;

class Sample11_4 {
    public static void main(String[] args){

        /* Randomクラスのインスタンス生成 */
        Random rand = new Random();
        /* # Personクラスのインスタンス生成  */
        Coincase coincase = new Coincase();

        /* # ランダムに硬貨を追加 */
        for (int i=0; i < 10; i++){
            int num = rand.nextInt(6);
            if (num == Coincase.COIN_1){
                coincase.add_coin(Coincase.COIN_1, 1);
            } else if (num == Coincase.COIN_5){
                coincase.add_coin(Coincase.COIN_5, 1);
            } else if (num == Coincase.COIN_10){
                coincase.add_coin(Coincase.COIN_10, 1);
            } else if (num == Coincase.COIN_50){
                coincase.add_coin(Coincase.COIN_50, 1);
            } else if (num == Coincase.COIN_100){
                coincase.add_coin(Coincase.COIN_100, 1);
            } else if (num == Coincase.COIN_500){
                coincase.add_coin(Coincase.COIN_500, 1);
            }
        }
        /* # 個人情報を表示 */
        for (int i=0; i < coincase.coins.length; i++){
            System.out.print(coincase.coins_type[i] + "円：" + coincase.get_coin_count(i) + "枚  ");
        }
        System.out.println("\n総額：" + coincase.get_amount() + "円");
    }
}

class Coincase {
    /* """ コインケースクラス """ */
    int[] coins = new int[6];
    int[] coins_type = {1, 5, 10, 50, 100, 500};

    final static int COIN_1  = 0;
    final static int COIN_5  = 1;
    final static int COIN_10  = 2;
    final static int COIN_50  = 3;
    final static int COIN_100 = 4;
    final static int COIN_500 = 5;

    /* # typeで指定された硬貨をcountで指定された枚数分追加 */
    void add_coin(int type,int count){
        this.coins[type] += count;
    }

    /* # typeで指定された硬貨の枚数を返却 */
    int get_coin_count(int type){
        return this.coins[type];
    }

    /* # 全硬貨の総額を返却 */
    int get_amount(){
        int total = 0;

        for (int i=0; i < coins.length; i++){
            total = total + coins[i] * coins_type[i];
        }
        return total;
    }
}