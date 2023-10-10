@echo off

set program_prefix=[MAKE]

javac Main.java
javac PrintFile.java
javac CopyAndReplace.java

if %ERRORLEVEL% neq 0 (
	echo %program_prefix% Unable to compile Make files: Main.java Print_file.java
	call :end
)

:start
set /p lesson_n=%program_prefix% Write lesson number: 
java PrintFile "Lesson%lesson_n%\Tasks.txt"
set /p task_n=%program_prefix% Write task number: 

if exist Lesson%lesson_n%\Task%task_n%.java (
	call :run_task
) else (
	if not exist Lesson%lesson_n% md Lesson%lesson_n%
	java CopyAndReplace "Task_template.java" "Lesson%lesson_n%\Task%task_n%.java" "Lesson|Lesson%lesson_n%" "Task|Task%task_n%"
	echo %program_prefix% Complete task and press any key
	pause
)

:run_task
echo %program_prefix% Compiling Lesson%lesson_n%\Task%task_n%.java
javac Lesson%lesson_n%\Task%task_n%.java
if %ERRORLEVEL% equ 0 (
	echo %program_prefix% Running Lesson%lesson_n%\Task%task_n%.class
	java Main "%lesson_n%" "%task_n%"
)

set /p task_again=%program_prefix% Compile and run task again?[y/n] 
if %task_again% equ y (
	call :run_task
)
set /p program_again=%program_prefix% Choose other task(y) exit(n)?[y/n] 
if %program_again% equ y (
	call :start
) else (
	call :end
)

:end
pause
exit