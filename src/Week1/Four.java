package Week1;

import java.util.Scanner;

public class Four {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range/no. of terms");
        int n = sc.nextInt();
        int a = 1, b = 2;
        System.out.print(a +",");
        System.out.print(b +",");

        for(int i = 3; i <= n; i++){
            int c = a * b;
            System.out.print(c+",");
            a = b;
            b = c;
        }
    }
}
