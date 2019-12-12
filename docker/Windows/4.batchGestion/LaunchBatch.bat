cd ..\..\dev

docker build -t mahxwell/library_batch batchapp

docker-compose -p librarydb up -d batch