public class lastOccurence {
    public static int lastOccurence(int arr[], int key, int i){
        if (i < 0){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return lastOccurence(arr, key, i-1);
    }

    public static void main(String[]args){
        int arr[] = {0, 5, 4, 8, 7, 6, 3, 5};
        System.out.println(lastOccurence(arr, 5, arr.length-1));
    }
}
