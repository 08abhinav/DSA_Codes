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
        
    }
}