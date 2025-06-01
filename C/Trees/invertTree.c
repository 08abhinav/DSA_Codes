/* Printing the mirror image of Tree
-> to find the mirror image of a binary search tree we just have to swap the nodes 
*/

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
        printf("1.Insert\n2.Inorder\n3.Invert\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: r = insert(r);
            break;

            case 2: inorder(r);
            break;

            case 3: r = invert(r);
            break;
        }
    }while(ch>=1 && ch<=3);
}

tree* insert(tree *rt){
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
    
        if(rt==NULL){
            rt = t;
            return rt;
        }

        p = c = rt;

        while(c!=NULL){
            p = c;
            if(c->data > x){
                c = p->left;
            }
            else if(c->data < x){
                c = p->right;
            }
            else{
                printf("Already exits\n");
                free(t);
                return rt;
            }
        }
        if(p->data > x){
            p->left = t;
        }else{
            p->right = t;
        }
    }
    return rt;
}

tree* inorder(tree *rt){
    if(rt != NULL){
        inorder(rt->left);
        printf("%d\t", rt->data);
        inorder(rt->right);
    }
} 
