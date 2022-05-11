class Animal3 {
    protected String name = "";

    public Animal3(String name) {
        this.name = name;
    }

    public void move(int length) {
        System.out.printf("%sは、%dメートル動きました\n", name, length);
    }

    public void food(String eat) {
        System.out.printf("%sは。%sを食べました\n", name, eat);
    }
}

class Dog3 extends Animal3{
    public Dog3(String name) {
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

class Bird3 extends Animal3{
    public Bird3(String name) {
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

class Whale3 extends Animal3{
    public Whale3(String name) {
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

class Human extends Animal3{
    public Human(String name) {
        super(name);
    }

    @Override
    public void move(int length) {
        System.out.printf("%sは。%dメートル歩きました\n", name, length);
    }

    @Override 
    public void food(String eat) {
        System.out.printf("%sは。%sを食べました\n", name, eat);
    }
}
public class M12_5 {
    public static void main(String[] args) {
        Dog3 dog = new Dog3("犬");
        Bird3 bird = new Bird3("鳥");
        Whale3 whale = new Whale3("鯨");
        Human human = new Human("人");

        dog.move(10);
        dog.food("お肉");
        bird.move(1000);
        bird.food("虫");
        whale.move(50);
        whale.food("オキアミ");
        human.move(300);
        human.food("昼ごはん");
    }
}
