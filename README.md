# Projeto Final de Arquitetura

### Autor

- **Marciana Cosa Pereira**

### Desenvolvimento do Projeto

Este projeto tem como objetivo a implementação de um sistema acadêmico inspirado no funcionamento do iFood, utilizando-se de conceitos sólidos de Arquitetura de Software e, principalmente, padrões de projeto. A proposta visa simular um sistema de pedidos que envolva diferentes tipos de estabelecimentos (restaurante, mercado e farmácia), com foco na flexibilidade, manutenção e escalabilidade da aplicação.
Durante o desenvolvimento, foram aplicados seis padrões de projeto que estruturam tanto a lógica de negócio quanto o comportamento interno do sistema. Abaixo, detalhamos a aplicação de cada padrão escolhido.

---

### 1. Singleton Pattern 🏢
O padrão Singleton foi utilizado na classe SistemaIFood, responsável por centralizar o gerenciamento do sistema. Essa classe garante que apenas uma instância do sistema esteja ativa durante a execução da aplicação, oferecendo um ponto único de acesso para a criação, consulta e gerenciamento dos pedidos.


### 2. Factory Method Pattern 🏭
A criação de pedidos específicos foi implementada por meio do padrão Factory Method. A superclasse PedidoFactory define a estrutura de criação, enquanto suas subclasses (PedidoRestauranteFactory, PedidoMercadoFactory e PedidoFarmaciaFactory) são responsáveis por instanciar objetos específicos conforme o tipo de estabelecimento.


### 3. State Pattern 🔄
O ciclo de vida de um pedido é gerenciado pelo padrão State, implementado através da interface PedidoState e suas classes concretas: EstadoAgendado, EstadoEntregue e EstadoCancelado.


### 4. Observer Pattern 👁️
A comunicação entre o pedido e o cliente foi modelada com o padrão Observer. A classe Pedido funciona como observável, enquanto Cliente é o observador. Toda vez que o estado do pedido muda, o cliente é notificado automaticamente.


### 5. Strategy Pattern 💳
Para a lógica de pagamento, foi utilizado o padrão Strategy, com a criação de uma interface PagamentoStrategy e suas implementações: PagamentoCartao, PagamentoPix e PagamentoDinheiro.


### 6. Command Pattern ⚡
As ações realizadas sobre o pedido (como entregar e cancelar) foram modeladas por meio do padrão Command. Cada operação é encapsulada em um objeto (por exemplo, EntregarPedidoCommand, CancelarPedidoCommand) e gerenciada por um GerenciadorComandos.


### Conclusão Parcial
Com a aplicação desses seis padrões, o sistema atinge um alto grau de organização, extensibilidade e reuso de código. Cada padrão resolve um problema específico dentro da arquitetura e contribui para a robustez e clareza do projeto. O resultado é uma aplicação modular, fácil de evoluir e de manter, com comportamentos bem definidos e estrutura adequada para simulações acadêmicas ou evoluções futuras.


## Fluxo de Funcionamento do Sistema


O sistema simula o processo completo de criação, processamento e finalização de um pedido dentro de uma plataforma inspirada no iFood. O fluxo abaixo detalha cada etapa envolvida, destacando como os padrões de projeto aplicados contribuem para o comportamento da aplicação.

1. **Inicialização do Sistema**
    O sistema é iniciado utilizando o padrão Singleton, por meio da classe SistemaIFood, que garante uma única instância responsável por gerenciar todos os pedidos.
    Essa instância centraliza as operações e fornece acesso às funcionalidades principais do sistema.

2. **Criação do Pedido**
   O cliente escolhe o tipo de estabelecimento (restaurante, mercado ou farmácia).
   O sistema aciona a Factory Method, selecionando a factory correspondente (PedidoRestauranteFactory, PedidoMercadoFactory ou PedidoFarmaciaFactory) para criar o objeto do tipo Pedido.
   O pedido é então vinculado ao cliente, que será seu observador (Observer).

3. **Definição do Pagamento**
   Antes da confirmação, o cliente seleciona o método de pagamento desejado (cartão, Pix ou dinheiro).
   O sistema utiliza o padrão Strategy para aplicar dinamicamente a estratégia de pagamento escolhida, mantendo a lógica de processamento desacoplada da lógica do pedido.

4. **Agendamento do Pedido**
  O pedido, ao ser confirmado, é agendado com data e hora, e seu estado interno muda de SemEstado para Agendado por meio do padrão State.
  Essa transição é controlada e válida apenas se o pedido ainda não tiver sido finalizado.

5. **Notificações ao Cliente**
  A cada mudança de estado (agendado, entregue, cancelado), o cliente é notificado automaticamente, graças ao uso do padrão Observer.
  Isso garante uma comunicação desacoplada e em tempo real entre o sistema e o usuário final.

6. **Execução de Ações sobre o Pedido**
 A entrega ou o cancelamento de um pedido são tratados como comandos encapsulados (por exemplo, EntregarPedidoCommand, CancelarPedidoCommand).
 O Command Pattern permite executar essas ações de forma controlada, além de registrar o histórico de comandos para eventual reversão.

7. **Finalização**
 O pedido termina em um dos estados finais: Entregue ou Cancelado.
Após a finalização, nenhuma nova transição de estado é permitida.
O sistema armazena o histórico de comandos executados, possibilitando análise posterior das operações realizadas.


