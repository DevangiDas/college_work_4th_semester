#!/bin/sh

name[0]="RAM"
name[1]="SYAM"
name[2]="KIIT"
name[3]="SCE"
name[4]="SUBHASIS"
echo first method of print arry: ${name[*]}
echo Second method of print array: ${name[@]}
echo third method of print array: ${name[@]:1}
echo forth method of print array: ${name[4]:1}
echo fifth method of print array: ${name[@]:1:3}
