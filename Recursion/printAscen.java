public class printAscen {
    public static void printAscen(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printAscen(n-1);
        System.out.print(n+" ");

    }
    public static void main(String args[]){
        int n = 10;
        printAscen(n);
    }
}
