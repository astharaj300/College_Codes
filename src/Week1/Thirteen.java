package Week1;

import java.util.Scanner;

public class Thirteen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range:");
        int n = sc.nextInt();
        System.out.println("Enter the no. of loop");
        int r = sc.nextInt();

        char ch = 'A';
        for (int j = 1; j <= r; j++) {
            ch='A';
            for (int i = 1; i <= n; i++) {
                System.out.print(ch++);
                System.out.print(i + ",");

            }
        }
    }
}
