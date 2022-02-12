package Week1;

import java.util.Scanner;

public class Fifteen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range:");
        int n = sc.nextInt();

        String str = "BC";
        char ch = 'A';

        for(int i = 1; i <= n; i++){
            System.out.print(str);
            System.out.print(ch++);
            System.out.print(i+",");

        }
    }
}
