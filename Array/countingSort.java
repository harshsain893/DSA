package Array;
public class countingSort {
    public static void countingSort(int arr[]) {
        int n = arr.length;

        // 1. Find max
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) max = arr[i];
        }

        // 2. Make count array
        int count[] = new int[max + 1];

        // 3. Store frequencies
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // 4. Build sorted array
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 8, 3, 3, 1};
        countingSort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

