package lesson6;

public class Cat extends Animal {

    public Cat(String name){
        super(name);
    }

    @Override
    public void swim(int length){
        System.out.println("Кот не поплывёт и "+ length/2 + "м, тем более не поплывёт "+ length+"м. \nДа и вообще не поплывёт.\nОсобенно наш "+ name);
    }

    @Override
    public void run(int length){
        if(length>200){
            System.out.println("Кот не бежит более 200 метров.");
        }

    }

    @Override
    public void animalCounter(){
        super.animalCounter();
        HomeWorkApp6.catCount++;
    }

}
