# Users

## Passo a passo do procedimento de importação na ferramenta de desenvolvimento e versão do Java utilizados
### Pré-requisitos:
* Java 8
	* https://www.java.com/pt_BR/download/
* Eclipse (Mars 2)
	* http://www.eclipse.org/downloads/packages/release/Mars/2
* É necessário instalar o Jboss Tools 4.3.1 Final no eclipse para dar suporte ao WildFly e também o Buildship Gradle integration 2.0.
* Baixar o Wildfly 10 e inserir como Server no Eclipse
	* WildFly 10: http://download.jboss.org/wildfly/10.1.0.CR1/wildfly-10.1.0.CR1.zip
* Instalar o Bower (requer o node.js, npm e git)
	* bower: https://bower.io/#install-bower
	* node.js: https://nodejs.org/en/download/ (já vem com o npm)
	* git: https://git-scm.com/downloads
* MySql 5.7, utilizar usuário root (senha: root) criar schema users.
	* https://dev.mysql.com/downloads/installer/
### Processo de build:
1. Na pasta raiz do projeto, via terminal, executar:
	1. bower install
	1. gradle build eclipse eclipseWtp
2. Importar como Existing Gradle Project no eclipse.
3. Adicionar o war do projeto no WildFly (Server no eclipse) 
4. Subir o WildFly
5. Acessar o link localhost:8080/users
