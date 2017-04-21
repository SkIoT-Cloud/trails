FROM openjdk:8-jdk
WORKDIR /app
ADD ./target/*-fat.jar /app
EXPOSE 80
ENV APPLICATION_PORT 80
CMD ["java", "-jar", "/app/trails-service-1.0-SNAPSHOT-fat.jar"]