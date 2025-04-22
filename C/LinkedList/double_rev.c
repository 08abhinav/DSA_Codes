// reversing a doubly linked list

#include<stdio.h>
#include<stdlib.h>

typedef struct list{
    struct list* pre;
    int data;
    struct list* next;
}node;


