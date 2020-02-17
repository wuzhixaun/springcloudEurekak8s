#!/bin/bash

mvn package

docker build -t 192.168.100.249/study/config:latest .

docker push 192.168.100.249/study/config:latest