/*Implementing Graph using array of pointer and performing Depth-first search algo
-> Depth-First search will tell if there is any possible path between the source and the destination.
*/
#include <stdio.h>
#include <stdlib.h>

struct edg {
    int src;
    int dest;
    int weight;
    struct edg* next;
} typedef edge;

void createGraph(edge**, int);
void displayGraph(edge**, int);
void dfsHelper(edge**, int*, int);
void DFS(edge**, int, int);

int main() {
    int vertices, ch;
    printf("Enter the number of vertices: ");
    scanf("%d", &vertices);
    edge* graph[vertices];
    for (int i = 0; i < vertices; i++) {
        graph[i] = NULL;
    }
    do {
        printf("\n1. Create Graph\n2. Display Graph\n3. DFS\n0. Exit\nEnter your choice: ");
        scanf("%d", &ch);
        switch (ch) {
            case 1:
                createGraph(graph, vertices);
                break;
            case 2:
                displayGraph(graph, vertices);
                break;
            case 3: {
                int start;
                printf("Enter the starting node: ");
                scanf("%d", &start);
                if (start >= 0 && start < vertices) {
                    DFS(graph, vertices, start);
                } else {
                    printf("Invalid starting node!\n");
                }
                break;
            }
            case 0:
                printf("Exiting...\n");
                break;
            default:
                printf("Invalid choice! Please enter 0, 1, 2, or 3.\n");
                break;
        }
    } while (ch != 0);

    // Optional: Free the graph memory before exiting
    for (int i = 0; i < vertices; i++) {
        edge* temp = graph[i];
        while (temp) {
            edge* next = temp->next;
            free(temp);
            temp = next;
        }
    }
    return 0;
}

void createGraph(edge** graph, int vertices) {
    int c, src, dest, weight;
    do {
        printf("Enter source node (0 to %d): ", vertices - 1);
        scanf("%d", &src);
        printf("Enter destination node (0 to %d): ", vertices - 1);
        scanf("%d", &dest);
        printf("Enter weight of edge: ");
        scanf("%d", &weight);

        if (src < 0 || src >= vertices || dest < 0 || dest >= vertices) {
            printf("Invalid source or destination node! Must be between 0 and %d.\n", vertices - 1);
            continue;
        }

        edge* newEdge = (edge*)malloc(sizeof(edge));
        if (!newEdge) {
            printf("Memory allocation failed!\n");
            return;
        }
        newEdge->src = src;
        newEdge->dest = dest;
        newEdge->weight = weight;
        newEdge->next = graph[src];
        graph[src] = newEdge;

        printf("Do you want to insert more edges (1/0): ");
        scanf("%d", &c);
    } while (c == 1);
}

void displayGraph(edge** graph, int vertices) {
    for (int i = 0; i < vertices; i++) {
        printf("Vertex %d", i);
        edge* temp = graph[i];
        while (temp != NULL) {
            printf(" -> (%d, weight: %d)", temp->dest, temp->weight);
            temp = temp->next;
        }
        printf("\n");
    }
}

void dfsHelper(edge** graph, int* visited, int vertex) {
    printf("%d ", vertex);
    visited[vertex] = 1;

    edge* temp = graph[vertex];
    while (temp) {
        if (!visited[temp->dest]) {
            dfsHelper(graph, visited, temp->dest);
        }
        temp = temp->next;
    }
}

void DFS(edge** graph, int vertices, int start) {
    int* visited = (int*)calloc(vertices, sizeof(int));
    if (!visited) {
        printf("Memory allocation failed!\n");
        return;
    }
    printf("DFS traversal starting from vertex %d: ", start);
    dfsHelper(graph, visited, start);
    printf("\n");
    free(visited);
}