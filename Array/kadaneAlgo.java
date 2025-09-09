public class kadaneAlgo {
    public static void kadaneAlgo(int number[]){
        int sum = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++){
            sum += number[i];
            if (sum > max){
                max = sum;
            }
            if (sum < 0){
                sum = 0;
            }
            
        }
        System.out.println(max);
    } 
     public static void main (String []args){
        int number[] = {-2,-3,-4,-5, -4};
        kadaneAlgo(number);
    }   
}
