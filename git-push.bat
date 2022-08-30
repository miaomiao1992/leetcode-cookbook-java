@echo off

::获取系统时间
set "Time=%time:~0,8%"
set "t=%Time: =0%"

set "remarks=%date:~,4%-%date:~5,2%-%date:~8,2%-%t%-push-miaomiao1992"
echo %remarks%
 

::添加需要上传的项目
git add src
git add git-cookbook
git add  README.md LICENSE
git add git-push.bat

git commit -m  %remarks%
git push origin main

echo git-push success!

@pause