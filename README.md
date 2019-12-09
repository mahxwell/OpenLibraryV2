# Travis CI BUILD

https://travis-ci.org/mahxwell/OpenLibraryV2.svg?branch=master

# OPENLIBRARY

## Library Website Openclassroom's project

This project was created with Java 1.8 and several frameworks :

`- Apache Struts2 version 2.5`

`- Maven version 3.6.2`

`- Spring version 5.0`

It is necessary to use a Postgre SQL database(9.x) and use an Glassfish 5.0 server
For more informations, please follow "Get started" point bellow

## Features

* Join the greatest website Library

`- You can register as member of this website to access all features. Also Update, delete your profile anytime.`

* Searching books to loan

`- As a member, you can search books and check in real time how many copies of it are available`

* Check your Loaned Books 

`- You are able to verify anytime your loaned book(s) and how many time it remain to give it back`

* Keep your Books longer to finish it

`- If you need more time to finish a book, It is possible to extend one time your loaning duration of 4 weeks`


_Greetings From OPENLIBRARY team !_

## Get Started

First of all, you MUST create a Postgre SQL database:
Get all Scripts by opening Scripts folder : it contains database's creation scripts as libraryCreate.sql and some datas 
to fill the database as libraryInsert.sql

The Projet is divided in 3 parts : 
- The WebService is contained in “openlib” folder
- The Web Application is contained in “openlibclient” folder
- The Java Batch is contained in “openlibBatch” folder

This Projet uses a SOAP “Bottom-Up” implementation where .wsdl file are automatically generated.

Please follow CAREFULLY and step by step the application deployment below

### WebService deployment 

Package Webservice with maven : 

Open your terminal and join the projet’s folder root and go in “openlib” folder. Here enter the following command : 

```
mvn -Dmaven.test.skip=true package
```

A Openlibrary-Webservice.war file shall be build in “openlib/openlib-service/target/”


Now Launch Glassfish Server and deploy your WebService on it.
More informations to know how to deploy an application with Glassfish Server with this link :
https://openclassrooms.com/fr/courses/4504856-implementez-une-architecture-orientee-services-soa-en-java/4856500-creez-un-web-service-bottom-up


### Web Application deployment 

Before to package your application you have to change EACH wsdl URL in “openlibclient-client/pom.xml” file, find each URL on your GlassFish Server 

Follow carefully commented instructions in this .pom file for more details 

Package WebApplication with maven : 

Open your terminal and join the projet’s folder root and go in “openlibclient” folder. Here enter the following command : 

```
mvn -Dmaven.test.skip=true package
```


A Openlibrary-Client.war file shall be build in “openlibclient/openlibclient-webapp/target/”

Now deploy application as you done in the first step.

You can know test the client website, Enjoy it !


### Java Batch deployment 

Before to package your application you have to change EACH wsdl URL in “openlibBatch-client/pom.xml” file, find each URL on your GlassFish Server 

Follow carefully commented instructions in this .pom file for more details 

Package WebApplication with maven : 

Open your terminal and join the projet’s folder root and go in “openlibBatch” folder. Here enter the following command : 

```
mvn -Dmaven.test.skip=true package
```

A Openlibrary-Client.war file shall be build in “openlibclient/openlibclient-webapp/target/”

An openlibBatch-batch-1.0-SNAPSHOT.jar shall be build in “openlibBatch/openlibBatch-batch/target/”

To launch java Batch :

```
java -jar openlibBatch-batch-1.0-SNAPSHOT.jar
```


