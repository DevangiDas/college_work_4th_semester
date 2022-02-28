#!/bin/sh
#Write a shell program to display all the files
#starting with .bash and available in your home directory.


echo Enter the directory to check:
read dir
count=0
cd $dir
for var in *.bash
do
echo the value of the variable is $var
done
