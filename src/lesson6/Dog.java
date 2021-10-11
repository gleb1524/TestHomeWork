package lesson6;

public class Dog extends Animal{
    int age =5;
    int dogCount;
    public Dog(String name){

     super(name);


    }

    @Override
    public void run(int length){
        if(length>500) System.out.println("Собака не бежит более 500 метров.");
    }

    @Override
    public void swim(int length){
        if(length>10) System.out.println("Собака не плывёт более 10 метров.");
    }

    @Override
    public void animalCounter(){
        super.animalCounter();
        HomeWorkApp6.dogCount++;
    }


}
