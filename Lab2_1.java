import java.util.Scanner;
public class Lab2_1
{
    public static void main(String[] args)
    {
        //Initialize Scanner Input
        Scanner input = new Scanner(System.in);

        //Prompt user for 6 numbers and accept input
        System.out.println("Enter 6 coordinate values for 2 different points");
        System.out.print("Enter the X-coordinate of point 1: ");
        double point1x = input.nextDouble();
        System.out.print("Enter the Y-coordinate of point 1: ");
        double point1y = input.nextDouble();
        System.out.print("Enter the Z-coordinate of point 1: ");
        double point1z = input.nextDouble();
        System.out.print("Enter the X-coordinate of point 2: ");
        double point2x = input.nextDouble();
        System.out.print("Enter the Y-coordinate of point 2: ");
        double point2y = input.nextDouble();
        System.out.print("Enter the Z-coordinate of point 2: ");
        double point2z = input.nextDouble();

        //Compute the distance between the 2 points
        double distance = Math.sqrt((Math.pow(point1x-point2x,2))+(Math.pow(point1y-point2y,2))+(Math.pow(point1z-point2z,2)));
        int distance0 = (int)Math.sqrt((Math.pow(point1x-point2x,2))+(Math.pow(point1y-point2y,2))+(Math.pow(point1z-point2z,2)));

        //Print Outcome
        System.out.println("The distance between point 1 and point 2 is: " + distance);
        System.out.println("The integer part of the distance between point 1 and 2 is: "+ distance0);
        System.out.println("The fractional part of the distance between point 1 and 2 is: "+ (distance - distance0));

    }
}
