FROM adoptopenjdk/openjdk11
VOLUME /tmp
ADD ./target/category-service-1.0-SNAPSHOT.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
