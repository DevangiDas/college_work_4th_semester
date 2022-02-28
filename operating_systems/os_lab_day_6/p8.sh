#!/bin/sh

i=0
echo Enter 10 elements of an array
while [ $i -lt 10 ]
do
read arr[$i]
i=`expr $i + 1`
done
i=0
echo Display all the elements of an array
while [ $i -lt 10 ]
do
echo ${arr[$i]}
i=`expr $i + 1`
done
