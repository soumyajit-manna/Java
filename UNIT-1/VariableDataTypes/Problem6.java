// Problem:6 Product of two numbers (input from user)

import java.util.*;
public class Problem6{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter the first integer values: ");
        int a = sc.nextInt();
        System.out.println("Please enter the second integer value: ");
        int b = sc.nextInt();
        int product = a*b;
        System.out.print("Product of two integer values: " + product);
        sc.close();
    }
}