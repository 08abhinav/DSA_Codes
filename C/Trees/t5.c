/*Traverse the tree without recursion, using stack traversing and counting the 
total number of nodes. */
#include<stdio.h>
#include<stdlib.h>

typedef struct list{
    struct list *left;
    int data;
    struct list *right;
}tree;

tree* insert(tree*);
int countNodes(tree*);
void display(tree*);

