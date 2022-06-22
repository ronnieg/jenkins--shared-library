createJob(this, 'GET_FIRST_NAME')

static createJob(def dslFactory, def name) {
    dslFactory.freeStyleJob(name) {

        parameters {
            stringParam('NAME', 'Vasya', 'My First name')
        }

        label "build"

        steps {
            shell("echo 'Hello Vasya'")
        }

        publishers {
            wsCleanup {
                deleteDirectories(true)
            }
        }
    }
}