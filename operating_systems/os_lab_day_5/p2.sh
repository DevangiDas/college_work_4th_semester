a=0
while [ $a -lt 10 ]
do
b=$a
while [ $b -eq 0 ]
do
echo  $b
b=`expr $b - 1`
done
echo $a 
a=`expr $a + 1`
done
