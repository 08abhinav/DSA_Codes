#include<stdio.h>
#include<stdlib.h>

struct list{
    struct list *left;
    int data;
    struct list *right;
}typedef node;

node* createNode(int);
node* insert(node*, int);
node* display(node*);

int main(){
    node *root = NULL;
    int ch, data;
    do{
        printf("1.Insert\n2.Display\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: printf("Enter the value you want to insert: ");
            scanf("%d", &data);
            root = insert(root, data);
            break;

            case 2: display(root);
            break;
        }
    }while(ch>0 && ch<=2);
}