FROM openjdk:17
ADD target/Milestone6-Reattempt-0.0.1-SNAPSHOT.jar Milestone6-Reattempt.jar
ENTRYPOINT ["java","-jar","Milestone6-Reattempt.jar"]