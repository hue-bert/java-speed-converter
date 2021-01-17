import java.util.Scanner;

public class SpeedConverter {

    /*public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a result to convert:");
        double numberConvert = reader.nextDouble();
        double result = toMilesPerHour(numberConvert);

        //System.out.println(result);
        printConversion(numberConvert);
    }*/

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {

            return -1;

        } else

            return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {

            double milePerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milePerHour + " mi/h");

        }

    }

}
