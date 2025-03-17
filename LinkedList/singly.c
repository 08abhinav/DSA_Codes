#include<stdio.h>
#include<stdlib.h>

struct list{
    int data;
    struct list *next;
}typedef node;

void insert(node **, node **);
void display(node **);

int main(){
    node *l=NULL, *r=NULL;
    int ch;
    do{
        printf("1.Insert\n2.Display\nEnter choice: ");
        scanf("%d",&ch);
        switch(ch){
            case 1: insert(&l, &r);
            break;
            case 2: display(&l);
            break;
        }
    }while(ch<=2);
}

void insert(node **l, node **r){
    node *ptr = NULL;
    ptr = (node *)malloc(sizeof(node));
    if(ptr!=NULL){
        int x;
        printf("Enter the value to insert: ");
        scanf("%d", &x);
        ptr->data = x;
        ptr->next = NULL;
        if(*l==NULL && *r==NULL){
            *l=*r=ptr;
        }else{
            (*r)->next=ptr;
            *r=ptr;
        }
    }
}

void display(node **l){
    node *temp = NULL;
    temp = *l;
    if(temp==NULL){
        printf("List is Empty\n");
    }else{
        while(temp!=NULL){
        printf("%d\t", temp->data);
        temp = temp->next;
        }
    }
    printf("\n");
}