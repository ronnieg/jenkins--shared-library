#!groovy
def parallel = call() {
    node('master'){
        stage('Deploy to all environments'){
            parallel([
                    hello: {
                        echo "hello"
                    },
                    world: {
                        echo "world"
                    }
            ])
        }
    }
}