// Problem3: Multiple Word or Sentence input in Java

import java.util.*;
public class Problem3{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter a sentence or multiple words: ");
        String input = sc.nextLine();
        System.out.print("You entered: " + input);
        sc.close();
    }
}