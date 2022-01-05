@echo off
for /f "tokens=1* delims==" %%a in (project.properties) do (
  echo %%a %%b
  curl -g --request PUT --data "%%b" http://127.0.0.1:8500/v1/kv/%%a
)


