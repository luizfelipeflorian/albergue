# Albergue
Sistema de serviços para web de gestão de albergues.

# Configuração do ambiente
## Bibliotecas iniciais do projeto
Usando o Spring Initializr, crie um projeto com as seguintes características:

[Configuração inicial do Spring boot: WEB, DATA-JPA, DEVTOOLS, H2](https://start.spring.io/#!type=gradle-project&language=java&platformVersion=3.3.4&packaging=war&jvmVersion=21&groupId=br.edu.ifms.albergue&artifactId=albergue&name=Albergue&description=Sistema%20de%20servi%C3%A7os%20web%20para%20gest%C3%A3o%20de%20albergues&packageName=br.edu.ifms.albergue.albergue&dependencies=web,data-jpa,devtools,h2)

## Integrando o projeto no github

1. Crie um repositório do seu projeto no github;
2. Descompacte o arquivo do projeto gerado no Spring Initializr em um local onde você guardara os códigos-fontes do seu sistema;
3. Depois, acesse essa pasta, use o Github Desktop ou o Gitbash para criar um repositório local e vincule ele ao repositório online do seu repositório no github conforme as instruções deste link: [Como adicionar um repositório local ao Github usando o Git](https://docs.github.com/pt/migrations/importing-source-code/using-the-command-line-to-import-source-code/adding-locally-hosted-code-to-github).

## Ferramentas de desenvolvimento usadas no projeto

1. AstahUML, disponível [neste link](https://astah.net/products/free-student-license/)
    1. Para instalar uma versão gratuita você deve se cadastrar no site com o e-mail de estudante.
    1. Após o cadastro, o site lhe enviará a licença de uso do software para o período de 1 ano. Esta licença pode ser gerada todo ano enquanto estiver na condição de estudante.
    1. Além disso, você será redirecionado para o link de download da última versão disponível do sistema. Faça o download e instale a aplicação.
2. Apache Netbeans, disponível [neste link](https://netbeans.apache.org/front/main/download/nb23/)
    1. Instale a versão do 17 ou superior do Java.
    2. As versões do java podem ser instaladas pelo próprio Apache Netbeans ou por [este link](https://learn.microsoft.com/pt-br/java/openjdk/download), versão para windows 10 ou superior.
    3. Para versão linux, use o software de instalação disponível, por exemplo: `sudo apt install openjdk-21-jdk`

## Documentação técnica

1. [Documento de Requisitos do Projeto](docs/REQUIREMENTS.md)
2. [Modelagem do Sistema](docs/albergue.asta)
