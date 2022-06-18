//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;

public class Gter_num {
    public static int gter(int a, int b) {
        if(a>b){
            return a;
        } else {
            return b;
        }
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gterNum = gter(a, b);
        System.out.println(gterNum);
    }
}
