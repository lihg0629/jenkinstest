FROM java:1.8

COPY ./target/li-0.0.1-SNAPSHOT.jar /app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
