package lesson7;

public class Plate {

    private int food;

    public Plate(int food) {
           if(food>0){
               this.food=food;
           }else {
               System.out.println("Ошибка, вы задали недопустимое количство еды, мы сами исправили этот недочет");
               this.food =  food*(-1)+1;
           }
    }
    public void foodAdd(int addFood){
        if(addFood>0){
        this.food += addFood;
        }else System.out.println("Ошибка, нельзя добавить еды <=0");
    }

    public void catEating(Cat cat){
        if(food>=cat.getAppetite()&&cat.isHunger()){
        food -= cat.getAppetite();
        System.out.println(cat.getName() +" поел!");
        cat.setHunger(false);
        cat.setSatiety(true);
        }else if(food< cat.getAppetite()) {
            System.out.println("В миске слишком мало еды или у " + cat.getName()+"a слишком большой аппетит!");
            cat.setHunger(true);
            cat.setSatiety(false);
        }else if(cat.isSatiety()){
            System.out.println(cat.getName()+" есть не будет, потому что есть не хочет.");
            cat.setHunger(false);
        }
    }

    public void info(){
        System.out.println("food: " + food);
    }
}
