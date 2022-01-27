#!/bin/sh
echo Enter 1st number:
read num1
echo Enter 2nd number that should be smaller than 1st number:
read num2
echo The 1st number before swap is $num1
echo The 2nd number before swap is $num2
num1=`echo $num1 + $num2|bc`
num2=`echo $num1 - $num2|bc`
num1=`echo $num1 - $num2|bc`
echo The 1st number after swap is $num1
echo The 2nd number after swap is $num2
