@echo off

set program_prefix=[MAKE]

javac Main.java

:start
set /p lesson_n=%program_prefix% Write lesson number: 
set /p task_n=%program_prefix% Write task number: 

if exist Lesson%lesson_n%\Task%task_n%.java (
	call :run_task
) else (
	if not exist Lesson%lesson_n% md Lesson%lesson_n%
	copy Task_template.java Lesson%lesson_n%\Task%task_n%.java
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