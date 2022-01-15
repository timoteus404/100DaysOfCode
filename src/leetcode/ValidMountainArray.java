package leetcode;

public class ValidMountainArray {
    /**
     * arr.length >= 3
     * There exists some i with 0 < i < arr.length - 1 such that:
     * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
     * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
     */
    public static boolean validMountainArray(int[] arr) {
        int first = 0;
        int second = 1;
        int temp =0;

        if(arr.length < 3 || arr[first]>arr[second]){
            return false;
        }

        while(second<arr.length&&arr[second] > arr[first]){
            if(arr[first] == arr[second]){
                return false;
            }
            first++;
            second++;
        }

        if(second>=arr.length || arr[first]==arr[arr.length-1]){
            return false;
        }else {
            temp = arr[first];
        }

        while(second<arr.length){

            if(temp>arr[second]){
                temp=arr[second];
                second++;
            }else {
                return false;
            }
        }

        return true;
    }
}
