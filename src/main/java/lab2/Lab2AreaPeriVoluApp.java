package lab2;

import org.junit.runner.Runner;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Lab2AreaPeriVoluApp {

    static String answer;
    static double length;
    static double width;
    static double height;
    static double peri;
    static double area;
    static double volume;

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println(
                "Hi! we're going to calculate the perimeter, floor area, & volume of a room, given the length, width, & height of the room. Enter anything to continue.");

        do {
            read.nextLine();
            try {


                System.out.println(
                        "How about you enter that room's length. This is going to be the longest measurement across the floor. In inches.");

                length = read.nextDouble();
                System.out.println(
                        "Now, let's get that width. This will be the other mesaurement along the floor. In inches.");
                width = read.nextDouble();
                System.out.println("Perfect. Now, the ultimate dimension: Height. Still in inches.");
                height = read.nextDouble();
                System.out.println("Cool. Now, we're gonna do some math stuff. \n \n \n");

                peri = (2 * length) + (2 * width);
                area = length * width;
                volume = length * width * height;

                System.out.println("Okay. So, your perimeter is " + peri + " inches.");
                System.out.println("And your floor area is " + area + " square inches.");
                System.out.println("Finally, your room's volume is " + volume + " cubic inches.");
                System.out.println("\n \n Wanna do it again? (y/n)");
                read.nextLine();
                answer = read.nextLine();

                switch (answer) {
                    case "n":
                        break;
                    default:
                        System.out.println(
                                "Either you wanted to do this again, or you tried to be cheeky. In either case, we're doing it again.");
                        System.out.println(
                                "Hi! we're going to calculate the perimeter, floor area, & volume of a room, given the length, width, & height of the room.");
                        break;
                }
            } catch (NoSuchElementException num) {
                System.out.println(
                        "Either you wanted to do this again, or you tried to be cheeky. In either case, we're doing it again.");
                answer = "y";
                System.out.println(
                        "Hi! we're going to calculate the perimeter, floor area, & volume of a room, given the length, width, & height of the room.");

            }

        } while (!answer.equals("n"));
        read.close();
        System.out.println("\n \nKTHKSBYE");

    }

    //here's a change for git practice.
    //here's another change for git practice.
}
