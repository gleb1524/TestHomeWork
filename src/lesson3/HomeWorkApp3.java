package lesson3;
import java.lang.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkApp3 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 1, 0, 0, 1, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                arr[i]=1;
            }else{
                arr[i]=0;
            }
        }

        int[] arr100length = new int[100];
        for (int i = 0; i < arr100length.length; i++) {
            arr100length[i]=i+1;
        }

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if(arr3[i]<6){
                arr3[i]*=2;
            }
        }

        int[][] arr4 = new int[5][5];
        int l = arr4.length;
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if(arr4[i]==arr4[j]||j==l-1){
                    arr4[i][j]=1;
                }
            }
            l--;
        }

        lenInitialValue(scanner.nextInt(), scanner.nextInt());


        int[]arrMaxMin = {-2,-7,-7,0,-6,-10,1};
        int max = arrMaxMin[0];
        int min = arrMaxMin[0];
        for (int i = 0; i < arrMaxMin.length; i++) {
            if (arrMaxMin[i] > max) {
                max = arrMaxMin[i];
            }else if(arrMaxMin[i]<min){
                min = arrMaxMin[i];
            }
        }
        System.out.println("Максимальный элемент массива = " + max);
        System.out.println("Минимальный элемент массива = " + min);

        int[]arrCheck = {1,0,1,9,3,1,3,4};
        System.out.println(checkBalance(arrCheck));

        int[]arrShi = {0, 2, 4, 6, 8, 10, 25};
        System.out.println(Arrays.toString(arrShi));
        arrShift(arrShi, -5);
        System.out.println(Arrays.toString(arrShi));
    }

    public static int[] lenInitialValue(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i]=initialValue;
        }
        return arr;
    }

    public static boolean checkBalance(int[]check){
        int sum1 = check[0];
        int sum2 = 0;
        int l = check.length - 1;
        int count = 0;
        for (int y = 1; y < check.length; y++) {
            sum2 = sum2 + check[y];
        }

            while (sum1 != sum2) {
                sum1 += check[check.length - l];
                sum2 -= check[check.length - l];
                l--;
                count++;
                if (count == check.length - 1) break;

            }
    return sum1==sum2;
    }
     public static void arrShift(int[] arr, int number){
        int a = arr[0];
        int b ;
        int count = 0;
        if(number>=0){
            if(number>arr.length){
                number=number%arr.length;
            }
            for (int i = 0; count < arr.length; i+=number) {
                if(i>arr.length){
                    i=i% arr.length;
                }
                if(number+i<arr.length){
                  b = arr[i + number];
                  arr[i + number] = a;
                  a = b;
                }else{
                    b = arr[(i + number)%arr.length];
                    arr[(i + number)% arr.length] = a;
                    a = b;
                }
                count++;
            }
        }else{
            number*=-1;
            if(number>arr.length){
                number = number% arr.length;
            }
            for (int i = 0; count < arr.length; i=(arr.length+(i-number))) {
                if(i> arr.length){
                    i=i% arr.length;
                }
                if(i-number>=0){
                b = arr[i-number];
                arr[i-number] = a;
                a = b;
                }else{
                    b = arr[arr.length+(i-number)];
                    arr[arr.length+(i-number)] = a;
                    a = b;
                }
                count++;
            }
        }
     }
}