# Uygulama için JDK lazım gerekli.
FROM amazoncorretto:17
# FROM openjdk:17

# Bizim projemizdeki JAR dosyamızın Docker içinde çalışacağı konum.
ARG JAR_FILE=target/*.jar

# JAR dosyasını bu isimle Docker'ın içine kopyala
COPY ${JAR_FILE} service-c.jar


# projenin çalışacağı dokerın içinde calisacagi port
EXPOSE 9093

# Uygulamanın çalışmasını sağlar.
ENTRYPOINT ["java","-jar","service-c.jar"]

