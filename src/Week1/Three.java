package Week1;

import java.util.Scanner;

public class Three {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total no. of terms");
        int n = sc.nextInt();

        double sum = 0.0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
