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

### Aula 26/08

Caracteristicas da Arquitetura:
-  São as caracteristicas que pode ser escolhidas para um projeto, por exemplo: Confiabilidade, **Segurança**.
"Se escolher todas não sai nunca" - Walter

Descisões de arquitetura:
-  Modelo que será utilizado no projeto, como por exemplo o MVC, no cenário perfeito as camadas não devem ser puladas, o que no mundo real não acontece sempre, por conta de prazos entre outros.

Principios do design:
-  São boas praticas, sendo que sempre que possivel utilizar a mensageria assincrona entre os serviços para aumentar o desempenho

### Aula 01/09/2025

REVISÃO DA AULA 26/08

Características de arquitetura
- Podem ser chamados de Requisitos não funcionais

- Novamente: É IMPOSSIVEL ATENDER À TODOS OS ITENS

- Decisão arquitetural é a decisão que vai atender as características escolhidas

- Principios de design: 

---
Expectativa de um arquiteto:

- Tomar decisões de arquitetura:

"Tomar decisões de arquitetura
Analisar continuamente a arquitetura
Manter-se atualizado com as últimas tendências
Assegurar a conformidade com as decisões
Exposição e experiência diversificadas
Ter conhecimento sobre o domínio do negócio
Ter habilidades interpessoais
Entender e lidar bem com questões políticas"
- Analisar continuamente a arquitetura:

Todo sistema muda o tempo todo, Continuamente analisar o que esta sendo feito e em certas horas tomar decisões de refazer certas partes.

- Manter-se atualizado com as últimas tendências

Desenvolver software hoje em dia esta muito complexo, então é necessário estar sabendo do que esta tendo de tech nova no mercado

- Assegurar a conformidade com as decisões

É papel do arquiteto que os padrões estão sendo seguidos, pesquisando por ferramentas e metodos para verificar o que esta sendo desenvolvido

- Exposição e experiência diversificadas

É importante que ele tenha uma boa experiencia, que dai ele pega os tipos de problemas que cada sistema

- Ter conhecimento sobre o domínio do negócio

O arquiteto deve ter conhecimento sobre as regras de negócio, sendo muito importante ter dominio minimo do negócio

- Ter habilidades interpessoais

É necessário saber lidar com outros sere humanos

- Entender e lidar bem com questões políticas

Ele tem que ser capaz que existe uma estrutura hierarquica, ele precisa saber negociar com clientes e outros lideres

---

DevOps

É uma maneira de eu entregar valor para meu cliente mais rapido

DevOps como cultura: Todos devem participar, então todos cuidam do sistema.

Planejamento = Gestão de projetos: kanban, Scrum

Criar: Programar

Integração continua: é necessário ter uma banch Main (sempre pode ser liberada para o cliente)

Continuos deployment/delivery: Se um programador publicar uma alteração todos os clientes recebem em algumas horas

Operar: é necessário ter observabilidade, é necessário 

Feedback: é necessário para a melhoria continua do software