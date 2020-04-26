@echo off
set DIR=%~dp0
start "" "%DIR%\bin\javaw" -jar output.jar %* && exit 0