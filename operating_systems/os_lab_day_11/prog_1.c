#include <stdio.h>
int main()
{
    int n, ari[10], bur[10], total = 0, i, j, small, temp, process[5], count,
                             waiting[5], finish[5];
    float tavg = 0.0, wavg = 0.0;
    printf("ENTER THE NUMBER OF PROCESSES:");
    scanf("%d", &n);
    for (i = 0; i < n; i++)
    {
        printf("ENTER THE ARRIVAL TIME OF PROCESS %d:\t", i);
        scanf("%d", &ari[i]);
        printf("ENTER THE BURST TIME OF PROCESS %d:\t", i);
        scanf("%d", &bur[i]);
        waiting[i] = 0;
        total += bur[i];
    }
    for (i = 0; i < n; i++)
    {
        for (j = i + 1; j < n; j++)
        {
            if (ari[i] > ari[j])
            {
                temp = ari[i];
                ari[i] = ari[j];
                ari[j] = temp;
                temp = bur[i];
                bur[i] = bur[j];
                bur[j] = temp;
            }
        }
    }
    for (i = 0; i < total; i++)
    {
        small = 3200;
        for (j = 0; j < n; j++)
        {
            if ((bur[j] != 0) && (ari[j] <= i) && (bur[j] < small))
            {
                small = bur[j];
                count = j;
            }
        }
        bur[count]--;
        process[i] = count;
    }
    count = 0;
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
printf("\n PROCESS %d:-FINISH TIME==> %d TURNAROUND TIME==> %d WAITING TIME==> %d\n", i + 1, finish[i] + 1, (finish[i] - ari[i]) + 1, (((finish[i] + 
1) - waiting[i]) - ari[i]));
wavg = wavg + (((finish[i] + 1) - waiting[i]) - ari[i]);
tavg = tavg + ((finish[i] - ari[i]) + 1);
    }
    printf("\n WAvG==>\t%f\n TAVG==>\t%f\n", (wavg / n), (tavg / n));
    return 0;
}