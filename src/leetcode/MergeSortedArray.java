package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = (m+n)-1; i >= m; i--) {
            nums1[i] = nums2[--n];
        }

        boolean state=true;

        while(state) {
            state=false;
            for (int i = 0; i < nums1.length; i++) {
                if (i<nums1.length-1 && nums1[i] > nums1[i + 1]) {
                    int temp = nums1[i];
                    nums1[i] = nums1[i + 1];
                    nums1[i + 1] = temp;
                    state=true;
                }
            }
        }
    }
}
