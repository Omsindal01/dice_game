FROM openjdk:8
EXPOSE 8080
ADD target/dice-game-1.0-SNAPSHOT.jar dice-game-1.0-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","/dice-game-1.0-SNAPSHOT.jar" ]