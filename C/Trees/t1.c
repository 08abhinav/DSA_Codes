#include<stdio.h>
#include<stdlib.h>
struct list{
    int data;
    struct list *prev
    struct list *next;
} typedef node;

void insert(node **, node **, node **);
void displayRoot(node **);

int main(){
    node *l=NULL, *r=NULL, *root=NULL;
    int ch;
    do{
        printf("1.Insert\n2.Display\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: insert(&l, &r, &root);
            break;

            case 2: displayRoot(&root);
            break;
        }
    }while(ch<=2);
}