#include<stdio.h>
#include<stdlib.h>

typedef struct list{
    int data;
    struct list *next;
}node, node2, node3;

node* insert(node*);
node2* insertInSec(node*);
node3* mergeList(node*, node2*);
void displayList1(node *);
void displayList2(node *);
void displayBoth(node*, node2*);

int main(){
    node *r=NULL, *h=NULL;
    node2 *r2=NULL, *h2=NULL;
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

            case 2: r2 = insertInSec(r2);
            if(h2==NULL){
                h2 = r2;
            }
            break;

            case 3: displayList1(h);
            break;

            case 4: displayList2(h2);
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


// Insert into second list
node2* insertInSec(node2 *r){
    node2 *ptr=NULL;
    int x;
    ptr = (node2*)malloc(sizeof(node2));
    if(ptr){
        printf("Enter the value to insert: ");
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



// Display list 1
void displayList1(node *h){
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

// Display List 2
void displayList2(node *h){
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
void displayBoth(node *h1, node2* h2){
    node*temp = h1;
    node2*temp2 = h2;
    if(h1 || h2){
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
    }
}