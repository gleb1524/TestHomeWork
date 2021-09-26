package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        chekSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void chekSumSign() {
        int a = 10;
        int b = -10;
        int result = a + b;
        if(result >= 0){
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }
    public static void printColor(){
        int value = 7;
        if(value<=0){
            System.out.println("Красный");
        }else if(value<=100){
            System.out.println("Желтый");
        }else {
            System.out.println("ЗелЁный");
        }
    }
    public static void compareNumbers(){
        int a = 10;
        int b = 15;
        System.out.println(a >= b ? "a>=b" : "a<b");
    }
}
