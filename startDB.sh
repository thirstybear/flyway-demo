#!/usr/bin/env bash
docker run -p 3306:3306 --rm --name mysql -e MYSQL_ROOT_PASSWORD=password -d mysql:5