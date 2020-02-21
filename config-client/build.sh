#!/bin/bash

mvn package

docker build -t 192.168.100.249/k8s/config-client:latest .

docker push 192.168.100.249/k8s/config-client:latest