#include<stdio.h>
#include<stdlib.h>
#define EXIT_FAILURE 1
int main()
{
    int i, *pi;
    float f, *pf;
    if(!(pi = malloc(sizeof(int)))|| !(pf= malloc(sizeof(float))))
    {
        fprintf(stderr, "insufficient space");
        exit(EXIT_FAILURE);
    }
    *pi = 1024;
    *pf = 3.14;
    printf("an integer = %d , a float = %f\n", *pi, *pf);
    free(pi);
    free(pf);

}
