**About the application**

In this demo project I've create 2 microservices with spring-boot .. one of them talks rest and the other talks grpc with protobuf as main data format between the 2 microservices.

Each microservice has a basic docker file to be built and deployed easily as a docker container .. also the whole project can be deployed using docker-compose to be the management of the application easier.

**To open in intelij:**

> 1. Import maven project
> 2. Go to settings and install lombok plugin
> 3. Enable annotation processing

**To run using docker-compose**
> 1. ```cd /path/to/dockerized-microservices/```
> 2. Run ```docker-compose up```

**To rebuild using docker-compose**
> 1. ```cd /path/to/dockerized-microservices/```
> 2. Run ```docker-compose build```

**To stop container without cleaning up containers**
> 1. ```cd /path/to/dockerized-microservices/```
> 2. Run ```docker-compose stop```

**To stop container and cleaning up containers**
> 1. ```cd /path/to/dockerized-microservices/```
> 2. Run ```docker-compose down```

**Important Note**

> If you see any issue feel free to submit a PR and I will update the topic on my blog by mentioning your name and your github profile [here](http://se7so.blogspot.com).
