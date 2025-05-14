#include <stdio.h>
#include <stdlib.h>

struct node {
    char name;
    struct node* link;
    struct edge* s; 
} typedef vertex;

struct ed {
    vertex* data;
    struct ed* edg;
} typedef edge;

vertex* insert(vertex*);
void display(vertex*, edge*);

int main() {
    vertex* head = NULL;
    edge* s = NULL; 
    int ch;
    do {
        printf("\n1. Insert vertex\n2. Create Link\n3. Display\nEnter your choice: ");
        scanf("%d", &ch);
        getchar();  
        switch(ch) {
            case 1:
                head = insert(head); 
                break;
            case 2:
                display(head, s);
                break;
        }
    } while (ch < 3);
}

vertex* insert(vertex* head) {
    vertex* temp = (vertex*)malloc(sizeof(vertex));
    if (temp) {
        char name;
        printf("\n\tEnter the vertex: ");
        scanf(" %c", &name);  
        temp->name = name;
        temp->s = NULL;
        temp->link = NULL;
        if (head == NULL) {
            head = temp;
        } else {
            vertex* ptr = head;
            while (ptr->link != NULL) {
                ptr = ptr->link;
            }
            ptr->link = temp;
        }
    } else {
        printf("Memory not allocated\n");
    }
    return head;
}

