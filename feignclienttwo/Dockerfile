FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /home/mt/springcloud/feignclienttwo
ADD feignclienttwo-0.0.1-SNAPSHOT.jar feignclienttwo.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/feignclienttwo.jar"]
