#include<stdio.h>

struct node
{
    int process, at, bt, rt, fwt,wt, ct, tat,pt;
};


int main()
{
    int n,total=0,i,count=0,small;
    float total_WT=0,total_TAT=0,Avg_WT,Avg_TAT;
    printf("\nEnter the number of total processess : ");
    scanf("%d",&n);
    struct node temp_node[n];
    int temp[n],temp1[n];
    for(i=0;i<n;i++)
    {
        temp_node[i].process=i+1;
        printf("\nEnter Arrival time of process %d :",i+1);
        scanf("%d",&temp_node[i].at);
        printf("\nBurst time of process %d :",i+1);
        scanf("%d",&temp_node[i].bt);
        temp_node[i].ct=0;
        temp_node[i].tat=0;
        temp_node[i].wt=0;temp_node[i].fwt=0;
        temp[i]=temp_node[i].bt;
        temp1[i]=temp_node[i].bt;
    }


    // we initialize the burst time
    // of a process with maximum
    temp_node[n-1].wt=-1;
    printf("\n process execution order :");
    for(total=0;count!=n;total++)
    {
        small=n-1;
        for(i=0;i<n;i++)
        {
            if( temp_node[i].at<=total && temp_node[i].bt>0&&temp_node[i].wt>=temp_node[small].wt)
            {
                if(temp_node[i].wt==temp_node[small].wt && temp_node[i].bt>=temp_node[small].bt){
                    if(temp_node[i].wt==temp_node[small].wt && temp_node[i].bt>temp_node[small].bt){
                        small=i;
                        temp_node[i].wt=0;
                    }
                    else if(temp_node[i].wt==temp_node[small].wt && temp_node[i].bt==temp_node[small].bt&&temp_node[i].at<temp_node[small].at){
                        small=i;
                        temp_node[i].wt=0;
                    }

                }
                else if(temp_node[i].wt>temp_node[small].wt ){
                    small=i;
                    temp_node[small].wt=0;
                }
            }
        }
        printf("P%d : ",small+1);
        temp_node[small].bt=temp_node[small].bt-1;
        for(int j=0;j<n;j++)
        {
            if(j!=small&&temp_node[j].at<=total&&temp_node[j].bt>0)
            {
                temp_node[j].wt=temp_node[j].wt+1;
            }
        }
        // if any process is completed
        if(temp_node[small].bt==0)
        {
            // one process is completed
            // so count increases by 1
            count++;
            temp_node[small].fwt=total+1-temp_node[small].at-temp[small];
            temp_node[small].tat=total+1-temp_node[small].at;

            // total calculation
            total_WT=total_WT+temp_node[small].fwt;
            total_TAT=total_TAT+temp_node[small].tat;

        }

    }

    Avg_WT=total_WT/n;
    Avg_TAT=total_TAT/n;
    for( i=0;i<n;i++){

        temp_node[i].ct=temp_node[i].at+temp_node[i].tat;
        temp_node[i].bt=temp1[i];
    }
    // printing of outputs
    printf("\n\n\n\n");
    printf("\nProcess no\tAT\tBT\tCT\tTAT\tWaiting_time\n");
    for(i=0;i<n;i++)
    {
        printf("\nprocess[%d]\t%d\t %d\t %d\t %d\t\t%d\n",temp_node[i].process,temp_node[i].at,temp_node[i].bt,temp_node[i].ct,temp_node[i].tat,temp_node[i].fwt);
    }
    printf("Average waiting time is : %f\n",Avg_WT);
    printf("Average turn around time is : %f\n",Avg_TAT);
    return 0;
}
