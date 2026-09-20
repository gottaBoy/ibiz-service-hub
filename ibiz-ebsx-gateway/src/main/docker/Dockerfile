FROM eclipse-temurin:17-jre

ENV TZ=Asia/Shanghai \
    SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \
    IBIZ_SLEEP=0 \
    JAVA_OPTS=""

CMD echo "The application will start in ${IBIZ_SLEEP}s..." && \
    sleep ${IBIZ_SLEEP} && \
    java ${JAVA_OPTS} -Duser.timezone=$TZ -Djava.security.egd=file:/dev/./urandom -jar /ibiz-ebsx-gateway.jar

EXPOSE 20086

ADD ibiz-ebsx-gateway.jar /ibiz-ebsx-gateway.jar
