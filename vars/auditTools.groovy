def call(){
 node {
    bat '''
    java -- version
    mvn --version
    git --version
    '''
}
