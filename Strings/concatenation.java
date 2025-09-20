package Strings;
public class concatenation {
    public static void print(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        String firstname = "Harsh";        
        String lastname = "Sain";
        // Concatenation
        String fullname = firstname + " " + lastname;
        // System.out.println(fullname.charAt(3)); 
        
        print(fullname);
    }
}
