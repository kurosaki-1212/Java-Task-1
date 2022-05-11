public class M8_7 {
    public static void main(String[] args) {
        
    int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int wk;
    
    for (int i =0; i < array.length-1; i++) {
        for (int j = i + 1; j < array.length; j++) {
            if (array[i] < array[j]) {
                wk = array[i];
                array[i] = array[j];
                array[j] = wk;
            }
        }
    }

    for (int num: array) {
        System.out.println(num);
    }

}
}