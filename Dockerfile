FROM openjdk:11-slim as build

COPY target/card-0.0.1-SNAPSHOT.jar card-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "card-0.0.1-SNAPSHOT.jar"]