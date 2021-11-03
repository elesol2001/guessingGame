#!/bin/bash
echo Eleni Solomon-Samuelsson
mkdir Eleni_Solomon-Samuelsson_labb
cp *.java Eleni_Solomon-Samuelsson_labb
cd Eleni_Solomon-Samuelsson_labb
pwd
echo Compiling
javac *.java
echo Running Game
java GuessingGame
echo Done
rm *.class
ls

