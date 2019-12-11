# OPENLIBRARY

## Library Website Openclassroom's project

This project was created with Java 1.8 :

Frameworks :

`- Apache Struts2 version 2.5`

`- Maven version 3.6.2`

`- Spring version 5.0`

Database :

`- Postgre SQL(9.x)`

Server :

`- Glassfish 5.0`

Docker was also used for Applications version 2 deploiment.

For more informations, please follow "Get started" point bellow

## Features

Features Version 1 :

* Join the greatest website Library

`- You can register as member of this website to access all features. Also Update, delete your profile anytime.`

* Searching books to loan

`- As a member, you can search books and check in real time how many copies of it are available`

* Check your Loaned Books 

`- You are able to verify anytime your loaned book(s) and how many time it remain to give it back`

* Keep your Books longer to finish it

`- If you need more time to finish a book, It is possible to extend one time your loaning duration of 4 weeks`

Features Version 2 : 

* Book reservation Implementation

`- Waiting For a book to read ? Users can now reservate a book to be sure to loan it when it come back.`

* Unit Test for three applications available As Integration Test

`- JUnit 4 For Unit Testing.`

`- Travis CI For Integration Testing.`

* Bug Fix

`- It is now impossible to extend time for a book loan when give back deadline is passed (check branch 1.0.1).`


_Greetings From OPENLIBRARY team !_

## Get Started

First of all, download the project on Github https://github.com/mahxwell/OpenLibraryV2/ and unzip it. Docker Application is requiered,
you MUST own a docker account to get necessary images to create Openlibrary applications containers.

The Projet is divided in 3 parts :

The WebService is contained in “openlib” folder
The Web Application is contained in “openlibclient” folder
The Java Batch is contained in “openlibBatch” folder

This Projet uses a SOAP “Bottom-Up” implementation where .wsdl file are automatically generated.

Please follow CAREFULLY and step by step the application deployment below

### Windows 10 INSTALLATION

Different docker command are regrouped as `.bat` file for Windows in this folder :`"OpenLibraryV2\docker\Windows\"`
Please double click on files to launch them.

1. Deploy Applications : `Compose.bat`

2. Launch Batch Application : `LaunchBatch.bat`

3. Stop Batch Application : `stopBatch.bat`

4. Stop AND Delete all Containers : `Purge.bat`

### MacOSX INSTALLATION

Different docker command are regrouped as `.sh` script files for MacOSX in this folder `"OpenLibraryV2/docker/MacOS/"`
Run these files in your Terminal Application

1. Deploy Applications : `bash Compose.sh`

2. Launch Batch Application : `bash Launch Batch.sh`

3. Stop Batch Application : `bash stopBatch.sh`

4. Stop AND Delete all Containers : `bash Purge.sh`


### Run It On Your Browser !

Please wait 1 or 2 minutes to let applications deploying correctly in docker containers.

Then you can test Openlibrary Client Application with this link : http://localhost:80/Openlibrary-Client/

Enjoy It !

### Testing And Build

Please click on this link to check Travis CI Logs :  [![Build Status](https://travis-ci.org/mahxwell/OpenLibraryV2.svg?branch=master)](https://travis-ci.org/mahxwell/OpenLibraryV2)

This Project contains almost 170 Unit tests made with JUnit 4.

### Package it on your Computer

To package it on your computer by compiling source code please follow Readme.MD from Openlibrary Version 1 at this link : https://github.com/mahxwell/OpenLibrary/
