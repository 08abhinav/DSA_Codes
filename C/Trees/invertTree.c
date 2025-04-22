// Printing the mirror image of Tree

#include<stdio.h>
#include<stdlib.h>

typedef struct list{
    struct list *left;
    int data;
    struct list *right;
}tree;

tree* insert(tree*);
tree* inorder(tree*);
tree* invert(tree*);

int main(){
    tree *r = NULL;
    int ch;
    do{
        printf("1.Insert\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: r = insert(r);
            break;

            case 2: tree(r);
            break;
        }
    }while(ch<=2);
}

tree* insert(tree *r){
    node *ptr = NULL;
    ptr = (node*)malloc(sizeof(node));
    if(ptr){

    }else{
        printf("Memory not allocated\n");
    }
}