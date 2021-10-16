package lesson7;

public class Cat {

   private String name;
   private int appetite;

    public boolean isHunger() {
        return hunger;
    }

    public void setHunger(boolean hunger) {
        this.hunger = hunger;
    }

    private boolean hunger ;
    private boolean satiety;

    public int getAppetite() {
        return appetite;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        hunger = true;
        satiety = false;
    }

    public String getName() {
        return name;
    }

    public void info(){
        System.out.printf("[Cat name: " + name+" ] \n[appetite: " + appetite +"]\n"+hunger+'\n');
    }

    public void isHungerInfo(){
        if(!satiety){
            System.out.println(name + " хочет есть!");
        }else System.out.println(name + " пока что сыт :)");
    }
}
