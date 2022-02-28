#!/bin/sh

<<cmt
Write a shell program to show the process hierarchy of a
specified process till the parent process whose process 
id is 1.
cmt

echo Enter the process id:
read ps_id
while [ $ps_id != 0 ]
do
ps -f $ps_id | tail -1 
new_id=`ps -f $ps_id | tail -1 | tr -s " " | cut -d " " -f3`
echo $new_id
ps_id=$new_id
done	



