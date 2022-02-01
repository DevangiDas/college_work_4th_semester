#!/bin/sh

#A shell program to check whether a given user is currently logged in or not

name="$USER"
echo Enter the name of the user to search
read user_curr
if test $user_curr = $name
then
echo The user is logged in
echo The Name of the user is $name
else
echo The user not logged in 
echo The Current user is $user_curr 
echo The logged in user is $name
fi
