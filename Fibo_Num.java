//Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 21 ..


import java.util.Scanner;

public class Fibo_Num {
    public static void fiboNum(int n) {
        int a = 0, b = 0, fibo = 1;
        for (int i = 1; i <= n; i++) {
            a = b;
            b = fibo;
            fibo = a + b;
            System.out.println(a + " ");
        }
        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fiboNum(n);
    }
}
