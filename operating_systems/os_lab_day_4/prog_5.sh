#!/bin/sh

#A shell program to display the Date in “dd/mm/yyyy” format and the time in “hour: minute: second AM/PM time zone” with a greeting message like Good Morning, Good Evening etc. based on the current time.

echo The date is: $(date +'%m/%d/%Y')
echo The time is: $(date +'%r')
if test $(date +'%X') < '12:00:00' -a $(date +'%X') > '00:00:00'
then
echo GOOD MORNING! $USER
elif test $(date +'%X') = '12:00:00'
then
echo GOOD AFTERNOON! $USER
elif test $(date +'%X') > '12:00:00' -a $(date +'%X') < '16:00:00'
then 
echo GOOD AFTERNOON! $USER
elif test $(date +'%X') = '16:00:00'
then
echo GOOD AFTERNOON! $USER
elif test $(date +'%X') > '16:00:00' -a $(date +'%X') < '20:00:00'
then
echo GOOD EVENING! $USER
else
echo GOOD NIGHT! $USER
fi
