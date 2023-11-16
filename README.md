# Xsd_to_class

Este é um programa Java para manipular arquivos XSD e executar comandos para gerar classes a partir desses arquivos usando o xjc (JAXB Binding Compiler).

## Requisitos

- **Java 8:** Este programa requer o Java 8 para executar corretamente.
- **Arquivo `xmldsig-core-schema.xsd`:** É necessário ter o arquivo `xmldsig-core-schema.xsd` na mesma pasta onde os outros arquivos XSD estão disponíveis para o correto funcionamento do programa.

## Utilização

1. Certifique-se de ter o Java 8 instalado no seu sistema.
2. Coloque os arquivos XSD na pasta definida pelo caminho `C:/Users/User/Desktop/XsdFile`.
3. Certifique-se de que o arquivo `xmldsig-core-schema.xsd` está presente na mesma pasta que os outros arquivos XSD.
4. Execute a classe `Xsd_to_class` para processar os arquivos XSD e gerar as classes correspondentes.

## Print das classes geradas
![Exemplo de Classe](https://i.ibb.co/3vXVSNd/exemplo-class.png)


## Como executar

Certifique-se de compilar e executar o código usando Java 8.

```bash
O xjc (JAXB Binding Compiler) faz parte do Java Architecture for XML Binding (JAXB) e está disponível a partir do Java 6 e continua a ser suportado nas versões subsequentes do Java.

No entanto, é importante notar que as versões específicas podem ter melhorias e atualizações no xjc. Por exemplo:

Java 6: Inclui o xjc com funcionalidades básicas para geração de classes a partir de arquivos XSD.
Java 8: Oferece melhorias no xjc, como suporte a novos recursos do XML Schema e aprimoramentos na geração de código.
```
Download Java 8
```bash
https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html
```
## Arquivo executável

![Interface](https://i.ibb.co/gPMjJ7K/interface-xsd-converter.png)

```bash
https://github.com/jorgeRjunior/xsd-to-class-java/blob/main/XsdToClassConverter.jar
```
-  Informar o caminho do arquivo xjc.exe; (Normalmente C:\Program Files (x86)\Java\jdk8u382-b05\bin\xjc.exe)
-  A pasta onde esta os arquivos XSD;
-  O nome do pacote, onde será criado subpastas

