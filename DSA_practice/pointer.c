#include<stdio.h>
int main()
{
    int x =10;
    {
        int x = 20;
        {
            int x = 1;
           
            printf("x");
        }
        printf("%d\n",x);
    }
    printf("%d\n",x);
}