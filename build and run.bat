@echo off

set /p lesson_n="Write lesson number: "
set /p task_n="Write task number: "

javac -d %CD% %lesson_n%\%task_n%.java

:run
java program

set /p again="Run again?[y/n] "
if %again% equ y (
	call :run
) else (
	call :end
)

:end
pause
exit