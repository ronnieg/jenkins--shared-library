#!groovy
def call() {
    stage('build') {
        node('master') {
            // this is a comment
            sh 'echo BUILD'
        }
    }
}


