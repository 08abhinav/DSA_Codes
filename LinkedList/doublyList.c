#include<stdio.h>
#include<stdlib.h>
struct DoubleList{
    int data;
    struct DoubleList *next;
    struct DoubleList *prev;
} typedef node;

node* insert(node**, node**);
void display(node*);

int main(){
    node *r=NULL, *l=NULL;
    int ch;
    do{
        printf("1.Insert\n2.Delete\n3.Display\nEnter you choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: insert(&r, &l);
            break;
            // case 2: last = delete(last);
            // break;
            case 3: display(l);
            break;
        }
    }while(ch<=3);
}

node* insert(node **r, node **l){
    node *ptr = NULL;
    ptr = (node*)malloc(sizeof(node));
    if(ptr!=NULL){
        int x;
        printf("Enter the value to insert: ");
        scanf("%d", &x);
        ptr->data = x;
        ptr->next = NULL;
        if((*r) == NULL && (*l) == NULL){
            (*l) = (*r) = ptr;
            (*l)->prev = NULL;
        }else{
            (*r)->next = ptr;
            ptr->prev = (*r);
            (*r) = ptr;
        }
    }else{
        printf("Memory not allocated\n");
    }
}

void display(node *l){
    if(l == NULL){
        printf("List is empty\n");
    }else{
        node *temp = l;
        while(temp!=NULL){
            printf("%d\t", temp->data);
            temp = temp->next;
        }
        printf("\n");
    }
}