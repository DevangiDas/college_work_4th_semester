#!/bin/sh

echo Parent id: $1
cnt=`ps -ef | grep -w $1 | wc -l`
ps -ef | grep -w $1>data.txt

i=1
while [ $i -lt $cnt ]
do
ppid=`cat data.txt | head -$i | tail -1 | tr -s " " | cut -d " " -f3`
if [ $ppid -eq $1 ]
then
cat data.txt | head -$i | tail -1
fi
i=`expr $i + 1`
done
