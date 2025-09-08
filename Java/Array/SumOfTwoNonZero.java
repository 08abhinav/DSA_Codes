/*1317. Convert Integer to the Sum of Two No-Zero Integers
No-Zero integer is a positive integer that does not contain any 0 in its decimal representation.
Given an integer n, return a list of two integers [a, b] where:

a and b are No-Zero integers.
a + b = n
The test cases are generated so that there is at least one valid solution. If there are many valid solutions, you can return any of them. */
class SumOfTwoNonZero{
    public static int[] getNoZero(int n){
        int a = n - 1, b = 1;
        while(String.valueOf(a).contains("0") || String.valueOf(b).contains("0")){
            a -= 1;
            b += 1;
        }
        return new int[]{a, b};
    }
    public static void main(String[] args) {
        int n = 10000;
        System.out.println(SumOfTwoNonZero.getNoZero(n));
    }
}