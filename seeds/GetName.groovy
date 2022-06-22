class GetName {
    static createJob(def dslFactory, def name) {
        dslFactory.freeStyleJob(name) {

            parameters {
                stringParam('NAME', 'Vasya', 'My First name')
            }

            label "build"

            wrappers {
                preBuildCleanup()
                buildName('nam: ${Env.NAME}')
            }

            steps {
                shell("Hello ${Env.Name}")
            }

            publishers {
                wsCleanup {
                    deleteDirectories(true)
                }
            }
        }
    }
}

