package Week1;

import java.util.Scanner;

public class One {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms");
        int n = sc.nextInt();

        for(int i = 1; i <=  n; i++){
            if(i == 1 || i == 2)
                System.out.print("0"+",");
            else if(i % 2 != 0)
                System.out.print(i - 1 + ",");
            else
                System.out.print(i - (i / 2 + 1) + ",");
        }
    }
}
