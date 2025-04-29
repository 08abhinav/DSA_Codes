// rotate matrix by 90 degree(clockwise)

#include<stdio.h>
void tranpose(int mat[][100], int, int);
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