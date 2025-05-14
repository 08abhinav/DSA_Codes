#include<stdio.h>
#include<stdlib.h>

struct node{
    char c;
    struct node* link;
    struct edge* s; 
}typedef vertex;

struct ed{
    vertex* data;
    struct ed* edg;
}typedef edge;

void insert(vertex *);

int main(){
    vertex*head = NULL;
    int ch;
    do{
        printf("1.Insert vertex\n2.Create Link\n3.Display\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: insert(head);
        }
    }
}