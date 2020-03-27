FROM java:8-jre

COPY build/libs/budget-service-*.jar /app/budget-service.jar

CMD ["java", "-Xmx200m", "-jar", "/app/budget-service.jar"]

EXPOSE 8090