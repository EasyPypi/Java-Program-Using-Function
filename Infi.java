//Write an infinite loop using do while condition.

import java.util.*;

public class Infi {
    public static void infinNo(String name) {
        do {
            System.out.println(name);
        } while (1 == 1);
        
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();
        infinNo(name);
        
    }
}
