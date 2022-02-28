#!/bin/sh

name[0]="RAM"
name[1]="SYAM"
name[2]="KIIT"
name[3]="SCE"
name[4]="SUBHASIS"
echo Display the array: ${name[@]}
echo count the length of the array 1st method: ${#name[@]}
echo count the length of the array 2nd method: ${#name[*]}
echo count the length of 2nd index element of the array : ${#name[2]}
