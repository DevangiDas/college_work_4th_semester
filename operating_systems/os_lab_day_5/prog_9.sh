#!/bin/sh

<<longcomment
Execute the “ps -ef” and “ps -ux” command. Write a shell program that
takes the output of these two commands and display the detail about a
process whose parent id is 2. The detail about a process will be shown
as it is shown during the execution of “ps -ux” comman
longcomment

c=`ps -ef --no-headers | wc -l`
ps -ef --no-headers > ef1.txt
pid=2
while [ $pid -lt $c ]
do
var_1=`cat ef1.txt | head -$pid | tail -1 | tr -s "" | cut -d "" -f2`
echo $var_1
if test "$var_1" = 2
then
var_2=`cat ef1.txt | head -$pid | tail -1 | tr -s "" | cut -d "" -f2`
echo $var_2
cat ef1.txt | head -$pid | tail -1
fi
pid=`expr $pid + 1`
done

