job('jobtest') {
    logRotator(-1, 10)
    scm {
        git('git://github.com/vishallahar-triser/jenkins-test.git')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        batchFile('javac test.java')
      	batchFile('java test')
    }
}

print "testing groovy"