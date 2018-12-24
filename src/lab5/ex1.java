package lab5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        int numb[]= new int[5];
      // showData (numb);
      //   numb[3]= 5;
      //  showData(numb);
      //  numb[0] = numb[3] * 5;

        int myNum[] = inputData(numb);
        showData(myNum); //showData (inputData(numb));
        showDataEnchange(myNum);
        //finding minimum integer in array
        findMin(myNum);
        //finding maximum integer in array
        findMax (myNum);
        //finding average value in array
        findAverage(myNum);
        //sorting array low -> high
        sortArray(myNum);



    }//main

    private static void sortArray(int[] myNum) {
        Arrays.sort(myNum);
        System.out.print("Sorting Data in array: ");
        showData(myNum);

    }

    private static void findAverage(int[] myNum) {
        int total = 0;
        for (int val : myNum){
            total += val;
        }
        System.out.print("The average value is : "+(total/myNum.length));
    }

    private static void findMax(int[] myNum) {
        int max = myNum[0];
        for (int i = 0; i < myNum.length ; i++) {
            if (max < myNum[i])
                max = myNum[i];
        }
        System.out.print("The average value is :"+max);

        }

    private static void findMin(int[] myNum) {
        int min = myNum[0];
        for (int i = 0; i < myNum.length ; i++) {
            if (min>myNum[i])
                min = myNum[i];

        }
        System.out.print("The average value is :"+min);
    }

    private static void showDataEnchange(int[] myNum){
        System.out.print("Data in array(enchange):");
        for (int val :myNum
                ) {
            System.out.print(val+"\t");
        }
        System.out.print("\n");
    }

    private static int[] inputData(int[] numb) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleass, enter integers: ");
        for (int i = 0; i < numb.length; i++) {
            System.out.print("numb[" + i + "]:");
            numb[i] = scanner.nextInt();
        }
        return numb;

    }//inputData


    private static void showData(int[] numb) {
        System.out.println("Data in Array: ");
        for (int i = 0; i < numb.length; i++){
            System.out.println(numb[i]+"\t");
        }
        System.out.println("\n");



    }//showData




}//Class
