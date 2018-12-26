package numberseries;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int num1 = 0;// num1=0,num2=1,num3,limit=10; also we can declare like this
        int num2 = 1;
        int num3;
        int limit = 10;// setting limit untill numbers required.
        System.out.println(num1);
        //condition for limit mentioned
        for (int i = 2; i <= limit; i++) {
            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
        // we can also take user input.
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number till series needed");
        int number = scan.nextInt();

        for (int k = 2; k <= number; k++) {

            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;


        }


    }
}
