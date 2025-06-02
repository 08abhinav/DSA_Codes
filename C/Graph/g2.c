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
    
}