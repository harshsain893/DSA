package Strings; // Package declaration (the class belongs to the 'Strings' package)

public class concatenation { // Class definition

    // Method to print each character of a string separated by space
    public static void print(String str){
        // Loop through each character in the string
        for(int i = 0; i < str.length(); i++){
            // Print each character followed by a space
            System.out.print(str.charAt(i) + " ");
        }
        // Print a new line after the loop ends
        System.out.println();
    }

    public static void main(String args[]){
        // Declare and initialize first name
        String firstname = "Harsh";        
        
        // Declare and initialize last name
        String lastname = "Sain";
        
        // Concatenate first name and last name with a space in between
        String fullname = firstname + " " + lastname;
        
        // Example of accessing a specific character in the string
        // System.out.println(fullname.charAt(3)); // Uncomment to print character at index 3
        
        // Call the print method to display each character of fullname
        print(fullname);
    }
}

