import java.util.Scanner;

public class LineComparison {
    static Scanner sc = new Scanner(System.in);
    static float lengthLine_X = 0;
    static float lengthLine_Y = 0;

    void compareTo() {

        if (lengthLine_Y > lengthLine_X) {
            System.out.println("Line 2 is greater than Line 1");
        } else {
            System.out.println("Line 2 is smaller than Line 1");
        }
    }

    void equalsTo() {
        System.out.println("Enter the value of x4: ");
        float x4 = sc.nextFloat();
        System.out.println("Enter the value of x3: ");
        float x3 = sc.nextFloat();
        System.out.println("Enter the value of y4: ");
        float y4 = sc.nextFloat();
        System.out.println("Enter the value of y3: ");
        float y3 = sc.nextFloat();
        lengthLine_Y = (float) Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        System.out.println("Length of line 2 is: " + lengthLine_Y);

        if (lengthLine_Y == lengthLine_X) {
            System.out.println("Two lines are equal");
        } else {
            System.out.println("Two lines are not equal");
        }
    }

    public static void main(String[] args) {

        LineComparison lc = new LineComparison();

        System.out.println("Enter the value of x1: ");
        double x1 = sc.nextDouble();
        System.out.println("Enter the value of x2: ");
        double x2 = sc.nextDouble();

        System.out.println("Enter the value of y1: ");
        double y1 = sc.nextDouble();
        System.out.println("Enter the value of y2: ");
        double y2 = sc.nextDouble();

        lengthLine_X = (float) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of line 1 is: " + lengthLine_X);

        lc.equalsTo();
        lc.compareTo();

    }}