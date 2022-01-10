package leetcode;

public class SortedSquares {
    //9,3,2,0,5,4
    public int[] sortedSquares(int[] nums) {
        boolean state = true;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i]*nums[i];
        }
        while(state) {
            state = false;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    state=true;
                }
            }
        }
        return nums;
    }
}
