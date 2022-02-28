#!/bin/sh
#Write a shell program to find whether a given year is a leap year or not.

echo "Enter year"
read yrs
year=$yrs
yr=$yrs
yrs=$(($yrs%400))
yr=$(($yrs%100))
yr_4=$(($yrs%4))
if [ $yrs -eq 0 ]
then 
echo "$year is a leap year"
elif [ $yr -eq 0 ]
then 
echo "$year is not a leap year"
elif [ $yr_4 -eq 0 ]
then 
echo "$year is a leap year"
else 
echo "$year is not a leap year"
fi
