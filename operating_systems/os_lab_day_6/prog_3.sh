#!/bin/sh

while :
do
echo "1-to find the sum of any 10 consecutive prime numbers and store them in an array"
echo "2-to find the max and min among all elements the same array"
echo "3-EXIT"
echo "ENTER YOUR CHOICE IN NUMBERS GIVEN ABOVE TO PERFORM ANY OPERATION :"
read choice
echo " "
case $choice in
1)
read -p "Enter starting number : " start
count=0
sum=0
while [ $count -lt 10 ]
do
flag=0
for(( i=2 ; $i< $start ; i++ ))
do
div=`expr $start % $i `
if [ $div -eq 0 ]
then
flag=1
fi
done
if [ $flag -eq 0 ]
then
arr[$count]=$start
count=`expr $count + 1`
sum=`expr $start + $sum`
fi
start=`expr $start + 1`

done
echo "The array is : ${arr[@]}"
echo "The sum is : $sum"
;;
2)
echo Minimum element is ${arr[0]}

echo Maximum element is ${arr[-1]}
;;
3) exit
;;
*) echo "YOU ENTERED INVALID CHOICE PLS SELECT FROM [1-3] "
;;
esac
done
