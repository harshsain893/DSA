
public class Findtwice {
    public class ArrayAssignment {
    public static boolean duplicateArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String [] args){
        int arr[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(duplicateArray(arr));
    }
}

    
}
