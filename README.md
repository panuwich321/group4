CS-KMITL 2017: Group 3
=========================

Prerequisite Software
=====================
1. JDK 1.8
2. Maven
3. Tomcat 7

Test
==========
$> mvn clean compile test

Build WAR file
==============
$> mvn clean package

Run
==========
$> mvn clean install tomcat7:run
access http://localhost:9090/helloWorld