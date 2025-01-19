docker build  --build-arg  JAR_FILE=build/libs/servicea-1.0.0.jar  --tag  mimaraslan/servicea:v001 .

docker build  --build-arg  JAR_FILE=build/libs/serviceb-1.0.0.jar  --tag  mimaraslan/serviceb:v001 .

docker build  --build-arg  JAR_FILE=build/libs/servicec-1.0.0.jar  --tag  mimaraslan/servicec:v001 .


