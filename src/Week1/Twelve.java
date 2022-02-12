package Week1;

import java.util.Scanner;

public class Twelve {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range:");
        int n = sc.nextInt();

        char ch = 'A';
        // int c = 65;

        for(int i = 0; i < n; i++) {
            // System.out.print((char)c);

            System.out.print(ch);
            System.out.print((int)Math.pow(2,i)+",");
            // c++;
            ch++;
        }
    }
}
