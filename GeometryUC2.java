//check equality of two lines based on the end points, So that two lines are the equal.

import java.util.Scanner;

public class GeometryUC2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the values of x1,y1,x2,y2");
        Integer x1 = obj.nextInt();
        Integer y1 = obj.nextInt();
        Integer x2 = obj.nextInt();
        Integer y2 = obj.nextInt();
        //If result is true then two lines are equal.
        //If result is false then two lines are not equal.
        boolean result1 = x1.equals(y1);
        System.out.println("Result is " + result1);
        boolean result2 = x2.equals(y2);
        System.out.println("Result is " + result2);
    }
}
