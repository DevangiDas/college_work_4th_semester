#include <stdio.h> 
#include <sys/types.h> 
#include <unistd.h>
int main()
{
    printf("a \n");
  int a=getpid();
    fork();
  int b=getpid();
  printf("%d  \n",b);
}
