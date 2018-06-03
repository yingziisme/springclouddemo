FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /home/mt/springcloud/eurekaserver
ADD eurekaserver-0.0.1-SNAPSHOT.jar eurekaserver.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/eurekaserver.jar"]
