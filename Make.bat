@echo off

set program_prefix=[MAKE]

javac Main.java
:start
set /p lesson_n=%program_prefix% Write lesson number: 
set/p task_n=%program_prefix% Write task number: 

:run_task
javac Lesson%lesson_n%\Task%task_n%.java
if %ERRORLEVEL% equ 0 (
	java Main "%lesson_n%" "%task_n%"
)

set /p task_again=%program_prefix% Run task again?[y/n] 
if %task_again% equ y (
	call :run_task
)
set /p program_again=%program_prefix% Run programm again?[y/n] 
if %program_again% equ y (
	call :start
) else (
	call :end
)

:end
pause
exit