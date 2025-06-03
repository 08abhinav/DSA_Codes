/*Implementing Graph using array of pointer */
#include<stdio.h>
#include<stdlib.h>

struct edg{
    int src;
    int dest;
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
}