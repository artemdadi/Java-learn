@echo off

javac RegistrationInfo.java
javac -cp ".;sqlite-jdbc-3.43.2.1.jar;slf4j-api-1.7.36.jar;" DbHandler.java
javac ConfServer.java
javac ConfServerImpl.java
javac ConfClient.java

start java ConfClient
java -cp ".;sqlite-jdbc-3.43.2.1.jar;slf4j-api-1.7.36.jar;" ConfServerImpl 

pause


