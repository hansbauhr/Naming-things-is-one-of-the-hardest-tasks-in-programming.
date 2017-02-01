#!/bin/bash

if [ ! -e cp.txt ]
then mvn dependency:build-classpath -Dmdep.outputFile=cp.txt
fi

cp=$(<cp.txt)
# echo $cp

java -classpath target/classes/:$cp no.vegvesen.ikt.skoleprosjekt.NumberOne $*

