#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/types.h>
#include<string.h>
#include<sys/wait.h>
  
int main()
{
    int fd1[2];  // Used to store two ends of first pipe. First pipe to send input string from parent
    int fd2[2];  // Used to store two ends of second pipe. Second pipe to send input string from child
  
    char input_str[100];
    char recv_str[100];
    int pid;
  
    if (pipe(fd1)==-1)
    {
        printf("Pipe creation failed\n");
        return 1;
    }
    if (pipe(fd2)==-1)
    {
        printf("Pipe creation failed\n");
        return 1;
    }
    pid = fork();
  
    if (pid < 0)
    {
        printf("fork Failed\n");
        return 1;
    }
  
    // Parent process
    else if (pid > 0)
    {
        close(fd1[0]); // Close reading end of first pipe
        close(fd2[1]); // Close writing end of second pipe
  
		printf("Enter the message to send to Child");
		scanf("%s", input_str);

        // Write input string and close writing end of first pipe.
        printf("Parent process sending the message to child process: %s\n",input_str);
        write(fd1[1], input_str, strlen(input_str)+1);
        close(fd1[1]);
  
        // Wait for child to send a string
        //wait(NULL);
  
  
        // Read string from child, print it and close
        // reading end.
        read(fd2[0], recv_str, sizeof(recv_str));
        printf("Parent process received the message from the child process: %s\n",recv_str);
        close(fd2[0]);
    }
  
    // child process
    else
    {
        close(fd1[1]);  // Close writing end of first pipe
  
        // Read a string using first pipe
        read(fd1[0], recv_str, sizeof(recv_str));
        printf("Child process received the message from the parent process: %s\n",recv_str);
  
        // Close both reading ends
        close(fd1[0]);
        close(fd2[0]);
  
		printf("Enter the message to send to Parent");
		scanf("%s", input_str);

        // Write concatenated string and close writing end
        printf("Child process sending the message to the parent process: %s\n",input_str);
        write(fd2[1], input_str, strlen(input_str)+1);
        close(fd2[1]);
  
        exit(0);
    }
}