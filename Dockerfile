FROM openjdk:8-jdk-alpine
MAINTAINER nadzul <1942620032@student.polinema.ac.id>
RUN mkdir -p /app
WORKDIR /app

COPY finalProject.java /app

#compile file java
RUN javac finalProject.java

#running java
CMD ["java","finalProject"]
