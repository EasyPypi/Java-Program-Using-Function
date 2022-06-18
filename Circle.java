// Write a function that takes in the radius as input and returns thecircumference of a circle.

import java.util.*;

public class Circle {

    public static double ariaOfACircle(double a) {
        double pi = 3.14;
        double aria = 2*pi*a;
        return aria;
        
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double rad = sc.nextDouble();

        double aria = ariaOfACircle(rad);
        System.out.println(aria); 
    }
}
