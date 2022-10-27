

import java.util.Scanner;


public class Temperature {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println();
        System.out.print("Please enter your temperature in Degree Celsius");
        Double C = sc.nextDouble();

        System.out.println();

        Double F = (1.8 * C) + 32;

        System.out.println("Your temperature in Fahrenheit is  "  +   F);


    }
}