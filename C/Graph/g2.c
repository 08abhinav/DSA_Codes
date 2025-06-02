#include<stdio.h>
#include<stdlib.h>

struct ver{
    int data;
    struct ver* next;
    struct ed* link;
}typedef vertex;

struct ed{
    vertex* data;
    ed* edg;
}typedef edge;

vertex* insertVertex(vertex*);
void display(vertex*, edge*);

int main(){
    vertex* head = NULL;
    edge* ed = NULL;
    int ch;
    do{
        printf("1.Enter vertex\n2.Enter edge\n3.Display graph\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: head = insertVertex(head);
            break;
        }
    }
}

vertex* insertVertex(vertex* head){
    vertex* temp = (vertex*)malloc(sizeof(vertex));
    if(temp){
        int x;
        printf("Enter the vertex: ");
        scanf("%d", &x);
        temp->data = x;
        temp->next = null; temp->link = null;
        if(head==NULL){
            head = temp;
        }else{
            vertex* ptr = head;
            while(ptr->link!=NULL){
                ptr = ptr->link;
            }
            ptr->link = temp;
        }
    }else{
        printf("Memory not allocated\n");
    }
    return head;
}