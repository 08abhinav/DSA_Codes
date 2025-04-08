#include<stdio.h>
#include<stdlib.h>

struct list{
    struct list *left;
    int data;
    struct list *right;
}typedef node;

node* insert(node*, int);
void display(node*);

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

            case 2: if(root==NULL){
                printf("Tree is empty\n");
            }else{
                display(root);
            }
            break;
        }
    }while(ch>0 && ch<=2);
}

node* insert(node *root, int data){
    node *ptr = NULL;
    if(root==NULL){
        ptr = (node*)malloc(sizeof(node));
        ptr->left = NULL;
        ptr->data = data;
        ptr->right = NULL;
        return ptr;
    }
    else if(data < root->data){
        root->left = insert(root->left, data);
    }
    else if(data > root->data){
        root->right = insert(root->right, data);
    }
    return root;
}

void display(node *root){
    if(root!=NULL){
        printf("%d\t", root->data);
        display(root->left);
        display(root->right);
    }
    printf("\n");
}