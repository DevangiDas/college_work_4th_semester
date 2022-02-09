#!/bin/sh

<<LongComment
 shell program to enter the mark secured by a student in a particular subject
and Based on the grading system of our university finding and displaying the 
grade (i.e. from “O” to “F”) secured by the student in that subject.
LongComment

echo Enter the mark secured by a student:
read mark
if test $mark -ge 90 -a $mark -le 100
then
grade=O
elif test $mark -ge 80 -a $mark -lt 90
then 
grade=E
elif test $mark -ge 70 -a $mark -lt 80
then
grade=A
elif test $mark -ge 60 -a $mark -lt 70
then
grade=B
elif test $mark -ge 50 -a $mark -lt 60
then
grade=C
elif test $mark -ge 40 -a $mark -lt 50
then
grade=D
else 
grade=F
fi
echo The grade of the student is $grade

