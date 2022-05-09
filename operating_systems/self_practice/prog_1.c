#include<unistd.h>
#include<sys/types.h>
#include<stdio.h>
#include<sys/wait.h>


int main()
{
	pid_t c1,c2;
	printf("root process pid: %d\n ",getpid());
	for(int i=0;i<2;i++)
	{
		c1=fork();
		if(c1==0)
			{
				printf("child process with pid %d and ppid %d\n",getpid(),getppid());
				for(int j=0;j<1;j++)
				{
					c1=fork();
					if(c1==0)
					{
						 printf("child process with pid %d and ppid %d\n",getpid(),getppid());
					}
				}

			}
	}

	return 0;
}
