FROM openjdk:8
EXPOSE 8080
ADD target/dice-game-1.0.jar dice-game-1.0.jar
ENTRYPOINT [ "java","-jar","/dice-game-1.0.jar" ]