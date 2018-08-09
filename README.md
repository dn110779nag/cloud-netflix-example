# cloud-netflix-example
Step by step tutorial for cloud-netflix usage

The goal of this project is to show how to use netflix eureka and zuul together.
The topic discovered as simple as possible.
Project consists of 3 subprojects:
- demo-eureka
- demo-zuul
- demo-service

Fast run
Run all three projects from your ide. It'll be three started services as result
- on port 8081 - eureka
- on port 8082 - service
- on port 8083 - zuul

To call service directly use link http://localhost:8082/api/v1/hello . 
To call service via zuul use link http://localhost:8083/service1/api/v1/hello .

To see information about eureka runtime use link http://localhost:8081/ . 
Information about registered services is available at http://localhost:8081/eureka/apps


second step
add second service
add filter to zuul, if http://localhost:8083/service1/api/v1/hello?sample=1 
then it be routed to second service