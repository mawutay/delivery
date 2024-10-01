# Believe live coding interview

## Getting started

### Prerequisites

To work on the application, everything you need is a JDK. You may use version 21
or above.

### Building the project

The project is built using Maven. This repository provides a Maven wrapper so that
you don't have to install it on your own machine. Running the `mvnw` script will
download the appropriate version of Gradle in a transparent manner.


```shell
$ ./mvnw clean install
```

### API

This application exposes two endpoints.

* `GET /search`: returns the whole search results.
* `POST /deliveries/{deliveryId}`: triggers the delivery identified by `deliveryId`.