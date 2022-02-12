package Week1;

import java.util.Scanner;

public class Nine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range");
        int n = sc.nextInt();

        int a = 1;
        System.out.print(a+",");
        System.out.print(a+",");
        for(int i = 3; i <= n; i++){
            if(i % 2 != 0)
                System.out.print(2 * i - 1+",");
            else
                System.out.print(2 * i - 3+",");
        }
    }
}
