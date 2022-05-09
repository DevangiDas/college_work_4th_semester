#include<stdio.h>
#include<unistd.h>
#include <sys/types.h>
int main()
{
printf("Fork system call \n");  
  fork();
printf("Parent child process crreation \n");
  return 0;
} 
