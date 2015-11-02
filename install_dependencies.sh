sudo apt-get update

#Jenkins
ehco "NOTE: Installing Jenkins for continuous integration..."
wget -q -O - https://jenkins-ci.org/debian/jenkins-ci.org.key | sudo apt-key add -
sudo sh -c 'echo deb http://pkg.jenkins-ci.org/debian binary/ > /etc/apt/sources.list.d/jenkins.list'
sudo apt-get install jenkins

#Git
echo "NOTE: Installing Git for revision control..."
sudo apt-get install git

#maven
echo "NOTE: Installing Maven for Java project builds..."
sudo apt-get install maven

#Ant
echo "NOTE: Installing Maven for Java project builds..."
sudo apt-get install ant