//Write a function that calculates the Greatest Common Divisor of 2 numbers.

import java.util.Scanner;

public class Gcd {
    public static int gcdNum(int a, int b) {
        int num = 1;

        for (int i = 1; i <= a && i <= b ; i++) {
            if (a % i == 0 && b % i == 0) {
                num = i;
            }
        } return num;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcdNum(a, b)); 
    }
}
