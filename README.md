# das-1-2025-2-a

bloquinho:
bloquinho.com/waltercoan

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

class A {

   private B b;
   
   public A (int idade) {
      b = new B;
      b.push();
      
   } //construtor
