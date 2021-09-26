package lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {

    }
    public static boolean checkSum(int a, int b){

        return (a + b)>=10&&(a + b)<=20;
    }
    public static void printPositiveOrNegativeNum(int a){
        System.out.println(a >= 0 ? "Positive number" : "Negative number");
    }
    public static boolean checkPosOrNeg(int a){
        return (a <= 0);
    }
    public static void printStrings(String s, int Num){
        for (int i = 0; i < Num; i++) {
            System.out.println(s);
        }
    }
    public static boolean leapYearCheck(int year){
        return year%400==0 || year%4==0 && year%100!=0 ;
    }
}
