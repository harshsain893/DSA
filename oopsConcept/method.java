package oopsConcept;
import java.util.*;

public class method {
    // Overloaded methods
    double area(double radius) {
        return Math.PI * radius * radius; // Circle
    }

    double area(double length, double breadth) {
        return length * breadth; // Rectangle
    }

    int area(int side) {
        return side * side; // Square
    }

    public static void main(String[] args) {
        method m1 = new method();
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the Radius: ");
                double radius = sc.nextDouble();
                System.out.println("Area of Circle = " + m1.area(radius));
                break;

            case 2:
                System.out.print("Enter the Length and Breadth: ");
                double length = sc.nextDouble();
                double breadth = sc.nextDouble();
                System.out.println("Area of Rectangle = " + m1.area(length, breadth));
                break;

            case 3:
                System.out.print("Enter the Side: ");
                int side = sc.nextInt();
                System.out.println("Area of Square = " + m1.area(side));
                break;

            default:
                System.out.println("Invalid Choice!");
        }
    }
}
