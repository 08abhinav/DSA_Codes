#include<stdio.h>
#include<stdlib.h>

typedef struct list{
    int data;
    struct list *next;
}node;

node* insert(node*);
node* mergeTwoSortedList(node*, node*);
void displayList1(node *);
void displayList2(node *);
void displayBoth(node*, node*);

int main(){
    node *r=NULL, *h=NULL;
    node *r2=NULL, *h2=NULL;
    int ch;
    do{
        printf("1.Insert in List1\n2.Insert in List2\n3.Display List1\n4.Display List2\n5.Display both\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: r = insert(r);
            if(h==NULL){
                h = r;
            }
            break;

            case 2: r2 = insert(r2);
            if(h2==NULL){
                h2 = r2;
            }
            break;

            case 3: displayList(h);
            break;

            case 4: displayList(h2);
            break;

            case 5: displayBoth(h, h2);
            break;
        }
    }while(ch>=1 && ch<=5);
}

// Insert into first list
node* insert(node *r){
    node *ptr=NULL;
    int x;
    ptr = (node*)malloc(sizeof(node));
    if(ptr){
        printf("Enter the value to inser: ");
        scanf("%d", &x);
        ptr->data = x;
        ptr->next = NULL;

        if(r==NULL){
            r = ptr;
        }else{
            r->next = ptr;
            r = ptr;
        }
    }else{
        printf("Memory not allocated\n");
    }
    return r;
}


// Merge two sorted lists
node* mergeTwoSortedList(node* h1, node* h2) {
    node dummy;
    node* tail = &dummy;
    dummy.next = NULL;

    while (h1 != NULL && h2 != NULL) {
        if (h1->data < h2->data) {
            tail->next = h1;
            h1 = h1->next;
        } else {
            tail->next = h2;
            h2 = h2->next;
        }
        tail = tail->next;
    }

    // Attach the remaining nodes
    tail->next = (h1 != NULL) ? h1 : h2;

    return dummy.next;
}

void displayList(node *h){
    if(h==NULL){
        printf("List is empty\n");
        return;
    }else{
        node *temp = h;
        printf("\n\t");
        while(temp!=NULL){
            printf("%d\t", temp->data);
            temp = temp->next;
        }
        printf("\n\n");
    }
}


// Dislay Both the list
void displayBoth(node *h1, node* h2){
    node*temp = h1;
    node2*temp2 = h2;
    if(h1 && h2){
        printf("List1 Elements\n");
        while(temp!=NULL){
            printf("\t%d\t", temp->data);
            temp = temp->next;
        }
        printf("\nList2 Elements\n");
        while(temp2 != NULL){
            printf("\t%d\t", temp2->data);
            temp2 = temp2->next;
        }
        printf("\n\n");
    }else{
        printf("list are empty\n");
    }
}