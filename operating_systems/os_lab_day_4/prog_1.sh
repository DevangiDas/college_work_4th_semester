#!/bin/sh

#A shell program to check whether a given number is even or odd

echo Enter a number
read num1
remainder=`expr $num1 \% 2`
if  test $remainder -eq 0 
then
	echo The number is even
else
	echo The number is odd
fi
