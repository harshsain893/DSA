package Array;
import java.util.*;
public class ArrayBasic {
    public static void main(String []args){
        int marks [] = new int [50];
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the numbers");
        // Take input 
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        
        System.out.println("phy: "+marks[0]);
        System.out.println("chem: "+marks[1]);
        System.out.println("math: "+marks[2]);
        // Updated marks
        marks[2] = 100;
        System.out.println("updated marks: "+marks[2]);

        // Calculate the percetage 
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage : "+percentage);

        // How to find length of the array 
        System.out.println("Length is: "+marks.length);
    }
}
