@echo off
set /p lesson_n="Write lesson number: "
set /p task_n="Write task number: "
javac -d %CD% %lesson_n%\%task_n%.java
java program
pause