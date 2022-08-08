ACTIVEMQ EXAMPLE

you can check the past releases and choose one of the version that works with your java version. (for me: java compatibility: 8 )

	apache-activemq-5.11.3 -> I'm using this version

after you download it. extract it from the zip file.

open cmd, go to the path where file was extracted 

    `(cd C:\Users\kizilkaya\Documents\apache-activemq-5.11.3\bin)`

write to cmd -> activemq start

______________________________________
after run, your links ->

     `http://localhost:8161/admin/`
     `http://localhost:8161/index.html`
______________________________________
SpringBoot Configuration ->

	add dependencies in pom (spring-boot-starter-activemq, spring-boot-starter-web)

	add application properties (spring.activemq.in-memory=false
				    spring.activemq.pool.enabled=false
				    spring.activemq.broker-url=tcp://localhost:61616)

	create Config class and add codes that in config.txt file 

	create ProducerResource class as restcontroller and add codes that in producerResource.txt file

	create Consumer class as listener and add codes that in consumer.txt file
	
	endpoint-> localhost:8080/rest/publish/testMessage    (testMessage: whatever you want to write)

after endpoint is triggered by you, you can see the received message in run tab in intellij