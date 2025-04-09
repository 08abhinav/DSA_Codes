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

int main(){
    tree *rt = NULL;
    int ch;
    do{
        printf("1.Insert\n2.Inorder\nEnter your choice: ");
        scanf("%d",&ch);
        switch(ch){
            case 1: insert(&rt);
            break;

            case 2: inOrder(rt);
            break;
        }
    }while(ch<=3);
}

void insert(tree **rt){
    tree *t = NULL;
    tree *p = NULL;
    tree *c = NULL;

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
