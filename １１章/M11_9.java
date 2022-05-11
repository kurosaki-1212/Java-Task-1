import java.util.Scanner;

class Sample11_9 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        Car[] car_array = { new Car("RX-7", "MAZDA", 5000000),
                            new Car("RX-8", "MAZDA", 8000000),
                            new Car("GT-R R34", "NISSAN", 10000000)
        };

        System.out.print("検索するキーワード:");
        String keyword = stdIn.next();
        
        boolean is_match = false;
        for (Car car : car_array){
            if (car.get_name().equals(keyword) || car.get_maker().equals(keyword)) {
                System.out.println("車名：" + car.get_name());
                System.out.println("メーカー名：" + car.get_maker());
                System.out.println("価格：" + car.get_price());
                System.out.println();

                is_match = true;
            }
        }
        if (!is_match){
            System.out.println("検索結果　0件");
            System.out.println("検索条件を変えてください。");
        }
        stdIn.close();
    }
}

class Car {
    private String name;
    private String maker;
    private int price;

    Car(String name, String maker, int price) {
        this.set_name(name);
        this.set_maker(maker);
        this.set_price(price);
    }

    String get_name(){
        return this.name;
    }

    String get_maker(){
        return this.maker;
    }

    int get_price(){
        return this.price;
    }

    void set_name(String name){
        this.name = name;
    }

    void set_maker(String maker){
        this.maker = maker;
    }

    void set_price(int price){
        this.price = price;
    }
}