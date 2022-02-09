#!/bin/sh

<<longcomment
A menu based shell program that will carry out the
following file management operations based on the
specified choice value.
1 - List files,
2 - Create directory,
3 – Change directory,
4 – Remove directory,
5 -Create file,
6 – Copy file,
7 – remove file.
longcomment

echo Enter your choice according to the menu given:
echo 1 - List files,
echo 2 - Create directory,
echo 3 – Change directory,
echo 4 – Remove directory,
echo 5 -Create file,
echo 6 – Copy file,
echo 7 – remove file.
read choice
case $choice in
1) ls;;
2) mkdir one_dir;;
3) cd ;;
4) rm -rf one_dir;;
5) cat > a_file.txt;;
6) cp f1.txt f2.txt;;
7) rm f1.txt;;
*) echo wrong choice;;
esac
