FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /home/mt/springcloud/configserver
ADD configserver-0.0.1-SNAPSHOT.jar configserver.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/configserver.jar"]
