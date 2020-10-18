pipelineJob("Pipeline Docker Jenkinsfile") {
  description()
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url("https://github.com/videocursoscloud/test-jenkins-docker.git")
          }
          branch("master")
        }
      }
      scriptPath("Jenkinsfile")
    }
  }
}

