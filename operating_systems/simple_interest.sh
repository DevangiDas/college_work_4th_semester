#!/bin/sh
echo Enter the amount:
read amount
echo Enter interest rate:
read rate
echo Enter time period:
read time
simple_interest=`echo $amount \* $rate \* $time \* 0.01|bc`
echo "The simple interest is $simple_interest"
