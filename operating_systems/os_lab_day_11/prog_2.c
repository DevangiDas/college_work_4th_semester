#include <stdio.h>
int main()
{
    int at[100], bt[100], pt[100], wt[100], tat[100];
    int n, temp[10], t, count = 0, t_in;
    printf("Enter the number of the process : \n");
    scanf("%d", &n);
    printf("Enter the arrival time of the process : \n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &at[i]);
    }
    printf("Enter the burst time of the process : \n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &bt[i]);
        temp[i] = bt[i];
    }
    printf("Enter the priority of the process : \n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &pt[i]);
    }
    for (t = 0; count != n; t++)
    {
        t_in = 0;
        for (int i = 0; i < n; i++)
        {
            if (pt[t_in] < pt[i] && at[i] <= t && bt[i] > 0)
            {
                t_in = i;
            }
        }
        bt[t_in] = bt[t_in] - 1;
        // if any process is completed
        if (bt[t_in] == 0)
        {
            // one process is completed
            // so count increases by 1
            count++;
            wt[t_in] = t + 1 - at[t_in] - temp[t_in];
            tat[t_in] = t + 1 - at[t_in];
        }
    }
    // printing of the answer
    printf("Process Priority Arrival-time(s) Burst-time(s) Completiontime(s) Waiting-time(s) Turnaround-time(s)\n");
    for (int i = 0; i < n; i++)
    {
printf("P%d %d %d %d %d %d %d\n",i,pt[i],at[i],temp[i],at[i]+tat[i],wt[i],tat[i]);
    }
    return 0;
}