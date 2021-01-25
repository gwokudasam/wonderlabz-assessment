#### Start of image
# ------------------------
# Build image based on latest JDK 15 base image, based on latest debian buster OS
FROM openjdk:15-slim-buster

# Set image information, but could be set to different location from command line
ARG IMAGE_VERSION="0.0.1-SNAPSHOT"
ARG IMAGE_NAME="console-roulette"
ARG MAINTAINER="Samuel Gwokuda <gwokudasam@gmail.com>"
ARG TZ="Africa/Harare"

LABEL version=${IMAGE_VERSION} name=${IMAGE_NAME} maintainer=${MAINTAINER}

MAINTAINER ${MANTAINER}

COPY target/console-roulette.jar console-roulette.jar

ENTRYPOINT ["java",  "-server", "--enable-preview", "-XX:+UseContainerSupport", "-XX:+ShowCodeDetailsInExceptionMessages", "-Djava.security.egd=file:/dev/./urandom", "-Dfile.encoding=UTF-8", "-jar", "-Duser.timezone=${TZ}", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE:default}", "console-roulette.jar"]

EXPOSE 9096