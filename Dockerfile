FROM openjdk:17
EXPOSE 8000
ADD target/springboot-crud-image.jar springboot-crud-image.jar
ENTRYPOINT ["java","-jar","/springboot-crud-image.jar"]