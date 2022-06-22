@Library("jenkins--shared-library") _
pipeline {
    agent{
        label 'build'
    }
    stages {
        stage("Hello World") {
            steps {
                helloWorld()
            }
        }
     }
}