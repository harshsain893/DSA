public class printNatural {
    public static int Sum(int n){

    if(n == 0){
        return 0;
    }

        return n + Sum(n-1);
    }
    public static void main(String[]args){
        int n = 5;
        System.out.println("sum = "+Sum(n));
        
    }
}
