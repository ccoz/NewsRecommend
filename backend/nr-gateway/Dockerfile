FROM openjdk:17-jdk-alpine
COPY ./target/*.jar /tmp/app.jar
EXPOSE 8080
ENTRYPOINT java -jar /tmp/app.jar --spring.profiles.active=pro