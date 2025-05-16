def call(){

  node {

     sh '''
       git version
       java -version
       maven -version
       '''
  }
}
