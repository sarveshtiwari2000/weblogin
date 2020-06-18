# Spring Boot Application.

Web-Login

## 1. Used Database - H2

## 2. Running as a Packaged Application (Following ways)
    Way-1 : java -jar target/weblogin-0.0.1-SNAPSHOT.war

    Way-2 : mvn spring-boot:run (using maven)

## 3. DB configuration are provided in /weblogin/src/main/resources/application.properties file.
    4.1. you can change it's value as per your convenient. as per explained in step-3.
 
## 4. To generate .war file we need to clean install our project by following command(Maven should be installed),
    Way-1 - mvn clean install

    Way-2 - if have eclipse(IDE) then following steps is enough to have packaged app file, (right click on project) -> Run -> Maven install which will generate 1-war file namely "weblogin-0.0.1-SNAPSHOT.war" under 'target' directory

## 5. Once the application is started you can access http://localhost:8080/
    username: admin@gmail.com
    password: admin




