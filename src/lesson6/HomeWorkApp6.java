package lesson6;

public class HomeWorkApp6 {

    public static void main(String[] args) {

        Dog dog = new Dog("Bobok");
        dog.swim(100);

        Cat cat = new Cat("Murzik");
        Cat cat1 = new Cat("Murzik1");
        Cat cat2 = new Cat("Murzik2");
        Cat cat3 = new Cat("Murzik3");
        Cat cat4 = new Cat("Murzik4");
        cat.swim(500);
        cat.run(300);
        dog.run(600);

        System.out.println(animaCount+" "+dogCount+" "+catCount);


    }

    static int animaCount;
    static int catCount;
    static int dogCount;

}
