FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER jackWu <wuzhixuano@qq.com>

RUN mkdir -p /consumer

WORKDIR /consumer

EXPOSE 80

COPY ./target/consumer-1.0-SNAPSHOT.jar ./app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]