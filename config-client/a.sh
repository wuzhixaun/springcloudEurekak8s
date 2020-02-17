#!/usr/bin/env bash

mvn package

docker build -t 192.168.100.249/study/config-client:latest .

docker push 192.168.100.249/study/config-client:latest
