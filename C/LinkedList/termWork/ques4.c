#include <stdio.h>
#include <stdlib.h>

#define TIME_QUANTUM 10

typedef struct task {
    int pid;
    int burst_time;
    int remaining_time;
    int completion_time;
    int waiting_time;
    struct task* next;
} process;

process* createProcess(int, int);
process* insert(process*, int, int);
void calculate(process*);

int main() {
    int n, bt;
    Process* tail = NULL;

    printf("Enter number of processes: ");
    scanf("%d", &n);

    for (int i = 1; i <= n; i++) {
        printf("Enter burst time for process P%d: ", i);
        scanf("%d", &bt);
        tail = insert(tail, i, bt);
    }

    calculate(tail);

    return 0;
}


Process* createProcess(int id, int bt) {
    Process* newNode = (Process*)malloc(sizeof(Process));
    newNode->pid = id;
    newNode->burst_time = bt;
    newNode->remaining_time = bt;
    newNode->completion_time = 0;
    newNode->waiting_time = 0;
    newNode->next = NULL;
    return newNode;
}

Process* insert(Process* tail, int id, int bt) {
    Process* newNode = createProcess(id, bt);
    if (tail == NULL) {
        newNode->next = newNode;
        return newNode;
    } else {
        newNode->next = tail->next;
        tail->next = newNode;
        return newNode;
    }
}


void calculate(Process* tail) {
    int time = 0, completed = 0;
    int total_processes = 0;
    Process* ptr = tail->next;

    // Count total processes
    do {
        total_processes++;
        ptr = ptr->next;
    } while (ptr != tail->next);

    ptr = tail->next;

    while (completed < total_processes) {
        if (ptr->remaining_time > 0) {
            if (ptr->remaining_time > TIME_QUANTUM) {
                time += TIME_QUANTUM;
                ptr->remaining_time -= TIME_QUANTUM;
            } else {
                time += ptr->remaining_time;
                ptr->completion_time = time;
                ptr->waiting_time = time - ptr->burst_time;
                ptr->remaining_time = 0;
                completed++;
            }
        }
        ptr = ptr->next;
    }

    printf("\nPID\tBurst\tCompletion\tWaiting\n");
    ptr = tail->next;
    do {
        printf("P%d\t%d\t%d\t\t%d\n", ptr->pid, ptr->burst_time, ptr->completion_time, ptr->waiting_time);
        ptr = ptr->next;
    } while (ptr != tail->next);
}