#!groovy
def build() {
    stage('build') {
        node('master') {
            // this is a comment
            sh 'echo BUILD'
            script {
                println "${params.Env}"
                println "${params.Name}"
            }
        }
    }
}


