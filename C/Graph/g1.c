#include<stdio.h>
#include<stdlib.h>

struct node{
    char name;
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
            break;
        }
    }
}

void insert(vertex* head){
    vertex* temp = NULL;
    temp = (vertex*)malloc(sizeof(vertext));
    if(temp){
        char ch;
        printf("Enter the vertex: ");
        scanf("%c", &ch);
        temp->name = ch;
        temp->s = NULL;
        temp->next = NULL;
    }else{
        printf("Memory not allocated\n");
    }
}

