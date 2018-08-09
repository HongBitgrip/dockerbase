pipeline {
    agent {
        docker {
            label 'docker'
            image 'docker:18.06.0-ce'
            args '-u root -v /var/run/docker.sock:/var/run/docker.sock'
        }
    }
    stages {
        stage('centos-image') {
            steps {
                script {
                    def image = docker.build('centos7', '--pull ./base/centos')
                    docker.withRegistry('http://5.189.132.250:8083', 'nexus-admin') {
                        image.push()
                    }
                }
            }
        }
        stage('java-image') {
            steps {
                script {
                    def image = docker.build('java-openjdk8', '--pull ./base/java')
                    docker.withRegistry('http://5.189.132.250:8083', 'nexus-admin') {
                        image.push()
                    }
                }
            }        
        }
        stage('maven-image') {
            steps {
                script {
                    def image = docker.build('maven3', '--pull ./base/maven')
                    docker.withRegistry('http://5.189.132.250:8083', 'nexus-admin') {
                        image.push()
                    }
                }
            }        
        }
        stage('cm9-base-image') {
            steps {
                script {
                    def image = docker.build('cm9-base', '--pull ./base/sencha')
                    docker.withRegistry('http://5.189.132.250:8083', 'nexus-admin') {
                        image.push()
                    }
                }
            }        
        }
    }
}    