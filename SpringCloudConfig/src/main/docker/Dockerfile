FROM java:8
VOLUME /tmp
ADD SpringCloudConfigServer-0.0.1-SNAPSHOT.jar /opt/SpringCloudConfigServer-1.0-RELEASE.jar
RUN bash -c 'touch /opt/SpringCloudConfigServer-1.0-RELEASE.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/SpringCloudConfigServer-1.0-RELEASE.jar"]
