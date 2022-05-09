#include <stdio.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
#include<stdlib.h>
int main()
{
    for(int i=0;i<3;i++) // loop will run n times (n=3)
    {
        if(fork() == 0)
        {
            printf("[child process] pid %d from [parent] pid %d\n",getpid(),getppid());
            exit(0);
        }
    }      
}
