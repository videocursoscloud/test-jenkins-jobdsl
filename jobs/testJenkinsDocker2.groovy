pipelineJob("test-pipeline") {
  description()
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url("https://github.com/videocursoscloud/test-jenkins-jobdsl.git'")
          }
          branch("master")
        }
      }
      scriptPath("Jenkinsfile")
    }
  }
}

