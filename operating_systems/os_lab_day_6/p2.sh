#!/bin/sh


echo -n Enter the process ID
read pid
cnt=`ps -ef --no-headers |wc -l`
ps -ef --no-headers>file.txt

i=0
while [ $i -lt $cnt ]
do
pid1=`cat file.txt | head -$i | tail -1 | tr -s " " | cut -d " " -f2`
if [ $pid -eq $pid1 ] 
then
ppid=`cat file.txt | head -$i | tail -1 | tr -s " " | cut -d " " -f3`
pid=$ppid
cat file.txt | head -$i | tail -1
i=1
fi
i=`expr $i + 1`
done
