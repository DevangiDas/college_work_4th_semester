#!/bin/sh

#wap to print the pattern

row=4
for (( i=1; i<=row; i++ ))
do
	for (( j=1; j<=i; j++ ))
	do
		echo -n 1
	done
	echo
done
for (( i=row-1; i>=1; i-- ))
do
        for (( j=1; j<=i; j++ ))
        do
                echo -n 1
        done
        echo
done
