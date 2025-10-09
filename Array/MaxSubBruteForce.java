public class MaxSubBruteForce {

    // Prints all subarrays of the given array and their sums (brute-force approach)
    public static void Maxsubarr(int number[]){
        // i is the starting index of the subarray
        for (int i = 0; i < number.length; i++){
            // j is the ending index of the subarray (j >= i)
            for(int j = i; j < number.length; j++){
                int sum = 0; // will hold the sum of elements from index i to j
                System.out.print("(");
                // k iterates through the current subarray from i to j
                for (int k = i; k <= j; k++){
                    System.out.print(number[k] + " "); // print element in the subarray
                    sum = sum + number[k]; // accumulate sum for this subarray
                }
                // close parenthesis for subarray, then print arrow and the computed sum
                System.out.print(")" + "-> " + sum + " ");
            }
            // after printing all subarrays that start at i, move to next line
            System.out.println();
        }
    }

    public static void main(String args[]){
        int number[] = {2,4,6,8,10}; // sample input array
        Maxsubarr(number); // call the method to print all subarrays and sums
    }
}
