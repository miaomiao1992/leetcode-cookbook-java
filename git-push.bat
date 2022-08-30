@echo off

set "Time=%time:~0,8%"
set "t=%Time: =0%"
::echo %t%

set "remarks=%date:~,4%-%date:~5,2%-%date:~8,2%-%t%-push"

echo %remarks%
echo  ""
 git add src
 git add git-cookbook
 git add  README.md LICENSE
 git add git-push.bat 
 git commit -m  %remarks%
 git push origin main

echo git-push success!

@pause