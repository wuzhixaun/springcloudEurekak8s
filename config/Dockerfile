FROM openjdk:8
MAINTAINER allen xcp.email@gmail.com
VOLUME /tmp
ADD target/config-1.0-SNAPSHOT.jar app.jar
#RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]