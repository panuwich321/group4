Example for CS-KMITL 2017
=========================

Prerequisite
============
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