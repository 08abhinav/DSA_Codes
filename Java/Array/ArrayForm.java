/*
989. Add to Array-Form of Integer
The array-form of an integer num is an array representing its digits in left to right order.
For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k. */
import java.util.LinkedList;
import java.util.List;

public class ArrayForm {
    public static List<Integer> addToArrayForm(int[] num, int k){
        List<Integer> res = new LinkedList<>();
        int i = num.length - 1;

        while(k > 0 || i >= 0){
            if(i >= 0){
                k += num[i];
                i--;
            }
            res.addFirst(k % 10);
            k /= 10;
        }
        return res;
    }
    public static void main(String... args){
        int[] num = {1, 2, 0, 0};
        int k = 34;
        System.out.println(addToArrayForm(num, k));
    }
}
