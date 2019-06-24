def call(){
     def scannerHome = tool 'SonarQubeScannerDefault';
    withSonarQubeEnv('SonarQubeDefault') {
      sh "${scannerHome}/bin/sonar-scanner"
    }
}
