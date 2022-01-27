#!/bin/sh
echo Enter the amount:
read amt
echo Enter interest rate:
read rt
echo Enter time period:
read tm
si=`echo $amt \* $rt \* $tm \* 0.01|bc`
echo "The simple interest is $si"
