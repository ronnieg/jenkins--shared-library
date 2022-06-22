#!groovy
def deploy () {
    if ("${params.Env}" == "Dev") {
        stage('deploy_dev') {
            node('master') {
                sh 'echo DEPLOY_DEV'
            }
        }
    } else if ("${params.Env}" == "QA"){
        stage('deploy_qa') {
            node('master') {
                sh 'echo DEPLOY_QA'
            }
        }
    } else {
        stage('deploy_prod') {
            node('master') {
                sh 'echo DEPLOY_PROD'
            }
        }
    }
}