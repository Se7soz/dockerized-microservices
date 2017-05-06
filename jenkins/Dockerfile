FROM openjdk:8

# maven
RUN apt-get update -y && apt-get install maven -y

# Docker
#RUN apt-get install \
#    linux-image-extra-$(uname -r) \
#    linux-image-extra-virtual -y

RUN apt-get install \
    apt-transport-https \
    ca-certificates \
    curl \
    software-properties-common -y
#RUN curl -fsSL https://download.docker.com/linux/ubuntu/gpg | apt-key add -
#RUN apt-key fingerprint 0EBFCD88
#RUN add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"
#RUN apt-get update -y && pt-get install docker-ce -y

# Docker Compose
RUN curl -o /usr/local/bin/docker-compose -L "https://github.com/docker/compose/releases/download/1.11.2/docker-compose-$(uname -s)-$(uname -m)"
RUN chmod +x /usr/local/bin/docker-compose

# Jenkins

RUN wget -q -O - https://pkg.jenkins.io/debian/jenkins-ci.org.key | apt-key add -
RUN sh -c 'echo deb http://pkg.jenkins.io/debian-stable binary/ > /etc/apt/sources.list.d/jenkins.list'
RUN apt-get update -y && apt-get install jenkins -y

RUN curl -LO https://storage.googleapis.com/kubernetes-release/release/$(curl -s https://storage.googleapis.com/kubernetes-release/release/stable.txt)/bin/linux/amd64/kubectl
RUN chmod +x ./kubectl
RUN mv ./kubectl /usr/local/bin/kubectl

CMD service jenkins start && tailf  /var/log/jenkins/jenkins.log 

