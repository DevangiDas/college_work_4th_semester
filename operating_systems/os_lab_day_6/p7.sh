#!/bin/sh

name[0]="RAM"
name[1]="SYAM"
name[2]="KIIT"
name[3]="SCE"
name[4]="SUBHASIS"
echo Display the array: ${name[@]}
echo Delete the elements of an array
unset name[1]
echo Element on index 1 Deleted from the array: ${name[@]}
echo Delete the complete array
unset name
echo complete array deleted: ${name[@]}
