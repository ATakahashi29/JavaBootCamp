@echo off
chcp 65001

REM 環境変数にJavaが設定されていない場合、JavaのBinへパス設定してください。
set javaDir="C:\pleiades\2023-06\java\17\bin"
REM カレントディレクトリ
set execDir=%~dp0\bin

set PATH=%PATH%;%javaDir%;
cd %execDir%

set /P lessonNo="演習番号を指定ください。"

set lessonNo=000%lessonNo%
set lessonNo=Lesson%lessonNo:~-3%

java %lessonNo%

pause
exit