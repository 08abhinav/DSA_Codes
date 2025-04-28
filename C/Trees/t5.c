/*Traverse the tree without recursion, using stack traversing and counting the 
total number of nodes. */
#include<stdio.h>
#include<stdlib.h>

typedef struct list{
    struct list *left;
    int data;
    struct list *right;
}tree;

tree* insert(tree*);
int countNodes(tree*);
void display(tree*);

int main(){
    tree *h=NULL, *root=NULL;
    int ch, c=0;
    do{
        printf("1.Insert\n2.CountNodes\n3.Dispaly\nEnter your choice: ");
        scanf("%d",&ch);
        switch(ch){
            case 1: root = insert(root);
            if(h==NULL){
                h = root;
            }
            break;

            case 2: c = countNodes(root);
            printf("Total nodes in the tree are: %d\n", c);
            break;

            case 3: display(root);
            break;
        }
    }
}