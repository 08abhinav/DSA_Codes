#include<stdio.h>
#include<stdlib.h>

struct list{
    int data;
    struct list *next;
}typedef node;

void insert(node **, node **);
void insertAtBegining(node **);
void insertAfterFirstNode(node **);
void delete(node **);
void display(node **);

int main(){
    node *l=NULL, *r=NULL;
    int ch;
    do{
        printf("1.Insert at end\n2.Insert at Begining\n3.Insert after firstNode\n4.Display\n5.Delete\nEnter choice: ");
        scanf("%d",&ch);
        switch(ch){
            case 1: insert(&l, &r);
            break;
            case 2: insertAtBegining(&l);
            break;
            case 3: insertAfterFirstNode(&l);
            break;
            case 4: display(&l);
            break;
            case 5: delete(&l);
            break;
        }
    }while(ch<=5);
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
    }else{
        printf("Memory not allocated\n");
    }
}

void insertAtBegining(node **l){
    node *ptr = NULL;
    ptr = (node*)malloc(sizeof(node));
    if(ptr!=NULL){
        int x;
        printf("Enter the value to insert: ");
        scanf("%d", &x);
        ptr->data = x;
        ptr->next = *l;
        *l=ptr;
    }else{
        printf("Memory not allocated\n");
    }
}

void insertAfterFirstNode(node **l){
    node *ptr = NULL, *temp=NULL;
    ptr = (node*)malloc(sizeof(node));
    if(ptr!=NULL){
        int x;
        printf("Enter the value to insert: ");
        scanf("%d",&x);
        temp = *l; //because it will not modify the l in main
        ptr->data = x;
        ptr->next = temp->next;
        temp->next = ptr;
    }else{
        printf("Memory not allocated\n");
    }
}

void delete(node **l){
    node *temp = NULL;
    temp = *l;
    if(temp==NULL){
        printf("List is empty\n");
    }else{
        printf("Delete Node: %d\n", temp->data);
        *l = (*l)->next;
        free(temp);
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