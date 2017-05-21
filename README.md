# users

## Passo a passo do procedimento de importação na ferramenta de desenvolvimento e versão do Java utilizados
### Pré-requisitos:
* Java 8
* Eclipse (Mars 2)
* É necessário instalar o Jboss Tools 4.3.1 Final no eclipse para dar suporte ao WildFly e também o Buildship Gradle integration 2.0.
* Baixar o Wildfly 10 (http://download.jboss.org/wildfly/10.1.0.CR1/wildfly-10.1.0.CR1.zip) e inserir como Server no Eclipse
* Instalar o Bower (requer o node.js, npm e git) - https://bower.io/#install-bower
* MySql 5.7, utilizar usuário root (senha: root) criar schema users.

### Processo de build:
1. Na pasta raiz do projeto, via terminal, executar:
	1. bower install
	1. gradle build eclipse eclipseWtp
2. Importar como Existing Gradle Project no eclipse.
3. Adicionar o war do projeto no WildFly (Server no eclipse) 
4. Subir o WildFly
5. Acessar o link localhost:8080/users
