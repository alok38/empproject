FROM openjdk:8
ADD target/employee-docker2.jar employee-docker2.jar
ENTRYPOINT ["java","-jar","/employee-docker2.jar"]