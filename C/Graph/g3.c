/*Implementing Graph using array of pointer */
#include<stdio.h>
#include<stdlib.h>

struct edg{
    int src;
    int dest;
    int weight;
    struct edg* next;
}typedef edge;

void createGraph(edge**, int);
void displayGraph(edge**, int);

int main(){
    int vertices, ch;
    printf("Enter the number of vertices: ");
    scanf("%d", &vertices);
    edge* graph[vertices];
    for(int i=0;i<vertices;i++){
        graph[i] = NULL;
    }
    do{
        printf("1.Create Graph\n2.Display Graph\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: createGraph(graph, vertices);
            break;
        }
    }
}

void createGraph(edge** graph, int vertices){
    int ch, src, dest, weight;
    do{
        printf("Enter source node: ");
        scanf("%d", &src);
        
        printf("Enter destination node: ");
        scanf("%d", &dest);
        
        printf("Enter weight of node: ");
        scanf("%d", &weight);

        edge* newEdge = (edge*)malloc(sizeof(edge));
        newEdge->src = src;
        newEdge->dest = dest;
        newEdge->weight = weight;
        newEdge->next = graph[src];
        graph[src] = newEdge

        printf("Do you want to insert more nodes: ");
        scanf("%d", &ch);
    }while(ch==1);
}

void displayGraph(edge** graph, int vertices){
    if(*graph == NULL){
        printf("Graph is empty\n");
        return;
    }else{
        for(int i=0;i<vertices;i++){
            printf("Vertex: %d", i);
            edge* temp = graph[i];
            while(temp != NULL){
                printf("-> (%d, weight: %d)\n", temp->dest, temp->weight);
                temp = temp->next;
            }
        }
        printf("\n");
    }
}