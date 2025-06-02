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
void displayGraph(vertex*);

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

            case 3: displayGraph(head);
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

void insertEdge(vertex* head, int from, int to, int weight){
    vertex* src = findVertex(head, from);
    vertex* dest = findVertex(head, to);

    if(src == NULL || dest == NULL){
        printf("Source or destination nodes are not present in graph\n");
        return;
    }
    edge* newEdge = (edge*)malloc(sizeof(edge));
    newEdge->weight = weight;
    newEdge->dest = dest;
    newEdge->next = NULL;

    if(src->edgList == NULL){
        src->edgList = newEdge;
    }else{
        edge* temp = src->edgList;
        while(temp->next != NULL){
            temp = temp->next;
        }
        temp->next = newEdge;
    }
    printf("\t\tEdge added successfully\n");
}

/* This method will find the source and the destination node if they are prsent in graph or not.
if yes it will return the node and if not it will return the null.
*/
vertex* findVertex(vertex* head, int val){
    vertex* ptr = head;
    while(ptr != NULL){
        if(ptr->data == val){
            return ptr;
        }
        ptr = ptr->link;
    }
    return NULL;
}

void displayGraph(vertex *head){
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
