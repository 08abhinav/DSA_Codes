#include<stdio.h>
#include<stdlib.h>

typedef struct list{
    int data;
    struct list *next;
}queue;

queue* enqueue(node *);
queue* dequeue(node *);

int main(){
    queue *f=NULL, *r=NULL;
    int ch;
    do{
        printf("1.Insert\n2.Delete\n3.Display\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: r = enqueue(r);
            if(f==NULL){
                f=r;
            }
            break;

            case 2: f = dequeue(f);
            if(f>r){
                f=r=NULL;
            }
            break;
        }
    } 
}

node* enqueue(node *r){
    node *ptr=NULL;
    ptr = (node *)malloc(sizeof(node));
    if(ptr==NULL){
        printf("Memory not allocated\n");
    }else{
        int x;
        printf("Enter the value to insert: ");
        scanf("%d", &x);
        ptr->data = x;
        ptr->next = NULL;
        if(r==NULL){
            r = ptr;
        }else{
            r->next = ptr;
            r = ptr;
        }
    }
    return r;
}