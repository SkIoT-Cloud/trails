node('maven') {
    stage('build') { // for display purposes
       openshiftBuild(buildConfig: 'trails-service', showBuildLogs: 'true')
    }
    stage('deploy') {
       openshiftDeploy(deploymentConfig: 'frontend')
    }
}