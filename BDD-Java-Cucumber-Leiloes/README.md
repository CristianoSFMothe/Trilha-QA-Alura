# Teste com BDD e Cucumber

> BDD - Behavior Driver Development é uma metodologia baseada em comportamento e uma evolução do TDD, que é o Test Driven Development

> Cucumber - Uma ferramenta muito eficiente para testar um software em equipes que utilizam alguma metodologia ágil Ele tem várias funcionalidades, inclusive a escrita em linguagem natural, como o Português

# Configurações

Esse é um projeto já criado com Java usando o Spring Boot, onde pode ser feito o clone ou o Fork do projeto <a href="https://github.com/CristianoSFMothe/Trilha-QA-Alura/tree/main/BDD-Java-Cucumber-Leiloes" target="blank">Trilha QA - BDD</a>

## Preparação do ambiente

* <a href="https://www.java.com/pt-BR/" target="blank">Java</a>

```bash
# ambiente Java

$ java -version
java version "1.8.0_351"
Java(TM) SE Runtime Environment (build 1.8.0_351-b10)
Java HotSpot(TM) 64-Bit Server VM (build 25.351-b10, mixed mode)
```

* <a href="https://www.oracle.com/br/java/technologies/downloads/" target="blank">JDK</a>

```bash
# ambiente JDK

$ javac -version
javac 1.8.0_202
```
* <a href="https://maven.apache.org/download.cgi" target="blank">Apache Maven</a>

```bash
# ambiente Maven

$ mvn -version
Apache Maven 3.8.7 (b89d5959fcde851dcb1c8946a785a163f14e1e29)
Maven home: C:\tools\apache-maven
Java version: 1.8.0_202, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk1.8.0_202\jre
Default locale: pt_BR, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```

### Configurar as variáveis de ambiente

Para com que o Java executer sem problemas e necessário fazer a configuração das variáveis de ambiente

<img src="C:\Users\crist\OneDrive\Imagens\variavel-ambiente.PNG" alt="variaveis de ambiente" />

<img src="C:\Users\crist\OneDrive\Imagens\configuracao.PNG" alt="configuracao da variavel de ambiente" />

* <a href="https://spring.io/tools" target="blank">Spring Tools</a>

> IDE de sua preferencia no projeto uso o IntelliJ Community
* <a href="https://www.jetbrains.com/idea/download/#section=windows" target="blank">IntelliJ Community</a>

> Banco de Dados opcional
* <a href="https://downloads.mariadb.com/MariaDB/" target="blank">MariaDB</a>

### Configuração do IntelliJ Community

Para realizar a configuração do IntelliJ Community e simples, só seguir as imagens abaixo

* Executar a aplicação em `src > main > java > br.com.alura.leilao > LeilaoApplication`

<img src="C:\Users\crist\OneDrive\Imagens\Sem título.png" alt="Tela inicial do projeto" />

* Configurar o ambiente de execução

<img src="C:\Users\crist\OneDrive\Imagens\1Sem título.png" alt="abrir a configuração do ambiente" />

* Adicionar a variável da VM 

<img src="C:\Users\crist\OneDrive\Imagens\02.png" alt="variavel de ambiente" />

### Acessa a home page do projeto

Após ter as configurações do projeto e o mesmo em execução basta entrar na página inicial do projeto <a href="http://localhost:8080/login" target="blank">http://localhost:8080/login </a>