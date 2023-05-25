FROM openjdk
EXPOSE 9090
ADD target/basic-rest-api-docker.jar basic-rest-api-docker.jar
ENTRYPOINT ["java","-jar","/basic-rest-api-docker.jar"]

