package Array;
public class BinarySearch {
    public static int BinarySearch(int number[],int key){
        int start = 0, end = number.length-1;
        while(start <= end){
            int mid = (start + end)/2;

            // Comparisons
            if (number[mid] == key){ //found
                return mid;
            }
            if(number[mid] < key){ //right
                start = mid + 1;
            }
            else{
                end = mid - 1; //left
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int number[] = {2, 4, 6, 8, 10};
        int key = 10;
        System.out.println("Key is at Index : "+BinarySearch(number,key));
    }
}
