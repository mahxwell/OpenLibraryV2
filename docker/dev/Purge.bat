docker container stop library_db
docker container stop library_web_service
docker container stop library_web_application
docker container stop library_batch
docker container prune
docker rmi mahxwell/library_batch