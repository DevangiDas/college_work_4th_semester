#!/bin/sh

<<longcomment
A shell program to display the Date in “dd/mm/yyyy” format and the
time in “hour: minute: second AM/PM time zone” with a greeting message
like Good Morning, Good Evening etc. based on the current time.
longcomment


echo The date is: $(date +'%m/%d/%Y')
echo The time is: $(date +'%r')
time=$(date +'%H')
if test $time -lt '12'
then				
echo GOOD MORNING! $USER
elif test $time -eq '12'
then
echo GOOD AFTERNOON! $USER
elif test $time -gt '12' -a $time -lt '16'
then 
echo GOOD AFTERNOON! $USER
elif test $time -eq '16'
then
echo GOOD AFTERNOON! $USER
elif test $time -gt '16' -a $time -lt '20'
then
echo GOOD EVENING! $USER
else
echo GOOD NIGHT! $USER
fi
