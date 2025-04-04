    #include<stdio.h>
    #include<stdlib.h>
    struct list{
        int data;
        struct list *prev
        struct list *next;
    } typedef node;

    void insert(node **, node **, node **);
    void displayRoot(node **);

    int main(){
        node *l=NULL, *r=NULL, *root=NULL;
        int ch;
        do{
            printf("1.Insert\n2.Display\nEnter your choice: ");
            scanf("%d", &ch);
            switch(ch){
                case 1: insert(&l, &r, &root);
                break;

                case 2: displayRoot(&root);
                break;
            }
        }while(ch<=2);
    }

    void insert(node **l, node **r, node **root){
        node *ptr = NULL;
        ptr = (node *)malloc(sizeof(node));
        if(!ptr){
            printf("Memory not allocated\n");
            return;
        }else{
            int x;
            printf("Enter the value: ");
            scanf("%d", &x);
            ptr->data = x;
            ptr->prev = NULL;
            ptr->next = NULL;
            if(*l==NULL && *r==NULL){
                *l = *r = *root = ptr;
            }else if(ptr->data > (*root)->data){
                (*r)->next = ptr;
                *r = ptr;
            }else{
                (*l)->next = ptr;
                *l = ptr;
            }
        }
    }