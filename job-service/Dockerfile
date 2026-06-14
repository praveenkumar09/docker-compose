FROM bellsoft/liberica-openjdk-alpine:21.0.11

WORKDIR /usr/share/app

COPY target/*.jar app.jar

CMD ["java","-jar","app.jar"]