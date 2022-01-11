package leetcode;

public class DuplicateZeros {
    //1,0,2,3,0,4,5,0
    //1,
    //0 1 2 3 4 5 6 7
    public void duplicateZeros(int[] arr) {

        int[] result = new int[arr.length];
        int arrIndex =0;
        int resIndex =0;

        while(resIndex<arr.length){
            if(arr[arrIndex]==0){
                resIndex = resIndex+2;
                arrIndex++;
            }else {
                result[resIndex] = arr[arrIndex];
                resIndex++;
                arrIndex++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = result[i];
        }
    }

}
