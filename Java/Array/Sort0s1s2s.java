import java.util.Arrays;

public class Sort0s1s2s {
    public static void sort012(int[] arr){
        int n = arr.length;
        int c0 = 0, c1 = 0, c2 = 0, idx = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == 0) c0++;
            else if(arr[i] == 1) c1++;
            else c2++;
        }

        for(int i=0; i<c0; i++){
            arr[idx++] = 0;
        }

        for(int i=0; i<c1; i++){
            arr[idx++] = 1;
        }

        for(int i=0; i<c2; i++){
            arr[idx++] = 2;
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String... args){
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        Sort0s1s2s.sort012(arr);
    }
}
