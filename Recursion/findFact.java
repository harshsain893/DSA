public class findFact {
    public static int Factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * Factorial(n-1);
    }
    public static void main(String[]args){
        int n = 5;
        int result = Factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
