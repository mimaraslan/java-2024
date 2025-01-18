### Docker Login
```
docker login --username mimaraslan --password 123456789
```

```
docker login -u mimaraslan -p 123456789
```


```
cd PROJENIN_KONUMU
```




### MAVEN

```
docker build  --build-arg  JAR_FILE=target/java-40-docker-hello-maven-1.0.0.jar  --tag  mimaraslan/java-40-docker-hello-maven:v001 .
```

```
docker build  --build-arg  JAR_FILE=target/java-40-docker-hello-maven-1.0.2.jar  --tag  mimaraslan/java-40-docker-hello-maven:v002 .
```

```
docker pull mimaraslan/java-40-docker-hello-maven:v001
docker pull mimaraslan/java-40-docker-hello-maven:v002
docker pull mimaraslan/java-40-docker-hello-maven:v003

docker pull mimaraslan/java-40-docker-hello-maven
docker pull mimaraslan/java-40-docker-hello-maven:latest
```



### GRADLE

```
docker build  --build-arg  JAR_FILE=build/libs/java-41-docker-hello-gradle-1.0.0.jar  --tag  mimaraslan/java-41-docker-hello-gradle:v001 .
```

```
docker build  --build-arg  JAR_FILE=build/libs/java-41-docker-hello-gradle-1.0.2.jar  --tag  mimaraslan/java-41-docker-hello-gradle:v002 .
```

```
docker pull mimaraslan/java-41-docker-hello-gradle:v001
```

```
docker pull mimaraslan/java-41-docker-hello-gradle:v002
```

```
docker pull mimaraslan/java-41-docker-hello-gradle
```

```
docker pull mimaraslan/java-41-docker-hello-gradle:latest
```