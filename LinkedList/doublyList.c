#include<stdio.h>
#include<stdlib.h>
struct DoubleList{
    int data;
    struct DoubleList *next;
    struct DoubleList *prev;
} typedef node;

node* insert(node*);

int main(){
    node *r=NULL;
    int ch;
    do{
        printf("1.Insert\n2.Delete\n3.Display\nEnter you choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: r = insert(r);
            break;
            // case 2: last = delete(last);
            // break;
            // case 3: display(last);
            // break;
        }
    }while(ch<=3);
}

node* insert(node *r){
    node *ptr = NULL;
    ptr = (node*)malloc(sizeof(node));
    if(ptr!=NULL){
        int x;
        printf("Enter the value to insert: ");
        scanf("%d", &x);
        ptr->data = x;
        if(r == NULL){
            r = ptr;
            r->prev = NULL;
            r->next = r;
        }else{
            ptr->prev = r;
            r->next = ptr;
            r = ptr;
        }
        r->next = NULL;
    }else{
        printf("Memory not allocated\n");
    }
    return r;
}