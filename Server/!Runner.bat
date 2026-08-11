@echo off
Title Project Insanity Server - Running...
Java -Xmx1024m -cp bin;deps/mina.jar;deps/slf4j.jar;deps/slf4j-nop.jar;log4j-1.2.15.jar; server.Server
pause