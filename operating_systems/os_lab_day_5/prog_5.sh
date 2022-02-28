#!/bin/sh

<<cmt
Write a shell program to display the name
and count of all executable files in the
given directory.
cmt

echo Enter the directory to check:
read dir
count=0
cd $dir
for var in *.exe
do
echo the value of the variable is $var
done

