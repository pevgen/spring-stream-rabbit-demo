#Spring cloud stream with rabbitmq. Simple configuration.

 #### Work with rabbitmqin in docker. Start the container:
 ######  docker run -d --hostname my-rabbit --name some-rabbit -p 8080:15672 -p 5672:5672 rabbitmq:3-management
 
 ## Description
   
   #### Spring sends messages to Exchange (rabbitmq). NOT TO a QUEUE directly!
   #### Rabbitmq has to be configured for it (through web console). Exchange:"myexchange", type "fanout" must be bind with a queue(for example "log")