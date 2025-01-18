docker login --username YOUR_USERNAME --password YOUR_PASSWORD

docker login -u YOUR_USERNAME -p YOUR_PASSWORD


docker build  --build-arg  JAR_FILE=target/java-40-docker-hello-maven-1.0.0.jar  --tag  YOUR_USERNAME/YOUR_PROJECT_NAME_VERSION:v001 .







