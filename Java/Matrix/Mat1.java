import java.util.HashMap;
public class Mat1 {
    public static void main(String...args){
        int[][] mat1 = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
        int[][] mat2 = {{11, 12, 13},{14, 15, 16}, {17, 18, 19}};
        HashMap<Integer, Integer> map = new HashMap<>();
        int k = 21;
        int count = 0;
        /*for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[0].length;j++){
                for(int m=0;m<mat2.length;m++){
                    for(int n=0;n<mat2[0].length;n++){
                        if(mat1[i][j] + mat2[m][n] == k){
                            count++;
                        }
                    }
                }
            }
        }*/
        
        for(int[] row: mat1){
            for(int i: row){
                map.put(i, map.getOrDefault(i,0)+1);
            }
        }

        for(int[] row: mat2){
            for(int i: row){
                int b = k-i;
                if(map.containsKey(b)){
                    count += map.get(b);
                }
            }
        }
        System.out.println("Sum of total pairs in matrix are: "+count);
    }    
}
