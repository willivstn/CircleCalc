import java.util.Scanner;

public class Main {

    //calculate area and perimeter with radius from user input
    public static void main(String[] args) {

        final float pi = (float) Math.PI;
        System.out.println("Enter your circle radius");

        Scanner s1 = new Scanner(System.in);
        float r = s1.nextFloat();

        float area = pi * ( r * r);
        System.out.println("The area is : " + area );
        float per = 2 * pi * r;
        System.out.println("The perimeter is : " +per);


    }
}