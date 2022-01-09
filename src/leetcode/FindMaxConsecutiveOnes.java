package leetcode;

public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int index =0;
        int result = 0;


        while(index != nums.length) {
            if(nums[index]==1){
                count++;
                index++;
                if(count>result){
                    result = count;
                }
            }else{
                count=0;
                index++;
            }

        }
        return result;
    }
}
