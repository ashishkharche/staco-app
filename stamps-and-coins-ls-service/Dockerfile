FROM eclipse-temurin:21-alpine

RUN apk add curl

WORKDIR /root

ENV LANG=C.UTF-8

COPY entrypoint.sh /root

COPY target/stamps-and-coins-ls-service.jar /root/stamps-and-coins-ls-service.jar

ENTRYPOINT ["/root/entrypoint.sh"]
