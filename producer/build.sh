#!/bin/bash

mvn package

docker build -t 192.168.1.100/k8s/producer:latest .

docker push 192.168.1.100/k8s/producer:latest