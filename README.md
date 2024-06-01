# petshop
Projeto de atividade sobre XML em java.

O projeto utiliza a API JAXB (Java Architecture for XML Binding) para serializar e desserializar dados em formato XML, garantindo que informações como nome do animal, espécie, raça, gênero e data de nascimento sejam corretamente armazenadas e recuperadas.


## Funcionalidades
**1. Criação de XML a partir de Objetos:**

* Permite a criação de um arquivo XML a partir de uma lista de objetos representando animais.
* Os detalhes de cada animal, incluindo nome, espécie, raça, gênero e data de nascimento, são armazenados no formato XML conforme o esquema definido em Animal.xsd.

**2. Leitura de XML para Objetos:**

* A aplicação pode ler um arquivo XML e converter os dados nele contidos de volta para uma lista de objetos de animais.
* Facilita a troca de informações entre sistemas que utilizam XML como formato de dados.

## Estrutura do Projeto
* **Animal.xsd:**
  * Esquema XML (XSD) que define a estrutura e as regras para os dados dos animais.
* **Animal.java:**
  * Classe que representa um animal com atributos como nome, espécie, raça, gênero e data de nascimento.
* **Animais.java:**
  * Classe que encapsula uma lista de objetos Animal.
* **XmlUtil.java:**
  * Classe utilitária que contém métodos para gerar XML a partir de objetos e ler XML para objetos.
