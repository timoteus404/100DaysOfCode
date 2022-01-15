package leetcode;

public class CheckIfExist {

    public static boolean checkIfExist(int[] arr) {

//        i != j
//        0 <= i, j < arr.length
//        arr[i] == 2 * arr[j]
//        10,2,5,3

        //base case
        if(arr.length == 0 || arr == null){
            return false;
        }

        for(int i = 0; i<arr.length;i++){

            for (int j = 0; j < arr.length; j++) {

                if(i!=j && arr[i] == 2* arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
