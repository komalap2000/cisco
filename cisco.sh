#!/bin/bash -ex

mvn clean
mvn compile
mvn -e -Dprism.order=sw exec:java -Dexec.mainClass="cisco.internship.Driver"

export PATH=/usr/local/checkstyle:$PATH
find src -name "*.java" | xargs checkstyle -c cs1302_checks.xml
