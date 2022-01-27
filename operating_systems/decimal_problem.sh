#!/bin/sh
echo Enter 1st number:
read a
echo Enter 2nd number that should be smaller than 1st number:
read b
add=`echo $a + $b|bc`
sub=`echo $a - $b|bc`
multiply=`echo $a \* $b|bc`
div=`ech $a / $b|bc`
echo "Addition = $add"
echo "Subtraction = $sub"
echo "Multiplication = $multiply"
echo "Division = $div"
