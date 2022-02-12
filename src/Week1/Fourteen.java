package Week1;

import java.util.Scanner;

public class Fourteen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range:");
        int n = sc.nextInt();

        char ch1 = 'A';
        char ch2 = 'Z';
        System.out.print(ch1+",");
        System.out.print(ch2+",");
        for(int i = 3; i <= n; i++){
            if(i % 2 != 0)
                System.out.print((char)(('Z' - i)+1) + ",");
            else
                System.out.print(++ch1+",");
        }
    }
}
