FROM maven:3.9-eclipse-temurin-21-alpine AS build

WORKDIR /build

COPY pom.xml .
RUN mvn dependency:go-offline -q

COPY src ./src
RUN mvn clean package -DskipTests -q

FROM bellsoft/liberica-openjdk-alpine:21.0.11

WORKDIR /usr/share/app

COPY --from=build /build/target/*.jar app.jar

CMD ["java","-jar","app.jar"]