echo off
set workingDir=%cd%
set desktop="%userprofile%\Desktop"
echo.

echo #--------------------------------#
echo ^| Starting maven automated setup ^|
echo #--------------------------------#

cd %desktop%
if not exist "%desktop%\hangman" ( 
    mkdir "hangman"
    cd "%desktop%\hangman"
) else ( cd "%desktop%\hangman" )

if exist README.md ( del README.md )
if exist start.cmd ( del start.cmd )
if exist hangman.jar ( del hangman.jar )
if exist hangman-1-jar-with-dependencies.jar ( del hangman-1-jar-with-dependencies.jar )

copy "%workingDir%\README.md" "%desktop%\hangman" >NUL
copy "%workingDir%\src\main\resources\start.cmd" "%desktop%\hangman" >NUL
copy "%workingDir%\target\hangman-1-jar-with-dependencies.jar" "%desktop%\hangman" >NUL

cd "%desktop%\hangman"
ren hangman-1-jar-with-dependencies.jar hangman.jar

echo ^| Copying files                  ^|
echo #--------------------------------#