// reversing a doubly linked list

#include<stdio.h>
#include<stdlib.h>

typedef struct list{
    struct list* pre;
    int data;
    struct list* next;
}node;

node* insert(node*);
void display(node *);

int main(){
    node *h = NULL, *r=NULL;
    do{
        printf("1.Insert\n2.Display\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: r = insert(r);
            if(l==NULL){
                l = r;
            }
            break;

            case 2: display(r);
            break;
        }
    }while(ch>=1 && ch<=2);
}

node* insert(node *r){
    node *ptr = NULL;
    int x;
    ptr = (node*)malloc(sizeof(node));
    if(ptr){
        printf("Enter the value to insert: ");
        scanf("%d", &x);
        ptr->data = x;
        ptr->prev = NULL;
        ptr->next = NULL;
        if(r==NULL){
            r = ptr;
            return r;
        }else{
            ptr->prev = r;
            r->next  = ptr;
            r = ptr;
        }
    }else{
        printf("Memory not allocated\n");
    }
    return r;
}

void display(node *l){
    if(l==NULL){
        printf("List is empty\n");
        return;
    }else{
        node *temp = l;
        while(temp!=NULL){
            printf("%d"\t, temp->data);
            temp = temp->next;
        }
        printf("\n");
    }
}
