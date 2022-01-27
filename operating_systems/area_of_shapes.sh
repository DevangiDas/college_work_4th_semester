#!/bin/sh
echo "First finding area of triangle"
echo enter the height of triangle:
read height
echo enter the base of triangle:
read base
areat=`echo $height \* $base \* 0.5|bc`
echo "The Area of triagle is : $areat"
echo "Second finding area of rectangle"
echo enter the length of rectangle:
read length
echo enter the breadth of rectangle:
read breadth
arear=`echo $length \* $breadth|bc`
echo "The Area of rectagle is : $arear"
echo "finally finding the area of circle"
echo Enter the radius:
read radius
areac=`echo $radius \* $radius \* 3.14|bc`
echo "The Area of circle is $areac"
