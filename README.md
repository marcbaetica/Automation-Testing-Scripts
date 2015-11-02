#Automation Testing Package (w scripts)

This repository serves as the backbone of a local set of tools for real time automatic testing, data generation & analysis. Currently the ... is mainly for deployment on a freshly initiated Debian VM locally or on the cloud.

Technologies and tools:
-

- shell scripting
- Maven & Ant (project building)
- Git (source revision control -> git-scm.com)
- Jenkins (continuous integration)
- Robot framework (testing)
- MEAN stack (NodeJS, ExpressJS, AngularJS, MongooseJS for Jenkins manual API injection)
- MongoDB (MEAN stack local db execution)


To start package:
-
- $ chmod 500 start.sh 
- $ sudo ./start.sh


Customize env variables:
-
- By default, Jenkins listens on port 8080. To modify, change the variable HTTP_PORT in /etc/init.d/jenkins to desired number. Access this port with your browser to start creating and configuring your Jenkins jobs. 
- MongoDB defaults to port 2701. To change this adjust the configuration file (/etc/mongod.conf) to the desired port and restart MongoDB (sudo service mongod restart)


Notes: (this manual labor might be transferred into the cli automation scripts described above)
-
- In order to build off of a git repository make sure you have the Jenkins GitHub Plugin installed (Manage Jenkins -> Manage Plugins -> Available (tab) -> GitHub Plugin (select and install) -> restart container to initiate plugin)
- Add the environment variables for your dependencies within the Jenkins configuration (Manage Jenkins -> Configure System): for your JDK, Git, Ant & Maven (make sure to uncheck 'Install automatically' before you proceed)