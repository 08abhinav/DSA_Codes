#include<stdio.h>
#include<stdlib.h>
struct DoubleList{
    int data;
    struct DoubleList *next;
    struct DoubleList *prev;
} typedef node;

void insertAtRight(node**, node**);
void inserAtLeft(node** , node**);
void displayAtRight(node*);
void displayAtLeft(node*);

int main(){
    node *r=NULL, *l=NULL;
    int ch;
    do{
        printf("1.Insert At Right\n2.Insert At left\n3.Display\nEnter you choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: insertAtRight(&r, &l);
            break;
            case 2: inserAtLeft(&r, &l);
            break;
            case 3: displayAtRight(l);
            break;
        }
    }while(ch<=4);
}

void insertAtRight(node **r, node **l){
    node *ptr = NULL;
    ptr = (node*)malloc(sizeof(node));
    if(){
        int x;
        printf("Enter the value to insert: ");
        scanf("%d", &x);
        ptr->data = x;
        ptr->next = NULL;
        if(*r == NULL && *l == NULL){
            *l = *r = ptr;
            ptr->prev = NULL;
        }else{
            (*r)->next = ptr;
            ptr->prev = (*r);
            (*r) = ptr;
        }
    }else{
        printf("Memory not allocated\n");
    }
}

void inserAtLeft(node **r, node **l){
    node *ptr = NULL;
    ptr = (node*)malloc(sizeof(node));
    if(ptr!=NULL){
        int x;
        printf("Enter the value to insert: ");
        scanf("%d", &x);
        ptr->data = x;
        ptr->prev = NULL;
        if(*l==NULL && *r==NULL){
            *l = *r = ptr;
            ptr->next = NULL;
        }else{
            (*l)->prev = ptr;
            ptr->next = (*l);
            (*l) = ptr;
        }
    }else{
        printf("Memory not allocated\n");
    }
}

void displayAtRight(node *l){
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

