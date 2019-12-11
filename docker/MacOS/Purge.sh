#!/bin/bash

cd ../dev

docker container stop library_db

docker container stop library_web_service

docker container stop library_web_application

docker container stop library_batch

docker container prune

docker rmi mahxwell/library_batch

docker rmi postgres:10.3-alpine

docker rmi shinyay/docker-glassfish5:latest

docker rmi java:8-jre-alpine