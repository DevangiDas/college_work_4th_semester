#Write a shell program to display all 
#the child processes for a given parent process id.
#!/bin/sh

read -p "Enter process id:" p
ps --pid $p > clist.txt
echo "child processes of process id $p are:"
cat clist.txt | tr -s " " | cut -d " " -f2
rm clist.txt
