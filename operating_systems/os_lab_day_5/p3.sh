a=0
until [ ! $a -lt 10 ]
do
echo -n value of a is $a 
a=`expr $a + 1`
done
