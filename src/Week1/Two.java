package Week1;

import java.util.Scanner;

public class Two {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base");
        int b = sc.nextInt();
        System.out.println("Enter the exponent");
        int e = sc.nextInt();

        int exp = e;
        int result = 1;
        while(e!=0){
            result *= b;
            e--;
        }

        System.out.println("power of "+ b +" raised to "+ exp + " is : "+ result);

    }
}
