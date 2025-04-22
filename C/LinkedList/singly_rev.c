//Reversing the singly linked list
#include<stdio.h>
#include<stdlib.h>

typedef struct list{
    int data;
    struct list *next;
}node;

node* insert(node *);
void display(node *);
void reverse(node *);

int main(){
    node *r=NULL, *h=NULL;
    int ch;
    do{
        printf("1.Insert\n2.Display\n3.Reverse\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: r = insert(r);
            if(h==NULL){
                h = r;
            }
            break;

            case 2: display(h);
            break;

            case 3: reverse(h);
            break;
        }
    }while(ch>=1 && ch<=3);
}


node* insert(node *r){
    node *ptr=NULL;
    int x;
    ptr = (node*)malloc(sizeof(node));
    if(ptr){
        printf("Enter the value to inser: ");
        scanf("%d", &x);
        ptr->data = x;
        ptr->next = NULL;

        if(r==NULL){
            r = ptr;
            return r;
        }else{
            r->next = ptr;
            r = ptr;
        }
    }else{
        printf("Memory not allocated\n");
    }
    return r;
}


void display(node *h){
    if(h==NULL){
        printf("List is empty\n");
        return;
    }else{
        node *temp = h;
        while(temp!=NULL){
            printf("%d\t", temp->data);
            temp = temp->next;
        }
        printf("\n");
    }
}

void reverse(node *h){
    if(h==NULL){
        printf("List is empty\n");
        return;
    }else{
        node *c=h, *next = NULL, *prev = NULL;

        while(c!=NULL){
            next = c->next;
            c->next = prev;
            prev = c;
            c = next;
        }
        h = prev;

        node *temp = h;
        printf("List after reversing\n");
        while(temp!=NULL){
            printf("%d\t", temp->data);
            temp = temp->next;
        }
        printf("\n");
    }
}