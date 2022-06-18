//Two numbers are entered by the user, x and n. Write a function to find
//the value of one number raised to the power of another i.e. 𝑥 .

import java.util.*;
public class Num_pow {
    public static int mul(int n, int p) {
        int mul = 1;

        for (int i = 1; i <= p; i++) {
            mul = mul*n;
        }
        return mul;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        
        System.out.println(mul(n, p));
    }
    
}
