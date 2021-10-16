package lesson6;

abstract class Animal {

  protected String name;
    
    public Animal(String name){
        this.name = name;
        animalCounter();
    }

    abstract void swim(int length);

    abstract void run(int length);

    protected void animalCounter(){
        HomeWorkApp6.animaCount++;

    }

}
