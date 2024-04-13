FROM openjdk:17-alpine
EXPOSE 7070
COPY ./target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]