// Deletion in BST

#include<stdio.h>
#include<stdlib.h>

typedef struct list{
    struct list *left;
    int data;
    struct list *right;
}tree;

tree* p = NULL;
tree* insert(tree *);
void delete(tree *);
tree* search(tree *, int);
void inorder(tree *);

int main(){
    tree *root=NULL, *d = NULL;
    int ch;
    do{
        printf("1.Insert\n2.Delete\n3.Inorder\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: root = insert(root);
            break;

            case 2: 
            int value;
            printf("Enter the value to serach: ");
            scanf("%d", &value);
            d = search(root, value);
            break;

            case 3: inorder(root);
            break;

            case 4:
            int value;
            printf("Enter the value to delete: ");
            scanf("%d", &value);
            delete(root, value);
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


tree* search(tree *root, int value){
    if(root==NULL){
        printf("Tree is empty\n");
        return NULL;
    }else{
        tree *c = NULL;
        if(root->data == value){
            printf("Value found, %d is root node\n", root->data);
            return root;
        }else{
            p = c = root;
            while(c!=NULL){
                if(c->data == value){
                    printf("%d found and it's parent is: %d\n", value, p->data);
                    if(p->data > value){
                        printf("%d is %d's left child\n", value, p->data);
                    }else{
                        printf("%d is %d's right child\n", value, p->data);
                    }
                    return c;
                }
                p = c;
                if(c->data > value){
                    c = c->left;
                }else{
                    c = c->right;
                }
            }
        }
    }
    printf("%d not found\n", value);
    return NULL;
}

void inorder(tree *root){
    inorder(root->left);
    printf("%d\t", root->data);
    inorder(root->right);
}


void delete(tree *root, int value){
    if(root==NULL){
        printf("Tree is empty\n");
        return;
    }else{
        tree* n = NULL;
        n = search(root, value);
        if(n){
            // Case 1 when n is a leaf node.
            if(n->left == NULL && n->right == NULL){
                if(n->data < p->data){
                    p->left = NULL;
                }else{
                    p->right = NULL;
                }
                free(n);
            }
            // Case 2  only left child
            else if(n->left != NULL && n->right == NULL){
                if(n->data < p->data){
                    p->left = n->left;
                }else{
                    p->right = n->right;
                }
                n->left = NULL:
                free(n);
            }
            // Case 3 only right child
            else if(n->left == NULL && n->right != NULL){
                if(n->data < p->data){
                    p->left = n->left;
                }else{
                    p->right = n->right;
                }
                n->right = NULL:
                free(n);
            }

        }else{
            printf("Element not present\n");
        }
    }
}