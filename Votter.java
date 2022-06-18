//Write a function that takes in age as input and returns if that person is eligible to vote or not. 
//A person of age > 18 is eligible to vote.


import java.util.*;

public class Votter {
    public static void vot(int age) {
        if (age > 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        vot(age); 
        
    }
}
