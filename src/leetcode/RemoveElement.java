package leetcode;

import java.util.Arrays;
import java.util.Collections;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int k =0;
        int length = nums.length;
        //0,1,2,2,3,0,4,2
        for (int i = 0; i <length; i++) {
            if(nums[i]==val){
                nums[i] = 0;
                k++;
            }
        }
        boolean state = true;
        while(state) {
            state=false;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i - 1] < nums[i]) {
                    int temp = nums[i - 1];
                    nums[i - 1] = nums[i];
                    nums[i] = temp;
                    state=true;
                }
            }
        }
        return nums.length-k;
    }
}
