#include<stdio.h>
#include<stdlib.h>

struct list{
    struct list *left;
    int data;
    struct list *right;
}typedef node;

node* insert(node*, int);
void inOrder(node*);
void postOrder(node*);
void preOrder(node*);

int main(){
    node *root = NULL;
    int ch, data;
    do{
        printf("1.Insert\n2.Inorder\n3.Preorder\n4.Postorder\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: printf("Enter the value you want to insert: ");
            scanf("%d", &data);
            root = insert(root, data);
            break;

            case 2: if(root==NULL){
                printf("Tree is empty\n");
            }else{
                printf("Inorder traversal of tree\n");
                inOrder(root);
            }
            break;

            case 3: if(root==NULL){
                printf("Tree is empty\n");
            }else{
                printf("Preorder traversal of tree\n");
                preOrder(root);
            }
            break;

            case 4: if(root==NULL){
                printf("Tree is empty\n");
            }else{
                printf("Postorder traversal of tree\n");
                postOrder(root);
            }
            break;
        }
    }while(ch>0 && ch<=4);
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

void inOrder(node *root){
    if(root!=NULL){
        inOrder(root->left);
        printf("%d\t", root->data);
        inOrder(root->right);   
    }
}

void preOrder(node *root){
    if(root !=NULL){
        printf("%d\t", root->data);
        preOrder(root->left);
        preOrder(root->right);
    }
}

void postOrder(node *root){
    if(root!=NULL){
        postOrder(root->left);
        postOrder(root->right);
        printf("%d\t", root->data);
    }
}