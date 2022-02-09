#!/bin/sh

<<longcomment
a shell program to take the input of a file name and
check whether the file exists or not. If the file
exists then display the last column of every record
of the file (Assume that no. of columns in each record
of the file may vary) in ascending order.
longcomment


echo Enter the file name for search:
read f1
if test -e $f1 
then
echo The file Exists!
echo Displaying the last column:
cat $f1 | awk '{print $(NF)}'
else
echo File does not exist
fi

