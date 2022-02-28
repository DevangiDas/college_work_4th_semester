#!/bin/sh

#Write a shell script to verify whether the given string is a palindrome or not.

read -p "Enter a string: " string
reverse=`echo $string | rev`
if [ $reverse = $string ]
then
    echo "Palindrome"
else
    echo "Not Palindrome"
fi  
