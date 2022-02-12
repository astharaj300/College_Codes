package Week1;

import java.util.Scanner;

public class Six {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of range");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print((int)Math.pow(2,i)+",");
        }
    }
}
