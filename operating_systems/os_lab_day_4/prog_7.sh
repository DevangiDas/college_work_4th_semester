#!/bin/sh

<<longcomment
A shell program to take the input of two different file names
and check whether the file exists or not. If the file exists
then copy the content of the first file to second file and
also append the content of the second file to first file.
longcomment

echo Enter the 1st file"\'"s name:
read f1
echo Enter the 2nd file"\'"s name:
read f2
if test -e $f1 -a $f2
then
echo The files exists and contents can be copied
cat $f2 > ex.txt
cp $f1 $f2
cat ex.txt >>  $f1
echo File 1 after Appending with 2
cat $f1
echo file 2 after coping 1 in it
cat $f2
rm ex.txt
else
echo The file"(s)" does not exist
fi
