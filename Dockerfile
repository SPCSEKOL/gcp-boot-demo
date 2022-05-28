FROM openjdk:18-alpine

RUN apk add --no-cache curl tar bash less tzdata
RUN addgroup -S -g 10101 appgroup
RUN adduser -S -u 10101 -G appgroup appuser
USER appuser:appgroup

ENV TZ Asia/Kolkata

ARG JAR_FILE=target/gcp-boot-demo-master-SNAPSHOT.jar
COPY --chown=appuser:appgroup ${JAR_FILE} gcp-boot-demo.jar
EXPOSE 9090

ENTRYPOINT ["java", "-jar", "gcp-boot-demo.jar"]
