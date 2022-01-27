#!/bin/sh
echo "finding area of triangle"
echo enter the height of triangle:
read h
echo enter the base of triangle:
read b
area1=`echo $h \* $b \* 0.5|bc`
echo "The Area of triagle is : $area1"
echo "finding area of rectangle"
echo enter the length of rectangle:
read len
echo enter the breadth of rectangle:
read br
area2=`echo $len \* $br|bc`
echo "The Area of rectagle is : $area2"
echo "finding the area of circle"
echo Enter the radius:
read rad
area3=`echo $rad \* $rad \* 3.14|bc`
echo "The Area of circle is $area3"
