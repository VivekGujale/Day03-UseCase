//using the Cartesian system, So that I can calculate its length
//A Length as 2 Points (x1, y1) and (x2, y2) - Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2 - y1) ^ 2)

public class GeometryUC1 {
    public static void main(String[] args) {
        int x1=5;
        int x2=10;
        int y1=6;
        int y2=15;
        double LengthOfLine = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("Length of 2 points ("+x1+","+y1+") and ("+x2+","+y2+") =" + LengthOfLine);
    }
}
