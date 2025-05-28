class Rect{
    static boolean validCorner(int[][] mat){
        int rows = mat.length;
        int cols = mat[0].length;
        
        for(int i=0;i<rows-1;i++){
            for(int j=i+1;j<rows;j++){
                int count=0;
                for(int k=0;k<cols;k++){
                    if(mat[i][k]==1 && mat[j][k]==1){
                        count++;
                    }
                }
                if(count >= 2){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String... args){
        int[][] mat = {{1, 0, 0, 1, 0}, {0, 0, 1, 0, 1}, {0, 0, 0, 1, 0}, {1, 0, 1, 0, 1}};

        System.out.println(Rect.validCorner(mat));
    }
}

/* 
what we have to do here is we have to find the rectangle with corners 1
so the matrix is 1 0 0 1 0
                 0 0 |1 0 1|
                 0 0 |0 1 0|-> this is the valid rectangle 
                 1 0 |1 0 1|
    */ 