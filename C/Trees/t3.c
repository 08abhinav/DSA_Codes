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

tree* p = NULL;

int main(){
    tree *root=NULL;
    int ch;
    do{
        printf("1.Insert\n2.Search\n3.Inorder\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: root = insert(root);
            break;

            case 2: search(root);
            break;

            case 3: inorder(root);
            break;
        }
    }while(ch<=3);
}

tree* insert(tree *root){
    tree *ptr = NULL, *p=NULL, *c=NULL;
    int x;
    ptr = (tree *)malloc(sizeof(tree));
    if(ptr){
        printf("Enter the value to insert: ");
        scanf("%d", &x);
        ptr->data = x;
        ptr->left = NULL;
        ptr->right = NULL;

        if(root == NULL){
            root = ptr;
            return root;
        }
        p = c = root;

        while(c!=NULL){
            p = c;
            if(c->data > x){
                c = p->left;
            }
            else if(c->data < x){
                c = p->right;
            }
            else{
                printf("Duplicate value not allowed\n");
                free(ptr);
                return root;
            }
        }
        if(p->data > x){
            p->left = ptr;
        }else{
            p->right = ptr;
        }
        return root;
    }else{
        printf("Memory not allocated\n");
    }

}


void search(tree *root){
    if(root == NULL){
        printf("Tree is empty\n");
        return;
    }

    tree *c = NULL;
    p = c = root;
    int value;
    printf("Enter the value to search: ");
    scanf("%d", &value);
    if(p->data == value){
        printf(" %d found\n %d is root node\n", p->data, value);
        return;
    }
    while(c != NULL){

        if(c->data == value){
            printf(" %d found in the tree\n", value);
            if(value < p->data){
                printf("%d is the parent of %d and %d is it's left child\n", p->data, value, value);
            }else{
                printf("%d is the parent of %d and %d is it's right child\n", p->data, value, value);
            }
            return;
        }
        else if(value < c->data){
            p=c;
            c = p->left;
        }
        else{
            p=c;
            c = p->right;
        }
    }

    printf(" %d not found in the tree\n", value);
}

void inorder(tree *root){
    if(root !=NULL){
        inorder(root->left);
        printf("%d\t", root->data);
        inorder(root->right);
    }
}
