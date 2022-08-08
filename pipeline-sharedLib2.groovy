@Library ('sharedLibrary') _  // Shared library name as configured in Jenkins global pipeline libraries
pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                helloWorld2(name:Omer,dayofWeek:Tuesday)
            }
        }
    }
}