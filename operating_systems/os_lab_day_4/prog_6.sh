#!/bin/sh

<<longcomment
A shell program to fetch the data of a particular student (based on the row 
information, i.e., ex. The student present in the 3rd row of the file) from
a stored file. Then calculate and display his total mark and the aggregate 
percentage secured in a semester. The file contains student roll no, name,
and marks of five differ subjects in a semester.
longcomment

echo Enter the Row Number whose information is needed:
read num
echo $(head -$num students.txt| tail +$num)
m1=$(head -$num students.txt| tail +$num | cut -d, -f3 )
m2=$(head -$num students.txt| tail +$num | cut -d, -f4 )
m3=$(head -$num students.txt| tail +$num | cut -d, -f5 )
m4=$(head -$num students.txt| tail +$num | cut -d, -f6 )
m5=$(head -$num students.txt| tail +$num | cut -d, -f7 )
total_marks=`echo $m1 + $m2 + $m3 + $m4 + $m5|bc`
percentage=`echo $total_marks / 5.00|bc`
echo Total marks is $total_marks
echo Total percentage is $percentage
