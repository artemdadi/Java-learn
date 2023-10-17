@echo off
javac ServerTCP.java
javac ClientTCP.java
javac DateMessage.java

start java ClientTCP
start java ClientTCP
java ServerTCP

pause


