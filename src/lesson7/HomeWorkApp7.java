package lesson7;

public class HomeWorkApp7 {
    public static void main(String[] args) {

        Plate plate = new Plate(-100);
        plate.info();

        Cat cat = new Cat("Barsik",55);
        cat.info();

        Cat[] cats = new Cat[5];
        cats[0] = cat;
        cats[1] = new Cat("Murzik", 15);
        cats[2] = new Cat("Murka", 10);
        cats[3] = new Cat("Vaska",25);
        cats[4] = new Cat("Volter", 10);

        for (int i = 0; i < cats.length; i++) {
            plate.catEating(cats[i]);
            cats[i].isHungerInfo();
        }
        plate.info();
        plate.foodAdd(-100);
        plate.info();

    }
}
