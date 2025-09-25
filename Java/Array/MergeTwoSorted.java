package Java.Array;

import java.util.Arrays;

public class MergeTwoSorted {
    public static void mergeArrays(int[] nums1, int m, int nums2[], int n){
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >=0 && j >=0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i -= 1;
            }else{
                nums1[k] = nums2[j];
                j -= 1;
            }
            k -= 1;
        }

        while(j >= 0){
            nums1[k] = nums2[j];
            k -= 1;
            j -= 1;
        }

        System.out.println("After sorting" + Arrays.toString(nums1));
    }
    public static void main(String[] args) {
        int[] nums1 = {10, 20, 20, 40, 0, 0};
        int m = 4;
        int[] nums2 = {1, 2};
        int n = 2;

        MergeTwoSorted.mergeArrays(nums1, m, nums2, n);
    }
}
