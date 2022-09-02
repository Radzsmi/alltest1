FROM openjdk:19-rc-windowsservercore
##ARG JAR_FILE=build/libs/*.jar
#COPY ${JAR_FILE} springreadyapp.jar
EXPOSE 8081
ADD build/libs/springreadyapp.jar springreadyapp.jar
ENTRYPOINT ["java","-jar","/springreadyapp.jar"]
#FROM openjdk:12-jdk-alpine
#VOLUME /tmp
#ARG JAR_FILE
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java", "-jar", "app.jar"]