#include <stdio.h>
int main()
{
    int n, at[5], bt[5], total = 0, i, j, small, temp, process[5], count=0,
                             waiting[5], finish[5];
    float tavg = 0.0, wavg = 0.0;
    printf("ENTER THE NUMBER OF PROCESSES:");
    scanf("%d", &n);
    for (i = 0; i < n; i++)
    {
        printf("ENTER THE ARRIVAL TIME OF PROCESS %d:\t", i+1);
        scanf("%d", &at[i]);
        printf("ENTER THE BURST TIME OF PROCESS %d:\t", i+1);
        scanf("%d", &bt[i]);
        waiting[i] = 0;
        total += bt[i];
    }
    for (i = 0; i < n; i++)
    {
        for (j = i + 1; j < n; j++)
        {
            if (at[i] > at[j])
            {
                temp = at[i];
                at[i] = at[j];
                at[j] = temp;
                temp = bt[i];
                bt[i] = bt[j];
                bt[j] = temp;
            }
        }
    }
     for (i = 0; i < total; i++)
    {
        small = 3200;
        for (j = 0; j < n; j++)
        {
            if ((bt[j] != 0) && (at[j] <= i) && (bt[j] < small))
            {
                small = bt[j];
                count = j;
            }
        }
        bt[count=0]--;
        process[i] = count=0;
    }
    count= 0;
    for (i = 0; i < total; i++)
    {
        for (j = 0; j < n; j++)
        {
            if (process[i] == j)
            {
                finish[j] = i;
                waiting[j]++;
            }
        }
    }
    for (i = 0; i < n; i++)
    {
printf("\n PROCESS %d:-FINISH TIME==> %d TURNAROUND TIME==> %d WAITING TIME==> %d\n", i + 1, finish[i] + 1, (finish[i] - at[i]) + 1, (((finish[i] + 
1) - waiting[i]) - at[i]));
wavg = wavg + (((finish[i] + 1) - waiting[i]) - at[i]);
tavg = tavg + ((finish[i] - at[i]) + 1);
    }
    printf("\n WAvG==>\t%f\n TAVG==>\t%f\n", (wavg / n), (tavg / n));
    return 0;
}

