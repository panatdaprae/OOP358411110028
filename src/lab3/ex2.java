package lab3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        String name , p ,a ,b ;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        //name
        System.out.print("ชื่อ-สกุล ?");
        name = sc.nextLine();
        System.out.println("Hello "+name);
        //age
        System.out.println("คุณอายุเท่าไร ?:");
         int age = sc2.nextInt();
        System.out.println("คุณอายุ" +age+"ปี.");
        //เพศ
        System.out.println("เพศอะไร ?:");
        p = sc.nextLine();
        System.out.println("เพศ"+p);
        //ที่อยู่
        System.out.println("ที่อยู่ ? :");
        a = sc.nextLine();
        System.out.println("ที่อยู่"+a);
        //เบอร์โทร
        System.out.println("เบอรืโทร ? :");
        b= sc.nextLine();
        System.out.println("เบอร์โทร"+b);






    }//main




}//class
