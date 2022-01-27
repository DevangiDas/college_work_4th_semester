#!/bin/sh
echo Enter 1st number:
read a
echo Enter 2nd number:
read b
echo The 1st number before swap is $a
echo The 2nd number before swap is $b
a=`echo $a + $b|bc`
b=`echo $ - $b|bc`
a=`echo $a - $b|bc`
echo The 1st number after swap is $a
echo The 2nd number after swap is $b
