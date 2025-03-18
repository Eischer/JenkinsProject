pipeline {
    agent any

    stages {
        stage("compile") {
            steps {
                 withMaven {
                    sh "mvn compile"
                }
            }
        }
    }
}