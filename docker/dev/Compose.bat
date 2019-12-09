docker-compose -p librarydb up -d database

docker-compose -p librarydb up -d web-service

docker-compose -p librarydb up -d web-application

docker build -t mahxwell/library_batch batchapp