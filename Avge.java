//Enter 3 numbers from the user & make a function to print their average
import java.util.*;

public class Avge {
    public static int avg(int a, int b, int c) {
        int avrg = (a+b+c)/3;
        return avrg;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avarege = avg(a, b, c);
        System.out.println(avarege);
    }
}