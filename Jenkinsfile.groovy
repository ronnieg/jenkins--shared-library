@Library("jenkins--shared-library") _
pipeline {
    agent{
        label 'master'
    }
    stages {
        stage("Hello World") {
            steps {
                helloWorld()
            }
        }
     }
}