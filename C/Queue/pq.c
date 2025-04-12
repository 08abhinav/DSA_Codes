#include<stdio.h>
#include<stdlib.h>

typedef struct list{
    int data, p;
    struct list *next;
}pq;

void insert(pq **, pq **);
void display(pq *);

int main(){
    pq *l = NULL, * r=NULL;
    int ch;
    do{
        printf("1.Insert\n2.Display\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: insert(&l, &r);
            break;

            case 2: display(l);
            break;
        }
    }while(ch<=2);
}

void insert(pq **l, pq **r){
    pq *ptr = NULL;
    ptr = (pq *)malloc(sizeof(pq));
    if(ptr==NULL){
        printf("Memory not allocated\n");
        return;
    }
    else{
        int data, p;
        printf("Enter the data: ");
        scanf("%d", &data);
        printf("Enter the priority(1, 2, and 3): ");
        scanf("%d", &p);

        ptr->data = data;
        ptr->p = p;
        ptr->next = NULL;

        if(*l==NULL && *r==NULL){
            *l = *r = ptr;
        }
        else if(ptr->p <= (*l)->p){
            ptr->next = *l;
            *l = ptr;
        }
        else if(ptr->p >= (*r)->p){
            (*r)->next = ptr;
            *r = ptr;
        }else{
            pq *current = *l;
            while (current->next != NULL && current->next->p <= p) {
                 current = current->next;
            }
            ptr->next = current->next;
            current->next = ptr;
        }
    }
}

void display(pq *l){
    pq *temp = l;
    if(temp == NULL){
        printf("Queue is empty\n");
    }else{
        while(temp!=NULL){
            printf("%d\t", temp->data);
            temp = temp->next;
        }
        printf("\n");
    }
}