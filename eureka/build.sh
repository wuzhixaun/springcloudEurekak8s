#!/bin/bash

mvn package

<<<<<<< HEAD
docker build -t 192.168.100.249/k8s/eureka:latest .

docker push 192.168.100.249/k8s/eureka:latest
=======
docker build -t 192.168.100.249/study/eureka:latest .

docker push 192.168.100.249/study/eureka:latest
>>>>>>> 342cde4ceb84eeed872ae0a19f834f5c16c5b2f7
