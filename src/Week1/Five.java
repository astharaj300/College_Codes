package Week1;

import java.util.Scanner;

public class Five {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of terms");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print(i * i+",");
        }
    }
}
