package Week1;

import java.util.Scanner;

public class Eleven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range:");
        int n = sc.nextInt();

        int a = 14, b = 28;
        System.out.print(a+",");
        System.out.print(b+",");

        for(int i = 3; i <= n; i++){
            if(i % 2 != 0)
                System.out.print(n * i + 2 +",");
            else
                System.out.print(2 * n * i - 8+",");
        }
    }
}
