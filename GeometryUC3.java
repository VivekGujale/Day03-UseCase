//compare two lines based on the end points, So that one line is equal, greater or less than the other line.
//Using Java compareTo method to compare 2 Lengths

import java.util.Scanner;

public class GeometryUC3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the values of x1,y1,x2,y2");
        Integer x1 = obj.nextInt();
        Integer y1 = obj.nextInt();
        Integer x2 = obj.nextInt();
        Integer y2 = obj.nextInt();
        //If value is greater than the 0 then result will be 1.
        //If value is less than the 0 then result will be -1.
        //If both values are same then result will be 0.
        int result1 = x1.compareTo(y1);
        System.out.println("Result is " + result1);
        int result2 = x2.compareTo(y2);
        System.out.println("Result is " + result2);
    }
}

