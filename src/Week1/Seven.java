package Week1;

import java.util.Scanner;

public class Seven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(i % 2 != 0)
                System.out.print((n+1)+i/2 +",");
            else
                System.out.print((n+1)+(i/2+2)+",");
        }
    }
}
