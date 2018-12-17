package lab4;

import java.util.Scanner;

public class Quizi2_Operators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("จำนวนที่1 :");
        x = sc.nextInt();
        System.out.println("จำนวนที่2 :");
        y = sc.nextInt();
        //call methods
        System.out.println("Sum = "+sumt(x,y));
        System.out.println("Sud = "+subt(x,y));
        System.out.println("Mul = "+mult(x,y));
        System.out.println("Div = "+divt(x,y));




    }//main

    private static int divt(int x, int y) {
        return x / y;
    }

    private static int mult(int x, int y) {
        return x * y;
    }

    private static int subt(int x, int y) {
        return x - y;
    }

    private static int sumt(int x, int y) {
        return x + y;
    }





}//class
