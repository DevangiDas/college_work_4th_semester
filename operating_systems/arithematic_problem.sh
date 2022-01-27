#!/bin/sh
echo Enter 1st number:
read a
echo Enter 2nd number that should be smaller than 1st number:
read b
add=`expr $a + $b`
sub=`expr $a - $b`
multiply=`expr $a \* $b`
div=`expr $a / $b`
echo "Addition = $add"
echo "Subtraction = $sub"
echo "Multiplication = $multiply"
echo "Division = $div"

