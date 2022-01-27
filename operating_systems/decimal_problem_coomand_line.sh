#!/bin/sh
add=`echo $1 + $2|bc`
sub=`echo $1 - $2|bc`
multiply=`echo $1 \* $2|bc`
div=`echo $1 / $2|bc`
echo "Addition = $add"
echo "Subtraction = $sub"
echo "Multiplication = $multiply"
echo "Division = $div"
