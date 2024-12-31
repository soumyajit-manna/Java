// Problem5: Sum of a and b (input from user)

import java.util.*;
public class Problem5{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter the first integer values: ");
        int a = sc.nextInt();
        System.out.println("Please enter the second integer value: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.print("Sum of two integer values: " + sum);
    }
}