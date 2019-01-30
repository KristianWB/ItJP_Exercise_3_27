import java.util.Scanner;

public class PointsInATriangle {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        System.out.print(
                "Enter the x coordinate: "
        );
        double x = input.nextDouble();

        System.out.print(
                "Enter y coordinate: "
        );
        double y = input.nextDouble();

        String s = " ";

        if ((y  > 0 && x > 0) && (x + 2 * y < 200))
            s = " ";
        else
            s = " not ";

        System.out.print(
                "The point is" + s + "within the limits"
        );
    }
}
