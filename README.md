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
> 3. Go to ```http://localhost/health```
> 4. Go to ```http://localhost/passwords?q=123```

**To rebuild using docker-compose**
> 1. ```cd /path/to/dockerized-microservices/```
> 2. Run ```docker-compose build```

**To stop container without cleaning up containers**
> 1. ```cd /path/to/dockerized-microservices/```
> 2. Run ```docker-compose stop```

**To stop container and cleaning up containers**
> 1. ```cd /path/to/dockerized-microservices/```
> 2. Run ```docker-compose down```

This is to run locally .. you can also run it on a docker swarm cluster or Kubernetes .. please check the articles on [my blog](http://se7so.blogspot.de/2017/04/docker-microservices-all-in-one.html).

**Important Note**

> You can read about this on my blog to understand the purpose of the demo and get some quick knowledge of the technologies used. [here](http://se7so.blogspot.de/2017/04/docker-microservices-all-in-one.html).
