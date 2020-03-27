FROM java:8-jre

COPY build/libs/registry-service-*.jar /app/registry-service.jar

CMD ["java", "-Xmx200m", "-jar", "/app/registry-service.jar"]

EXPOSE 8761