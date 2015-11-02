#Automation Testing Scripts

This repository serves as the backbone of a local set of tools for real time automatic testing, data generation & analysis.

Technologies and tools:
-

- shell scripting
- Maven & Ant (project building)
- Git (source revision control -> git-scm.com)
- Jenkins (continuous integration)
- Robot framework (testing)


To start package:
-
- $ chmod 500 start.sh 
- $ sudo ./start.sh


Customize env variables:
-
- By default, Jenkins listens on port 8080. To modify, change the variable HTTP_PORT in /etc/init.d/jenkins to desired number. Access this port with your browser to start creating and configuring your Jenkins jobs. 
- 


Notes: (this manual labor might be transferred into the cli automation scripts described above)
-
- In order to build off of a git repository make sure you have the Jenkins GitHub Plugin installed (Manage Jenkins -> Manage Plugins -> Available (tab) -> GitHub Plugin (select and install) -> restart container to initiate plugin
- Add the environment variables for your dependencies within the Jenkins configuration (Manage Jenkins -> Configure System): for your JDK, Git, Ant & Maven (make sure to uncheck 'Install automatically' before you proceed)