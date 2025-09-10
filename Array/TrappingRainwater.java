package Array;
public class TrappingRainwater{
    public static int TrappingRainwater(int height[]) {
        int left = 0, right = height.length - 1;
        int leftmax = 0, rightmax = 0;
        int water = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                if (height[left] >= leftmax) {
                    leftmax = height[left];
                } else {
                    water += leftmax - height[left];
                }
                left++;
             } else {
                if (height[right] >= rightmax) {
                    rightmax = height[right];
                } else {
                    water += rightmax - height[right];
                }
                right--;
             }
        }   
        return water;
    }

    public static void main(String args[]) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(TrappingRainwater(height)); // Expected 6
    }
}
