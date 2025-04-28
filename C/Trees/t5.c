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

tree* insert(tree* root){
    tree *ptr=NULL, *p=NULL, *c=NULL;
    int x;
    ptr = (tree*)malloc(sizeof(tree));
    if(ptr){
        printf("Enter the value to insert: ");
        scanf("%d", &x);
        ptr->data = x;
        ptr->left = NULL;
        ptr->right = NULL;

        if(root==NULL){
            root = ptr;
            return root;
        }
        p = c = root;

        while(c!=NULL){
            p=c;
            if(c->data > x){
                c = p->left;
            }else if(c->data < x){
                c = p->right;
            }else{
                printf("Data already exist\n");
                free(ptr);
                return root;
            }
        }
        if(p->data > x){
            p->left = ptr;
        }else{
            p->rigth = ptr;
        }
        return root;
    }else{
        printf("Memory not allocated\n");
    }
}

void display(tree* root){
    tree** stk = (tree**)malloc(sizeof(tree*)*100);
    int top = -1;
    tree* current = root;

    while(current != NULL || top!=-1){
        while(current != NULL){
            stk[top++] = current;
            current = current->left;
        }
        current = stk[top--];
        printf("%d\t", current->data);
        current = current->right;
    }
    printf("\n");
    free(stk);
}

int countNodes(tree* root){
    if(root==NULL){
        return 0;
    }
    tree** stk = (tree**)malloc(sizeof(tree*)*100);
    int top = -1, count=0;
    tree* current = root;
    
    while(current != NULL || top!=-1){
        while(current != NULL){
            stk[++top] = current;
            current = current->left;
        }
        current = stk[top--];
        count ++;
        current = current->right;
    }
    free(stk);
    return count;
}
