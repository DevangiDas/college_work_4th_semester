#!/bin/sh

while :
do
echo "1-Input array and print in reverse order"
echo "2-Find element at given location"
echo "3-EXIT"
read -p "Enter youur choice: " choice
echo
case $choice in
1) echo "Enter 10 elements of an array"
   i=0
   while [ $i -lt 10 ]
   do
   read arr[$i]
   i=`expr $i + 1`
   done
   echo
   i=`expr $i - 1`
   while [ $i -ge 0 ]
   do
   echo "${arr[$i]}"
   i=`expr $i - 1`
   done
;;
2) read -p "Enter location: " loc
   echo "Element at given position: ${arr[$loc]}"
;;
3) exit
;;
*) echo "YOU ENTERED INVALID CHOICE PLS SELECT FROM [1-3] "
   echo
;;
esac
done
