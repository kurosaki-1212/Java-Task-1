class Animal2 {
    protected String name = "";

    public Animal2(String name) {
        this.name = name;
    }

    public void move(int length) {
        System.out.printf("%sは、%dメートル動きました\n", name, length);
    }

    public void food(String eat) {
        System.out.printf("%sは。%sを食べました\n", name, eat);
    }
}

class Dog2 extends Animal2{
    public Dog2(String name) {
        super(name);
    }

    @Override
    public void move(int length) {
        System.out.printf("%sは、%dメートル走りました\n", name, length);
    }

    @Override 
    public void food(String eat) {
        System.out.printf("%sは。%sを食べました\n", name, eat);
    }
}

class Bird2 extends Animal2{
    public Bird2(String name) {
        super(name);
    }

    @Override
    public void move(int length) {
        System.out.printf("%sは。%dメートル飛びました\n", name, length);
    }

    @Override 
    public void food(String eat) {
        System.out.printf("%sは。%sを食べました\n", name, eat);
    }

}

class Whale2 extends Animal2{
    public Whale2(String name) {
        super(name);
    }

    @Override
    public void move(int length) {
        System.out.printf("%sは。%dキロメートル泳ぎました\n", name, length);
    }

    @Override 
    public void food(String eat) {
        System.out.printf("%sは。%sを食べました\n", name, eat);
    }
}

public class M12_4 {
    public static void main(String[] args) {
        Dog2 dog = new Dog2("犬");
        Bird2 bird = new Bird2("鳥");
        Whale2 whale = new Whale2("鯨");

        dog.move(10);
        dog.food("お肉");
        bird.move(1000);
        bird.food("虫");
        whale.move(50);
        whale.food("オキアミ");
    }
}

