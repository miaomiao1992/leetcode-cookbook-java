@echo off
set "Ymd=%date:~,4%-%date:~5,2%-%date:~8,2%-%time:~0,5%-%time:~6,2%-push"

 git add src
 git add git-cookbook
 git add  README.md LICENSE
 git add git-push.bat 
 git commit -m  %Ymd%
 git push origin main

echo git-push success!

@pause