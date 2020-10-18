job('Seed') {
  scm {
    git ('https://github.com/videocursoscloud/test-jenkins-jobdsl.git')
  }
  steps {
    dsl {
      external('jobs/*.groovy')  
      // default behavior
      // removeAction('IGNORE')      
      removeAction('DELETE')
    }
  }
}
