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

Arquiteturas de Três Camadas

Monolíto:
Aplicação em que todo o código, funcionalidades e módulos convivem no mesmo projeto, formando um único bloco.

Arquitetura distribuída (microsserviços):
O sistema é dividido em vários serviços independentes, cada um cuidando de uma responsabilidade específica e se comunicando entre si.

Quando o monolito começa a ficar complicado de manter, com dificuldade para adicionar funcionalidades, pode ser interessante migrar para algo distribuído. Porém, microsserviços não são solução mágica — existem cenários onde o monolito continua sendo a melhor opção.

Falácias comuns em sistemas distribuídos

- Confiar que a rede nunca falha
- Acreditar que a latência é desprezível
- Assumir largura de banda ilimitada
- Pensar que a rede é totalmente segura
- Imaginar que a topologia permanece igual

Padrões utilizados em arquiteturas distribuídas

Log distribuído:
Abordagem para reunir e organizar os logs gerados por diferentes serviços em um ponto central.

Transações distribuídas:
Ocorrência em que uma operação depende de dois ou mais serviços, exigindo coordenação para iniciar e finalizar a transação entre eles.
   
</details>

<details><summary>Aula 20/10</summary>
A arquitetura em camadas é simples, comum e de baixo custo.

Estrutura-se em níveis horizontais; normalmente quatro:

  - **Apresentação**

  - **Negócio (comercial)**

  - **Persistência**

  - **Banco de dados**

Cada camada possui responsabilidade própria e deve se manter isolada das demais.

A separação das responsabilidades facilita manutenção, organização e substituição de camadas sem impactar o restante do sistema.

É particionada por função técnica (ex.: apresentação) e não por domínio, o que pode dificultar mudanças relacionadas ao negócio.

Camadas podem ser:

  - **Fechadas:** a requisição só pode acessar a camada imediatamente inferior.

  - **Abertas:** permitem introduzir uma nova camada intermediária quando necessário.

O conceito de isolamento torna as camadas independentes, permitindo substituir uma camada sem modificar as outras.

Antipadrão **sinkhole:** quando uma requisição atravessa várias camadas sem lógica útil.

  - Aceitável até cerca de 20% dos casos; acima disso indica má escolha de arquitetura.

É uma boa opção quando:

  - O sistema é pequeno ou simples.

  - Há pouco tempo ou orçamento.

  - O arquiteto ainda está entendendo os requisitos e necessidades comerciais.  
</details>

<details><summary>Aula 27/10</summary>
Arquitetura Pipeline
   
- É uma arquitetura que os programas se comunicam de forma sequencial

- Toda arquitetura de pipeline tem os Filtros Produtor, Transformador, Verificador e Consumidor
   
</details>

<details><summary>Aula 03/11</summary>

Arquitetura Microkernel

- O **sistema central** contém apenas o mínimo necessário para o sistema funcionar.

- A utilidade real surge com os **plug-ins**, que estendem e especializam o comportamento.

- O sistema central pode ser:
  
  - Uma arquitetura em camadas,
  
  - Um monólito modular,
  
  - Ou dividido em serviços de domínio separados.

### Plug-ins

- São **autônomos**, independentes e focados em funcionalidades específicas.

- Isolam código volátil, facilitando **manutenção** e **testes**.

- Geralmente se comunicam com o núcleo via **chamadas diretas** (ponto a ponto).

- Porém, plug-ins remotos tornam o sistema **distribuído**, aumentando complexidade, custo e dificuldade de implantação.

### Registro de Plug-ins

- O sistema central precisa saber quais plug-ins existem e como acessá-los.

- Pode ser:
  
  - Um simples mapa interno (chave -> plug-in),
  
  - Ou um mecanismo completo de registro e descoberta.

### Contratos

- Definem comportamento, entradas e saídas entre o núcleo e os plug-ins.

- Normalmente padronizados dentro do domínio.

### Classificação das Características

- **Pontos fortes:** simplicidade, baixo custo, boa testabilidade, boa confiabilidade.

- **Pontos fracos:** escalabilidade limitada, baixa tolerância a falhas, baixa elasticidade.

- Pode ser particionada **por domínio** ou **tecnicamente**.

- A adição, remoção ou substituição de funcionalidades é fácil graças aos plug-ins independentes.

</details>

<details><summary>Aula 10/11</summary>

Arquitetura de Microsserviços

- Diferente de outros estilos, microsserviços **não surgem de padrões repetidos**, mas são inspirados no **DDD**, especialmente em **contextos delimitados** e **domínios**.

- Cada serviço define apenas o que realmente precisa para operar.

### Distribuição

- Microsserviços rodam em máquinas/VMs separadas, otimizando uso de recursos.

- Como são distribuídos, sofrem com:
  
  - Latência maior (chamadas de rede),
  
  - Checagens de segurança repetidas,
  
  - Overhead geral.

### Contexto Delimitado

- Cada serviço modela um domínio específico ou fluxo de trabalho completo.

- É a forma mais extrema de arquitetura particionada por domínio.

### Granularidade

- Serviços não devem ser pequenos demais.

- Diretrizes:
  
  - **Finalidade:** o serviço deve ser funcionalmente coeso.
  
  - **Transações:** evitar transações corporativas entre serviços.
  
  - **Coreografia:** se vários serviços precisarem conversar demais, talvez devam ser agrupados.

- A granularidade raramente fica certa de primeira -> exige iteração.

### Isolamento de Dados

- Cada microsserviço possui seu **próprio banco de dados**.

- Escolha do banco pode variar por serviço (preço, tecnologia, desempenho).

- Evitar modelagens simplistas só para “lembrar” entidades.

- O isolamento é essencial para autonomia das equipes.

### Camada de API

- Pode expor operações úteis.

- **Não deve** servir como orquestrador ou mediador central.

### Reutilização Operacional

- Diferente da abordagem SOA, microsserviços separam lógica de domínio da lógica operacional.

- O padrão **sidecar** centraliza preocupações operacionais (log, monitoramento, segurança).

- Com isso, forma-se uma **malha de serviços** com controle unificado.

### Front-ends

- Interface originalmente fazia parte do contexto delimitado, mas isso é difícil na prática.

- Surgem dois padrões:
  
  - Front-end usando a **camada de API**,
  
  - Front-end como um serviço separado com granularidade própria.

### Comunicação

- Escolher entre **síncrona** e **assíncrona** é essencial para manter baixo acoplamento.

- Coreografia segue estilo orientado a eventos.

- Orquestração é centralizada, porém menos alinhada com a filosofia de microsserviços.

### Transações e Sagas

- Transações cruzando serviços quebram o desacoplamento.

- Sagas são o mecanismo recomendado para coordenar consistência.

### Características da Arquitetura

- **Pontos fortes:** alta escalabilidade, elasticidade, evolução contínua.

- **Pontos fracos:** performance menor devido a muitas chamadas de rede e verificações de segurança.
</details>
