@echo off

echo Processing "git add ." ...
echo.
echo.

git add .

echo.
echo.
echo.
set /p MsnCommit= "Commit Message: "
echo.
echo.
echo.
echo Processing "git commit" ...
echo.

git commit -m "%MsnCommit%"
echo.
echo.
echo.
echo Processing "git push" ...
echo.

git push

echo.
echo.
echo ===========================
echo   LOG: 
echo ===========================
echo.
git log --oneline

pause
