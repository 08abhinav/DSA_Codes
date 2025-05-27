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
