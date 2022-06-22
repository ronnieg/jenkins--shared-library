#!groovy
def properties() {
        properties([
                parameters([
                        string(defaultValue: 'world', name: 'Name'),
                        [$class:               'ChoiceParameterDefinition', choices: "Dev\nQA\nProd", name: 'Env']
                ])
        ]
        )
}



