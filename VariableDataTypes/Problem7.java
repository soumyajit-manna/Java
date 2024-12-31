// Problem7: Find Area of a Circle

import java.util.*;
public class Problem7{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter the radius of the circle: ");
        float radius = sc.nextFloat();
        float area = 3.14f * radius *radius;
        System.out.print("Area of the circle: " + area);
    }
}