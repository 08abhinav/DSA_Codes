#include<stdio.h>
#include<stdlib.h>

typedef struct list{
    int data;
    struct list *next;
}queue;

queue* enqueue(queue *);
queue* delete(queue *);
void display(queue *);

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

            case 2: f = delete(f);
            if(f>r){
                f=r=NULL;
            }
            break;

            case 3: display(f);
            break;
        }
    }while(ch>=1 && ch<=3);
}

queue* enqueue(queue *r){
    queue *ptr=NULL;
    ptr = (queue *)malloc(sizeof(queue));
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
        }
        r = ptr;
    }
    return r;
}

queue* delete(queue *f){
    if(f==NULL){
        printf("Queue is empty\n");
    }else{
        queue *temp = f;
        printf("Delete element: %d\n", temp->data);
        f = f->next;
        free(temp);
    }
    return f;
}

void display(queue *f){
    if(f==NULL){
        printf("Queue is empty\n");
    }else{
        queue *temp = f;
        while(temp!=NULL){
            printf("%d\t", temp->data);
            temp = temp->next;
        }
        printf("\n");
    }
}