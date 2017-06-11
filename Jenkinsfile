node {
    stage('Maven') { // for display purposes
        git url: 'https://github.com/cyrille-leclerc/multi-module-maven-project'
        withMaven(maven: 'M3') {
            sh "mvn clean install"
        }
    }
    stage('Docker') {
        sh "'${mvnHome}/bin/mvn' clean package"
    }
}