FROM openjdk:8
EXPOSE 8081
ADD target/employee-docker.jar employee-docker.jar
ENTRYPOINT ["JAVA","-JAR","/employee-docker.jar"]