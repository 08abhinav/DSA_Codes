/*
371. Sum of Two Integers
Given two integers a and b, return the sum of the two integers without using the operators + and -. 
*/
public class SumOfTwo {
    public static int getSum(int a, int b){
        int c = 0;
        while(b != 0){
            c = a & b;
            a = a ^ b;
            b = c << 1;
        }
        return a;
    }
    public static void main(String... args){
        int a = 2, b = 3;
        System.out.println(getSum(a, b));
    }
}
