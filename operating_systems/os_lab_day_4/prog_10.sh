#!/bin/sh

<<longcomment
a shell program to take input of two different names
and display the same. Then check weather both the
names are same or different. 
longcomment

echo Enter the 1st name:
read name1
echo Enter the 2nd name:
read name2
echo The 1st name is: $name1
echo The 2nd name is: $name2
if test $name1 = $name2
then
echo Names are the same
else
echo Names are different
fi
