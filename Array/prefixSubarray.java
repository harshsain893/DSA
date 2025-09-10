public class prefixSubarray {
    public static void prefixSubarray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length; j++){  
                sum = sum + arr[j];
                System.out.println("Subarray (" + i + "," + j + ") sum = " + sum);
            }       
        }
    }
    // In this code the time complexity if the code is = O(n*n)
    public static void main(String []args){
        int arr[] = {2,4,6,8,10};
        prefixSubarray(arr);
        
    }
}
