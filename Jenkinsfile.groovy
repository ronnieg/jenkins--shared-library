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
        stage("Hello Name and day of the week") {
            steps {
                helloNameDayOfWeek("Egor", "Wednesday")
            }
        }
     }
}