// rotate matrix by 90 degree(clockwise)

#include<stdio.h>
void rotate(int mat[][100], int, int);

int main(){
    int r, c, mat[100][100], i, j;
    printf("Enter the size of row: ");
    scanf("%d", &r);
    printf("Enter the size of column: ");
    scanf("%d", &c);
    mat[r][c];
    printf("Enter the elements\n");
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            scanf("%d", &mat[i][j]);
        }
    }
    rotate(mat, r, c);
}

void rotate(int mat[][100], int r, int c){
    for(int i=0;i<r;i++){
        for(int j=i+1;j<c;j++){
            int temp = mat[i][j];
            mat[i][j] = mat[j][i];
            mat[j][i] = temp;
        }
    }

    for(int i=0;i<r;i++){
        for(int j=0;j<c/2;j++){
            int temp = mat[i][j];
            mat[i][j] = mat[i][c-j-1];
            mat[i][c-j-1] = temp;
        }
    }
    printf("After rotating matrix by 90 degree\n");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            printf("%d\t", mat[i][j]);
        }
        printf("\n");
    }
}