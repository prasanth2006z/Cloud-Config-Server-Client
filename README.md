# Cloud-Config-Server-Client

This project demonstrate to configure spring cloud server and how resource clients are accessing configurations from any version control system like GitHub/Bit bucket/SVN etc.


# AppCloudConfigServer

  Cloud config server 
  
  RUN: spring-boot:run [-Dhttps.proxyHost="" -Dhttps.proxyPort=""]

# BookService

Cloud Config client

 RUN: spring-boot:run -Dspring.profiles.active=prod,env,jdbc
