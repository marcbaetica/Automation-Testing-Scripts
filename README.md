#Automation Testing Scripts

This repository serves as the backbone of a local set of tools for real time automatic testing, data generation & analysis.

Technologies and tools:
-

- shell scripting
- Maven (project building)
- Jenkins (continuous integration)
- Robot framework (testing)


To start package:
-
- $ chmod 500 start.sh 
- $ sudo ./start.sh


Customize env variables:
-
- By default, Jenkins listens on port 8080. To modify, change the variable HTTP_PORT in /etc/init.d/jenkins to desired number. Access this port with your browser to start creating and configuring your Jenkins jobs.