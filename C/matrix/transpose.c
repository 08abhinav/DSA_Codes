//Transpose of a matrix without using extra matrix

#include<stdio.h>
void trans(int [][100], int, int);

int main(){
    int r, c,i,j, mat[100][100];
    printf("Enter the number of rows: ");
    scanf("%d", &r);
    printf("Enter the number of columns: ");
    scanf("%d", &c);
    printf("Enter the elements\n");
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            scanf("%d", &mat[i][j]);
        }
    }
    printf("Entered matrix\n");
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            printf("%d\t", mat[i][j]);
        }
        printf("\n");
    }
    trans(mat, r, c);
}

void trans(int mat[][100], int r, int c){
    for (int i = 0; i < r; i++) {
        for (int j = i + 1; j < c; j++) {
            int temp = mat[i][j];
            mat[i][j] = mat[j][i];
            mat[j][i] = temp;
        }
    }

    printf("After transposing matrix\n");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            printf("%d\t", mat[i][j]);
        }
        printf("\n");
    }
}