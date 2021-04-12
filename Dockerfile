FROM openjdk:11-jre-slim-buster
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} concourse-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","concourse-0.0.1-SNAPSHOT.jar"]