pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.0.0', '1.0.1', '1.0.2'], description: 'choice parameter test')
        booleanParam(name: 'CheckOrNot', defaultValue: true, description: 'boolean parameter test')
    }
    tools {
        gradle 'Gradle 6.6.1'
    }
    environment {
        NEW_VERSION = '1.3.0'
        // 1. define Credentials in Jenkins UI
        // 2. "credentials("credentials")" binds then credentials to your environment variable
        // 3. for that you need "Credentials Binding" Plugin
//         SERVER_CREDENTIALS = credentials('')
    }
    stages {
        stage("build") {
            when {
                expression {
                    BRANCH_NAME == 'master' || BRANCH_NAME == 'dev'
                }
            }
            steps {
                echo 'building the application..'
                echo "building version ${NEW_VERSION}"
            }
        }

        stage("test") {
            when {
                expression {
                    BRANCH_NAME == 'master' || BRANCH_NAME == 'dev'
                }
            }
            steps {
                echo 'testing the application..'
            }
        }

        stage("deploy") {
            steps {
                echo 'deploying the application..'
            }
        }

    }

    post {
        always {
            echo 'always run'
        }

        success {
            echo 'success run'
        }

        failure {
            echo 'failure run'
        }
    }
}