// Implementing binary search tree's insertion without using recursion

#include<stdio.h>
#include<stdlib.h>

typedef struct list{
    struct list *left;
    int data;
    struct list *right;
}tree;

void insert(tree **);
void inOrder(tree *);
void preOrder(tree *);
void postOrder(tree *);
int countNodes(tree *);

int main(){
    tree *rt = NULL;
    int ch;
    do{
        printf("1.Insert\n2.Inorder\n3.Preorder\n4.Postorder\n5.CountNodes\nEnter your choice: ");
        scanf("%d",&ch);
        switch(ch){
            case 1: insert(&rt);
            break;

            case 2: 
            printf("Inorder traversal of tree\n");
            inOrder(rt);
            break;

            case 3: preOrder(rt);
            break;

            case 4: postOrder(rt);
            break;

            case 5: countNodes(rt);
            break;
        }
    }while(ch>0 && ch<=5);
}

void insert(tree **rt){
    tree *t = NULL, *p = NULL, *c = NULL;

    t = (tree *)malloc(sizeof(tree));
    if(!t){
        printf("Memory not allocated\n");
    }else{
        int x;
        printf("Enter the value to insert: ");
        scanf("%d", &x);
        t->left = t->right = NULL;
        t->data = x;
    
        if(*rt==NULL){
            *rt = t;
            return;
        }

        p = c = *rt;

        while(c!=NULL){
            if(c->data > x){
                p = c;
                c = p->left;
            }
            else if(c->data < x){
                p = c;
                c = p->right;
            }
            else{
                printf("Already exits\n");
                free(t);
                return;
            }
        }
        if(p->data > x){
            p->left = t;
        }else{
            p->right = t;
        }
    }
}

void inOrder(tree *rt){
    if (rt!=NULL){
        inOrder(rt->left);
        printf("%d\t", rt->data);
        inOrder(rt->right);
    }
    printf("\n");
}

void preOrder(tree *rt){
    if(rt!=NULL){
        printf("%d\t", rt->data);
        preOrder(rt->left);
        preOrder(rt->right);
    }
    printf("\n");
}

void postOrder(tree *rt){
    if(rt!=NULL){
        postOrder(rt->left);
        postOrder(rt->right);
        printf("%d\t", rt->data);
    }
    printf("\n");
}

int countNodes(tree *rt){
    if(rt!=NULL){
        return 1+countNodes(rt->left)+countNodes(rt->right);    
    }
    else{
        return 0;
    }
   
}