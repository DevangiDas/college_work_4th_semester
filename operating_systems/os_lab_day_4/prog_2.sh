#!/bin/sh

#A shell program to find greatest and smallest among three given numbers using nested if


echo Enter a Number here:
read num1
echo Enter a Number here:
read num2
echo Enter a Number here:
read num3
if test $num1 -gt $num2 -a $num1 -gt $num3
then
echo greatest number is $num1
else
if test $num2 -gt $num1 -a $num2 -gt $num3 
then
echo greatest number is $num2
else
echo greatest number is $num3
fi
fi

