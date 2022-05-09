#include <stdio.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
#include<stdlib.h>
int main()
{
    for(int i=0;i<3;i++) // loop will run n times (n=3)
    {
	    int ret=fork();
        if(ret>0)
        {
            printf("[child process] pid %d ",getpid());
            break;
        }
	printf("[parent process] pid %d\n",getppid());
    }
    return 0;
}
