// Finding a node in a tree

#include<stdio.h>
#include<stdlib.h>

typedef struct list{
    struct list *left;
    int data;
    struct list *right;
}tree;

tree* insert(tree *);
void search(tree *);
void inorder(tree *);

int main(){
    struct *root=NULL;
    int ch;
    do{
        printf("1.Insert\n2.Search\n3.Inorder\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: root = insert(root);
            break;

            case 2: search(root):
            break;

            case 3: inorder(root);
            break;
        }
    }while(ch<=3);
}

