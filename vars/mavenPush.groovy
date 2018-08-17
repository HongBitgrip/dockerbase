def call(modulePath, fileName, version) {
  def repository = "docker-private"
  def url = "http://5.189.132.250:8081"
  sh "mvn deploy:deploy-file -q -Dfile=${modulePath}/target/${fileName} -DpomFile=${modulePath}/pom.xml -DgeneratePom=false -DrepositoryId=${repository} -Durl=${url} -Dversion=${version}"
}