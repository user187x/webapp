FROM adoptopenjdk/openjdk11
COPY target/webapp.jar /webapp.jar
CMD java -jar /webapp.jar