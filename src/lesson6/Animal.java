package lesson6;

public class Animal {

    String name;
    Animal animal ;

    int catCount;
    int dogCount;
  //  int animalCount;
    public Animal(String name){
        this.name = name;
        animalCounter();
    }




    public void swim(int length){
        System.out.println(name + " проплыл " + length + "м.");
    }

    public void run(int length){
        System.out.println(name + " пробежал " + length + "м.");
    }

    public void animalCounter(){
        HomeWorkApp6.animaCount++;

    }





}
