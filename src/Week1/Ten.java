package Week1;

import java.util.Scanner;

public class Ten {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range");
        int n = sc.nextInt();

        int a = 21;
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0)
                System.out.print(a+",");
            else
                System.out.print(i + 7+",");
        }
    }
}
