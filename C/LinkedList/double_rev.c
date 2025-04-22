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
