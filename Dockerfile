FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8000
ADD build/libs/demo-0.0.1-SNAPSHOT.jar springbootpostgresqldocker.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/springbootpostgresqldocker.jar"]