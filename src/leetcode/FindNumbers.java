package leetcode;

public class FindNumbers {

    public int findNumbers(int[] nums) {
        int result = 0;

        for(int i:nums){
            int n = Integer.toString(i).length();
            if(n%2==0){
                result++;
            }
        }
        return result;
    }
}
