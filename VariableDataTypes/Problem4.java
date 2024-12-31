// Problem4: Integer Value input in Java

import java.util.*;
public class Problem4{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter an integer value: ");
        int input = sc.nextInt();
        System.out.print("You entered:" + input);
        sc.close();
    }
}