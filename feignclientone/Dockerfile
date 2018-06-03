FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /home/mt/springcloud/feignclientone
ADD feignclientone-0.0.1-SNAPSHOT.jar feignclientone.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=docker","-jar","/feignclientone.jar"]
