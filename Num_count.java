//Write a program to enter the numbers till the user wants and at the end it should display the count of 
//positive, negative and zeros entered.

import java.util.Scanner; 
public class Num_count { 
    public static void main(String[] args) { 
        Scanner sc =new Scanner(System.in);
        int counter=0,nve=0,pve=0,zero=0,num;
        System.out.println("Type 1 to continue & 0 for Stop");
        int input = sc.nextInt();
        while(input == 1) {
            counter++; 
            System.out.println("Enter the number: "); 
            num=sc.nextInt(); 
            if(num == 0) 
                zero++; 
            else if(num > 0) 
                pve++; 
            else if(num < 0) 
                nve++; 
            System.out.println("Type 1 to continue & 0 for Stop");
            input = sc.nextInt();
        } 
        System.out.println("Total Number Of Entries: "+counter); 
        System.out.println("Negative Entries: "+nve); 
        System.out.println("Positive Entries: "+pve); 
        System.out.println("Zero Entries: "+zero);
    } 
}