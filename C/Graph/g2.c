#include<stdio.h>
#include<stdlib.h>

struct ver{
    int data;
    struct ver* link;
    struct ed* edgList;
}typedef vertex;

struct ed{
    vertex* dest;
    int weight;
    struct ed* next;
}typedef edge;

vertex* insertVertex(vertex*);
vertex* findVertex(vertex*, int);
void insertEdge(vertex*, int, int, int);
void display(vertex*);

int main(){
    vertex* head = NULL;
    edge* ed = NULL;
    int ch, src, dest, weight;
    do{
        printf("1.Enter vertex\n2.Enter edge\n3.Display graph\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: head = insertVertex(head);
            break;

            case 2:
            printf("Enter the source node: ") ;
            scanf("%d", &src);
            printf("Enter the destination node: ");
            scanf("%d", &dest);
            printf("Enter the weight of the edge: ");
            scanf("%d", &weight);
            insertEdge(head, src, dest, weight);
            break;

            case 3: display(head);
            break;
        }
    }while(ch>=1 && ch<=3);
}

vertex* insertVertex(vertex* head){
    vertex* temp = (vertex*)malloc(sizeof(vertex));
    if(temp){
        int x;
        printf("Enter the vertex: ");
        scanf("%d", &x);
        temp->data = x;
        temp->link = NULL;
        temp->edgList = NULL; 
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



void display(vertex *head){
    vertex* temp = head;
    if(head==NULL){
        printf("Graph is empty\n");
        return;
    }
    while(temp != NULL){
        printf("%d", temp->data);
        edge* ed = temp->edgList;
        while(ed != NULL){
            printf("-> (%d: weight: %d)", ed->dest->data, ed->weight);
            ed = ed->next;
        }
        printf("\n");
        temp = temp->link;
    }
}
