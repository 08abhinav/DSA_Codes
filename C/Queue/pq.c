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

            case 2: insert(l);
            break;
        }
    }while(ch<=2);
}

