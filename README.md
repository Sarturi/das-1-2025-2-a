# das-1-2025-2-a
Repo dedicado a matéria de Design e Arquitetura de Software, lecionada pelo professor Walter Coan.

Material utilizado

- bloquinho.app/waltercoan
- https://learn.microsoft.com/pt-br/azure/architecture/patterns/circuit-breaker?wt.mc_id=AZ-MVP-5003638

# Primeiro Bimestre

<details><summary>Aula 04/08:</summary>
   
- engenharia de software moderna Capítulo 5

- Principios de Projeto

- Todo software tende a crescer, assim aumentando a complexidade

### Abstração: 
é uma representação simples de uma problema, para resolver algum problema da vida real

- config - definições globais

- controller- html api rest

- entity - dados

- repository - conexão bd

- service - lógica

### Ocultamento de informação:

- é o encapsulamento, ou seja, seria aquele private antes atributo

- flexibilidade a mudanças: ao isolar as funcionalidades fica mais facil de trabalhar com funcionalidades separadas

### Coesão: 
- Um codigo coeso é um que faz UMA coisa bem feita, assim. Exemplo: classes anêmicas, que tem apenas os atributos e get's e set's

- flecha vazada com linha continua: extends

- flecha vazada com linha pontilhada: implements

- flecha completa linha continua: associação

### Acoplamento:
- Se refere ao quanto uma classe/módulo depende de outra
**Alto:** Uma classe dependende muito de outra, se algo for alterada em uma impacta na outra
**Baixo:** Depende menos das outras, facilitando na manutenção
```
class A {

   private B b;
   
   public A (int idade) {
      b = new B;
      b.push();
      
   } //construtor
```
</details>
<details> <summary>Aula 05/08:</summary>

**SOLID**

_"No one hears a word they say"_ 
Duran.

Single Responsibility Principle
Open/Closed Principle
Liskov Substitution Principle
Interface Segregation 
Dependency inversible Principle

**Single Responsibility Principle:**
- Um classe, método ou função faz uma unica coisa muito bem feita e apenas ela, tendo apenas uma responsabilidade

**MVC**

**Model:** Dados
**View:** HTML
**Controller:** Controla a tela 

### Interface Segregation 
Classe não deve ser forçada a implementar mais do que ela irá usar. Melhor ter interfaces pequenas do que uma genérica com muitos metodos
</details>

<details><summary>Aula 11/08</summary>

- preferir composição a herança pois pode gerar problemas de manutenção e evolução das classes de um sistema

**Open/Closed Principle:**
Entidades devem estar abertas para extensão e fechadas para modificações.

**Princípio da inversão de dependência:** 
- módulos de alto nivel não devem depender de módulos de baixo nivel. Os dois devem depender de uma interface em comum
  M1 -> Interface <- M2

**Princípio de Demeter:**
princípio do menor conhecimento - a classe deve utilizar código que pertence somente a sua própria classe, ou que foi passada como parâmetro. Ou seja ela é feita para evitar variáveis globais, que são frágeis.
Deve chamar apenas métodos:
1. Da própria classe;
2. Objetos passados como parametro;
3. Objetos criados dentro do método;
4. Atributos da classe.
</details>
<details><summary>Aula 12/08:</summary>

Liskov Substitution Principle: uma subclasse deve poder ser usada no lugar da sua superclasse sem alterar o funcionamento do programa
</details>

<details><summary>Aula 26/08:</summary>

Caracteristicas da Arquitetura:
-  São as caracteristicas que pode ser escolhidas para um projeto, são os requisitos não funcionais, por exemplo: Confiabilidade, **Segurança**.
"Se escolher todas não sai nunca" - Walter

Descisões de arquitetura:
-  Modelo que será utilizado no projeto, como por exemplo o MVC, no cenário perfeito as camadas não devem ser puladas, o que no mundo real não acontece sempre, por conta de prazos entre outros.

Principios do design:
-  São boas praticas que vem da arquitetura escolhida sendo que sempre que possivel utilizar a mensageria assincrona entre os serviços para aumentar o desempenho
</details>

<details><summary>Aula 01/09:</summary>

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
</details>

<details><summary>Aula 02/09:</summary>

Qual a diferença do arquiteto do para o desenvolvedor?

Ambos deve trabalhar em conjunto para manter as melhores práticas, mas entretanto eles tem algumas diferenças e são elas:

