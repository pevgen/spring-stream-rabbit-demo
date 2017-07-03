##Spring cloud stream with rabbitmq. Simple configuration.

 #### Work with rabbitmqin in docker. Start the container:
 ######  docker run -d --hostname my-rabbit --name some-rabbit -p 8080:15672 -p 5672:5672 rabbitmq:3-management
 
 ## Description
   
   1.Spring sends messages to Exchange (rabbitmq). NOT TO QUEUE directly!
   2.Rabbitmq has to be configure for it (through web console). Exchange:"myexchange", 
     type "fanout" must be bind with a queue(for example "log")