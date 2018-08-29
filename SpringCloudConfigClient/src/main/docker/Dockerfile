FROM java:8
VOLUME /tmp
ADD SpringCloudConfigClient-0.0.1-SNAPSHOT.jar /opt/SpringCloudConfigClient-1.0-RELEASE.jar
RUN bash -c 'touch /opt/SpringCloudConfigClient-1.0-RELEASE.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/SpringCloudConfigClient-1.0-RELEASE.jar"]
