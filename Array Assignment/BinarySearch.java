public class BinarySearch{
    public static int binarySearch(int number[], int target){
        int start = 0, end = number.length - 1;
        while (start <= end){
            int mid = (start + end) / 2;

            if (number[mid] == target){
                return mid;
              }          
             // Left half is sorted 
             if(number[start] <= number[mid]){
                 if(target >= number[start] && target <= number[mid]){
                    end = mid - 1; // Search left half
                 }
                  // Right half is sorted 
                 else{
                    start = mid + 1; // Search right half
                 }
             }  
             // Right half is sorted 
             else {
                if (target > number[mid] && target <= number[end]) {
                    start = mid + 1;
                 } else {
                    end = mid - 1;
                }
            }
        }
        return -1; 
    }
    public static void main(String []args){
        int number[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 1;
        System.out.println(binarySearch(number, target));
    }    
}
