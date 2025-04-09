// Implementing tree's insertion without using recursion

#include<stdio.h>
#include<stdlib.h>

typedef struct list{
    struct list *left;
    int data;
    struct list *right;
}tree;

void insert(node **);
void inOrder(node *);

int main(){
    tree *rt = NULL;
    int ch;
    do{
        printf("1.Insert\n2.Inorder\nEnter your choice: ");
        scanf("%d",&ch);
    }while(ch<=1);
}