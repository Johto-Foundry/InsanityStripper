@echo off
Title Project Insanity Client - Building...
Javac -Xlint:deprecation -Xlint:unchecked -classpath . -d bin src\*.java sign\*.java
pause