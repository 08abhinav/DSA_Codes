import java.util.Arrays;

public class MaximizeHappiness {
    public static long maximizeHappiness(int[] happiness, int k){
        Arrays.sort(happiness);
        int n = happiness.length - 1;
        long res = 0;
        for(int i = 0; i < k; i++){
            if(happiness[n - i] - i > 0){
                res += happiness[n - i] - i;
            }else{
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] happiness = {2, 4, 5, 3};
        int k = 2;
        System.out.println(maximizeHappiness(happiness, k));
    }
}
