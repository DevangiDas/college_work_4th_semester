#!/bin/sh

#Write a shell program to recursively remove all
#the empty files from a given directory.




read -p "Enter the directory name:" dirname
for i in dirname
do
	`find $dirname -empty -delete`
	echo "empty files were deleted"
done


