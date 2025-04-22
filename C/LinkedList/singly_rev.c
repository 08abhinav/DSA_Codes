//Reversing the singly linked list
#include<stdio.h>
#include<stdlib.h>

typedef struct list{
    int data;
    struct list *next;
}node;

node* insert(node *);
void display(node *);
void reverse(node *);

