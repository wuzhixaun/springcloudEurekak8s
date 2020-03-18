#!/bin/bash

mvn package

docker build -t 192.168.1.100/k8s/eureka:latest .

docker push 192.168.1.100/k8s/eureka:latest