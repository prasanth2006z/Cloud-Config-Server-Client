# Cloud-Config-Server-Client

This project will help you to configure spring cloud server and client.

# AppCloudConfigServer

  Cloud config server 
  
  RUN: spring-boot:run [-Dhttps.proxyHost="" -Dhttps.proxyPort=""]

# BookService

Cloud Config client

 RUN: spring-boot:run -Dspring.profiles.active=prod,env,jdbc