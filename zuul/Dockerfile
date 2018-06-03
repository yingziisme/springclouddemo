FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /home/mt/springcloud/zuul
ADD zuul-0.0.1-SNAPSHOT.jar zuul.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/zuul.jar"]
