FROM public.ecr.aws/amazoncorretto/amazoncorretto:17-al2-jdk
WORKDIR /app
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]