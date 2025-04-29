//Transpose of a matrix without using extra matrix

#include<stdio.h>

void trans(int [][], int, int);
int main(){
    int r, c,i,j;
    printf("Enter the number of rows: ");
    scanf("%d", &r);
    printf("Enter the number of columns: ");
    scanf("%d", &c);
    int mat[r][c];
    printf("Enter the elements\n");
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            scanf("%d", &mat[i][j]);
        }
    }
    trans(mat, r, c);
}