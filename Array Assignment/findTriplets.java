public class findTriplets {
    public static void findTriplets(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                for (int k = j+1; k < arr.length; k++){
                    if(i !=  j && i != k && j != k){
                        // int add = arr[i] + arr[j] + arr[k];
                        if(arr[i] + arr[j] + arr[k] == 0){
                            System.out.println(arr[i]+" "+ arr[j] +" " + arr[k]);
                        }
                    } 
                }
            }
        }
    }
    public static void main(String[]args){
        int arr[] = {-1, 0, 1, 2, -1, -4};
        findTriplets(arr);
    }
}
