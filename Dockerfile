FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/chatapp-0.0.1-SNAPSHOT.jar chatapp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/chatapp-0.0.1-SNAPSHOT.jar"]