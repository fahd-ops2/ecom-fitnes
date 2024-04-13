
# Stage 1: Run the application
FROM openjdk:17-alpine
WORKDIR /app
COPY --from=build /app/target/ecom-fitness-3.2.3.jar ./ecom-fitness.jar
EXPOSE 8080
CMD ["java", "-jar", "ecom-fitness.jar"]
