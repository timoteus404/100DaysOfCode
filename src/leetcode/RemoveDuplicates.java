package leetcode;

import java.util.Arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        int k = 1;
        int index = 0;
        int first = 0;
        int second = 1;
        //0,0,1,1,1,2,2,3,3,4
        //0 1 2 3 4
        //0 1 2 3 4 5 6 7 8 9

        //2,2,3 -> 0 2 3
        if(nums.length == 0){
            return 0;
        }
        while(second < nums.length){
            if(nums[first]==nums[second]){
                nums[first] = 0;
                first++;
                second++;
            }else {
                first++;
                second++;
                k++;
            }
        }
        Arrays.sort(nums);

        for (int i = nums.length-k; i <nums.length ; i++) {

            if(nums[index]<0){
                index++;
            }else{
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }
        return k;
    }

    //Optimized solution
    public static int removeDuplicatesTwo(int[] nums){
        int k = 0;
        int first = 0;
        int second = 1;

        while(second<nums.length){
        //0,0,1,1,1,2,2,3,3,4
            if(nums[first]!=nums[second]){
                nums[++first] = nums[second];
                second++;
                k++;
            }else {
                second++;
            }
        }
        return k+1;
    }
}
