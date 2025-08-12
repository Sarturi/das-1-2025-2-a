# das-1-2025-2-a

bloquinho:
bloquinho.app/waltercoan

## aula 1 - 04/08/2025:
engenharia de software moderna Capítulo 5
Principios de Projeto

Todo software tende a crescer, assim aumentando a complexidade

### Abstração: 
é uma representação simples de uma problema, para resolver algum problema da vida real

config - tralha?

controller- html api rest

entity - dados

repository - conexão bd

service - logica

### Ocultamento de informação:

é o encapsulamento, ou seja, seria aquele private antes atributo

flexibilidade a mudanças: ao isolar as funcionalidades fica mais facil de trabalhar com funcionalidades separadas

### Coesão: 
Um codigo coeso é um que faz UMA coisa bem feita, assim. Exemplo: classes anêmicas, que tem apenas os atributos e get's e set's

flecha vazada com linha continua: extends

flecha vazada com linha pontilhada: 
implements

flecha completa linha continua: associação

Auto acoplamento: ao mexer em um canto no codigo impacta em outro canto obscuro, dai o cliente acha e taca o pau em nois...

```
class A {

   private B b;
   
   public A (int idade) {
      b = new B;
      b.push();
      
   } //construtor
```
## aula 1 - 05/08/2025:
### SOLID

_"No one hears a word they say"_ 
Duran.

Single Responsibility Principle
Open/Closed Principle
Liskov Substitution Principle
Interface Segregation 
Dependency inversible Principle

### Single Responsibility Principle:
Responsabilidade Unica

**MVC**

**Model:** Dados
**View:** HTML
**Controller:** Controla a tela 

### Interface Segregation 

A classe só implementa o que vai usar. Nada de métodos inúteis só porque a interface mandou.


### Aula 11/08

Princípio da inversão de dependência: classe estabelece dependências com abstração, pois abstrações sao mais estáveis do que implementações concretas

preferir composição a herança pois pode gerar problemas de manutenção e evolução das classes de um sistema

Princípio de Demeter: princípio do menor conhecimento - a classe deve utilizar código que pertence somente a sua própria classe, ou que foi passada como parâmetro. Ou seja ela é feita para evitar variáveis globais, que são frágeis.

### Aula 12/08

Liskov: uma subclasse deve poder ser usada no lugar da sua superclasse sem alterar o funcionamento do programa
