class Animal {
    protected String name = "";

    public Animal(String name) {
        this.name = name;
    }

    public void move(int length) {
        System.out.printf("%sは、%dメートル動きました\n", name, length);
    }
}

class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void move(int length) {
        System.out.printf("%sは、%dメートル走りました\n", name, length);
    }
}

class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void move(int length) {
        System.out.printf("%sは。%dメートル飛びました\n", name, length);
    }

}

class Whale extends Animal{
    public Whale(String name) {
        super(name);
    }

    @Override
    public void move(int length) {
        System.out.printf("%sは。%dキロメートル泳ぎました\n", name, length);
    }
}

public class M12_3 {
    public static void main(String[] args) {
        Dog dog = new Dog("犬");
        Bird bird = new Bird("鳥");
        Whale whale = new Whale("鯨");

        dog.move(10);
        bird.move(1000);
        whale.move(50);
    }
}
