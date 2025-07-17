public class PowerOfK {
    public static int fact(int num){
        if(num == 0 || num == 1) return 1;

        return num * fact(num - 1);
    }
    public static int maxKPower(int n, int k){
        int factRes = fact(n);
        int power = 0;

        while(factRes % k == 0){
            power++;
            factRes /= k;
        }
        return power;
    }
    public static void main(String...ar){

    }
}