Arquiteto:
1. amplitude técnica para pensar como arquiteto e ver as coisas de um ponto de vista da arquitetura
2. amplo conhecimento da tecnologia e como usá-la para resolver problemas específicos
3. amplitude é mais importante do que profundidade no quesito de conhecimento de soluções

Desenvolvedor:
1. Deve ter profundidade técnica em relação as técnicas de desenvolvimento
2. Tem especialização para resolver algum problema de uma maneira, mas talvez não seja a melhor forma

"Os desenvolvedores passam suas carreiras inteiras aprimorando a especialização" - livro do piriquito
</details>

<details><summary>Aula 08/09:</summary>
Trade off?
Não existem resposta perfeita, apenas compensações. Não é possivel atribuir todos os requisitos requiridos, é o "Depende" como falado anteriormente, não existe função ideal para tudo, não existe uma resposta certa ou errada, apenas compensações. A mesma característica pode ser abordada de maneiras diferentes.

- Arquitetura baseada em tópicos
   - Um tópico funciona como um grupão do zap
   - Um para muitos
      -  basta o publisher publicar uma mensagem e todos irão receber essa mesma mensagem
      -  Se conecta ao Broker e todos os inscritos recebem automagicamente
   - Tópicos em modelo Stream
      - Seria como alguem mandar mensagem e você estar sem internet, após se conectar você recebe a mensagem
      - As mensagens são guardadas em ordem no disco e após se conectar ele puxa as alterações que estão faltando
   - Totalmente desacoplado então se algo for adicionado não será necessário mudar nada
   - Extensibilidade arquitetural
   - Desvantagens:
      - Acesso a dados e preocupações a segurança de todos
      - Nenhum contrato heterogêneo
      - Monitoramento e escalabilidade programática

- Arquitetura baseada em Queue
     - 1 para 1
     - Sender -> Receiver
     - Buffer:
        - Salva a mensagem
     - Pooling:
        - Seria buscar a mensagem na fila 
     - FIFO
     - Enqueue
     - Dequeue
     - Não é desacoplado, se algo for alterado vai precisar alterar a fila
</details>

# Segundo Bimestre

<details><summary>Aula 29/09</summary>

Cricuit Breaker:
- É proteger a comunicação entre sistemas, como um disjuntor

Estados:
- Closed: Tudo Ok ambos os serviços estão funcionando
- Open: Deu ruim em algo, algo não conectou, pode ser definido uma margem, para não ir direto para open
- Half-open: Tenta conectar novamente e vê se da certo, ele conta para bater um numero definido, mas se da errado ele volta para Open

A chama B se A der timeout e o contador de timeout bater ele vai para, Open após o open ele tenta reconectar novamente na fase Half-open, se não der bom e bater o contador de timeout volta para Open, se conseguir se conectar aumenta o contador e após um numero de acertos volta para o estado Closed.

</details>

<details><summary>Aula 06/10</summary>

Uma característica de arquitetura apresenta os seguintes critérios:
- Define uma preocupação de design fora do domínio do negócio
- Afeta algum aspecto estrutural do design
- É fundamental ou relevante para o êxito da aplicação
- Se representados em um triângulo, os critérios devem ser cumpridos conforme a aplicação opera.
   
</details>

<details><summary>Aula 07/10</summary>
CQRS:
   Command Query Responsibility Segregation

- Separa as responsabilidades de escrita e leitura de dados
- Permite otimizar cada parte de forma independente
- Facilita escalabilidade e manutenção do sistema
- Se aplicado corretamente, melhora desempenho e organização do código.
   
</details>

<details><summary>Aula 13/10</summary>
- Retry:
Retry imediatamente: se falha tenta novamente depois
Retry depois de delay: se falha depois de um tempo tenta novamente

Estilos arquiteturais:

- Um software usa mais de um estilo/padrão.

- Padrão Grande bola de Lama: uma grande confusão de código. São sistemas que cresceram de forma orgânica, sem planejamento, desenvolvidos de qualquer jeito, com repetidas manutenções, e hoje em dia é muito caro e difícil de implementar coisas novas ou fazer correção.
- Arquitetura unitária: usado em softwares embarcados(geladeira, microondas, friobagr, máquina de lavar), usado em um hardware específico
- Cliente/servidor: divisão de papéis
- Desktop + servidor de banco de dados: várias máquinas em uma instalação conectam-se em um computador com banco de dados
- Navegador + servidor web: o banco de dados conecta no web server, e os clientes utilizam os navegadores para conectar no servidor web e retornar e devolver páginas HTML.
   
</details>

<details><summary>Aula 14/10</summary>


   
</details>
