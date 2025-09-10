public class TrappingRainwater{
    public static int TrappingRainwater(int height[]) {
        int l = 0, r = height.length - 1;
        int leftmax = 0, rightmax = 0;
        int water = 0;

        while (l < r) {
            if (height[l] <= height[r]) {
                if (height[l] >= leftmax) {
                    leftmax = height[l];
                } else {
                    water += leftmax - height[l];
                }
                l++;
             } else {
                if (height[r] >= rightmax) {
                    rightmax = height[r];
                } else {
                    water += rightmax - height[r];
                }
                r--;
             }
        }   
        return water;
    }

    public static void main(String args[]) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(TrappingRainwater(height)); // Expected 6
    }
}
