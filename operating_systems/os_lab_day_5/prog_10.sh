#!/bin/sh

<<comment
Let a directory present in the home directory called “XYZ”
that consists of few files and directories. Write a shell
script to move all the files present in the “XYZ” directory
to a subdirectory called “MyFile” and all the subdirectories
present in the “XYZ” directory to a subdirectory called “MyDir”.
comment

cd xyz
mkdir Myfile
mkdir Mydir
mv *.txt Myfile
mv * Mydir
echo Moved 
