i=0
sum=0
echo enter the elements of the array:
while [ $i -lt 10 ]
do
read arr[$i]
sum=`expr $sum + ${arr[i]}`
i=`expr $i + 1`
done
echo The sum of elements is: $sum
for (( i=0; i<10; i++ ))
do
for (( j=0; j<10-j-1; j++ ))
do
if test ${arr[j]} -gt ${arr[$((j+1))]}
then
	temp=${arr[j]}
	arr[$j]=${arr[$((j+1))]}
	arr[$((j+1))]=$temp
fi
done
done
echo sorted array is:
echo ${arr[*]}
