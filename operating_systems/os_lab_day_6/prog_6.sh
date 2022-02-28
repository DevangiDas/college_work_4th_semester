#!/bin/sh

cat $1 >> $3
cat $2 >> $3
echo "Contents of $3 this : "
cat $3
