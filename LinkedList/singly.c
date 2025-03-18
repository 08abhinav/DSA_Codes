#include<stdio.h>
#include<stdlib.h>

struct list{
    int data;
    struct list *next;
}typedef node;

void insert(node **, node **);
void insertAtBegining(node **);
void insertAfterFirstNode(node **);
void insertBeforeLastNode(node **);
void delete(node **);
void deleteSpecificNode(node **);
void display(node **);

int main(){
    node *l=NULL, *r=NULL;
    int ch;
    do{
        printf("1.Insert at end\n2.Insert at Begining\n3.Insert after firstNode\n4.Insert before last\n5.Display\n6.Delete from beginning\n7.Delete specific\nEnter choice: ");
        scanf("%d",&ch);
        switch(ch){
            case 1: insert(&l, &r);
            break;
            case 2: insertAtBegining(&l);
            break;
            case 3: insertAfterFirstNode(&l);
            break;
            case 4: insertBeforeLastNode(&l);
            break;
            case 5: display(&l);
            break;
            case 6: delete(&l);
            break;
            case 7: deleteSpecificNode(&l);
            break;
        }
    }while(ch<=7);
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

void insertBeforeLastNode(node **l){
    node *ptr=NULL, *temp=NULL, *prev=NULL;
    ptr = (node*)malloc(sizeof(node));
    if(ptr!=NULL){
        int x;
        printf("Enter the value to insert: ");
        scanf("%d", &x);
        ptr->data=x;
        temp = *l;
        while(temp->next!=NULL){
            prev=temp;
            temp=temp->next;
        }
        prev->next = ptr;
        ptr->next = temp;
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

void deleteSpecificNode(node **l){
    node *temp = *l,*temp1 = *l, *prev=NULL;
    while(temp1!=NULL){
        printf("%d\t", temp1->data);
        temp1=temp1->next;
    }    
    int x;
    printf("\nEnter the node you want to delete: ");
    scanf("%d", &x);
    while(temp->data!=x){
        prev=temp;
        temp=temp->next;
    }
    prev->next = temp->next;
    free(temp);
    printf("Node deleted\n");
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