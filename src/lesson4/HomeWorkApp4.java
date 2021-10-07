package lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {

    public static Scanner scanner = new Scanner(System.in);
    private static char[][] map;
    private static final int SIZE = 5;
    private static final int DOTS_TO_WIN = 3;
    private static char MAP_ELEMENT_EMPTY = '_';
    private static char MAP_ELEMENT_X = 'X';
    private static char MAP_ELEMENT_o = 'o';

    public static void main(String[] args) {
        initMap();
        printMap();
        while(true) {
            humanTurn();
            printMap();
            if(checkWin(MAP_ELEMENT_X)){
                System.out.println("Победил человек!");
                break;
            }
            if(isMapFool()){
                System.out.println("Ничья!");
                break;
            }
            iaTurn();
            printMap();
            if (checkWin(MAP_ELEMENT_o)){
                System.out.println("Победил искуственный интилект!");
                break;
            }
            if(isMapFool()){
                System.out.println("Ничья!");
                break;
            }
        }
    }

    public static boolean isMapFool(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(map[i][j]==MAP_ELEMENT_EMPTY) return false;
            }
        }
        return true;
    }

    public static boolean checkWin(char symb){
        if(SIZE>=5) {
            int l = 1;
            int l1 = 1;
            int l2 = 1;
            for (int i = 0; i < SIZE-1; i++) {
                if(map[i][i]==map[i+1][i+1]&&map[i][i]==symb){
                    l++;
                    if(l==SIZE-1) return true;
                }
            }
            for (int i = 0; i <SIZE-2 ; i++) {
                if(map[i+1][i]==map[i+2][i+1]&&map[1][0]==symb){
                    l1++;
                    if(l1==SIZE-1) return true;
                }
                if(map[i][i+1]==map[i+1][i+2]&&map[0][1]==symb){
                    l2++;
                    if(l2==SIZE-1) return true;
                }
            }
            int c = 1;
            int c1 = 1;
            int c2 = 1;
            int len1 = SIZE-2;
            int len2 = SIZE-1;
            for (int i = 0; i < SIZE-2; i++) {
                if(map[i][len1]==map[i+1][len1-1]&&map[i][len1]==symb){
                    c++;
                    if(c==SIZE-1) return true;
                }
                if(map[len2][i]==map[len2-1][i+1]&&map[len2][i]==symb){
                    c1++;
                    if(c1==SIZE-1) return true;
                }

                len1--;
            }
            for (int i = 1; i < SIZE-1; i++) {
                if(map[len2][i]==map[len2-1][i+1]&&map[i][len2]==symb){
                    c1++;
                    if(c1==SIZE-1) return true;
                }
                 len2--;
            }

            for (int i = 0; i < SIZE; i++) {
                int j = 0;
                int k = 0;
                if (map[i][0] == symb) {
                    while ((map[i][j] == map[i][j + 1]) && j < (SIZE - 1) && map[i][SIZE / 2] == symb) {
                        if (j + 1 == SIZE - 2) {
                            return true;
                        }
                        j++;
                    }
                } else {
                    while ((map[i][j + 1] == map[i][j + 2]) && j < (SIZE - 1) && map[i][SIZE / 2] == symb) {
                        if (j + 1 == SIZE - 2) {
                            return true;
                        }
                        j++;
                    }
                }
                if(map[0][i]==symb){
                    while((map[k][i] == map[k+1][i]) && k < (SIZE - 1) && map[SIZE/2][i]==symb){
                        if (k + 1 == SIZE - 2){
                            return true;
                        }
                        k++;
                    }
                }else {
                    while ((map[k+1][i] == map[k+2][i]) && k < (SIZE - 1) && map[SIZE/2][i] == symb) {
                        if (k + 1 == SIZE - 2) {
                            return true;
                        }
                        k++;
                    }
                }
            }

        }
        for (int i = 0; i < SIZE; i++) {
            int j = 0;
            int k = 0;
             while (map[i][j] == map[i][j + 1] && j < (SIZE - 1) && map[i][j] == symb) {
                if (j + 1 == SIZE - 1) {
                    return true;
                }
                j++;

            }
            while (map[k][i] == map[k+1][i] && k < (SIZE - 1) && map[k][i] == symb){
                if (k + 1 == SIZE - 1){
                    return true;
                }
                k++;
            }
        }
        int count1=1;
        int count2=1;
        int l = SIZE-1;
        for (int i = 0; i < SIZE-1; i++) {
            if(map[i][i]==map[i+1][i+1]&&map[i][i] == symb){
                count1++;
                if(count1==SIZE) return true;
            }
            if(map[i][l]==map[i+1][l-1]&&map[i][l]==symb){
                count2++;
                l--;
                if(count2==SIZE) return true;
            }
        }
        return false;
    }

    public static void iaTurn(){

        int x, y;
        Random random = new Random();
        do{
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
            int line = 0;
            int column = 0;
            int diagonal1 = 0;
            int diagonal2 = 0;
            int max = 1;
            for (int i = 0; i < SIZE; i++) {
                int countLine = 0;
                int countColumn = 0;
                int countDiagonal1 = 0;
                int countDiagonal2 = 0;
                for (int j = 0; j < SIZE; j++) {

                    max = line > column ? line :
                            max > line ? max : line;

                    if(map[i][j]==MAP_ELEMENT_X){
                        y = random.nextInt(SIZE);
                        countLine++;
                        line = countLine > line ? countLine : line;
                        if(line>max) {
                            y =i;
                            x = random.nextInt(SIZE);
                        }
                        if(line>SIZE/2) {
                            max = 1;
                            line = 0;
                        }
                    }

                    if(map[j][i]==MAP_ELEMENT_X){
                        countColumn++;
                        x = random.nextInt(5);
                        column = countColumn > column ? countColumn : column;
                        if(column>max) {
                            x=i;
                            y = random.nextInt(SIZE);
                        }
                        if(column>SIZE/2) {
                            max = 1;
                            column = 0;
                        }

                    }

//                    if(map[j][j]==MAP_ELEMENT_X){
//                        countDiagonal1++;
//                        diagonal1 = countDiagonal1 > diagonal1 ? countDiagonal1 : diagonal1;
//                        if(diagonal1>max&&countDiagonal1<SIZE/2+1){
//                            y=x;
//                        }else if(diagonal1>max&&countDiagonal1>SIZE/2+1)y = random.nextInt(SIZE);
//                        max = diagonal1 > max ? diagonal1 : max;
//                        if(diagonal1>SIZE/2+1) max = 1;
//
//                    }
//
//                    if(map[SIZE-1-j][j]==MAP_ELEMENT_X){
//                        countDiagonal2++;
//                        diagonal2 = countDiagonal2 > diagonal2 ? countDiagonal2 : diagonal2;
//                        max = diagonal2 > max ? diagonal2 : max;
//                    }
                }
            }
            System.out.println(line+" "+column+" "+diagonal1+" "+diagonal2+" "+max);
        }while(!isCellValid(x, y));

                map[y][x] = MAP_ELEMENT_o;
                System.out.println("Искуственный интелект походил в поле с координатоми " + (x + 1) + " " + (y + 1));

    }

    public static boolean isCellValidLine(int x, int y){
        if(x<0||x>=SIZE)return false;
        for (int i = 0; i < SIZE; i++) {
            if(map[y][i]!=MAP_ELEMENT_EMPTY) return true;
            if(map[i][x]!=MAP_ELEMENT_EMPTY) return true;
        }

        return false;
    }

    public static boolean isCellValid(int x, int y){
        if(x < 0 || y < 0 || x >= SIZE || y >= SIZE ) return false;
        if(map[y][x] == MAP_ELEMENT_EMPTY) return true;
        return false;
    }

    public static void humanTurn(){
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
             x = scanner.nextInt() -1;
             y = scanner.nextInt() -1;
        }while (!isCellValid(x, y));
        map[y][x] = MAP_ELEMENT_X;
    }

    public static void printMap(){
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (int i = 0; i <SIZE ; i++) {
            System.out.print(i+1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print( map[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public static void initMap(){
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = MAP_ELEMENT_EMPTY;
            }
        }
    }

}
