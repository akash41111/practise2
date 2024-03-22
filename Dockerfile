FROM openjdk:17
EXPOSE 9191
ADD target/assignment.jar assignment.jar
ENTRYPOINT ["java","-jar","assignment.jar"]