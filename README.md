# Projeto Final de Arquitetura

- **Marciana Cosa Pereira**

### Desenvolvimento do Projeto

Este projeto tem como objetivo a implementação de um sistema acadêmico inspirado no funcionamento do iFood, utilizando-se de conceitos sólidos de Arquitetura de Software e, principalmente, padrões de projeto. A proposta visa simular um sistema de pedidos que envolva diferentes tipos de estabelecimentos (restaurante, mercado e farmácia), com foco na flexibilidade, manutenção e escalabilidade da aplicação.
Durante o desenvolvimento, foram aplicados seis padrões de projeto que estruturam tanto a lógica de negócio quanto o comportamento interno do sistema. Abaixo, detalhamos a aplicação de cada padrão escolhido.

---

### 1. Singleton Pattern 🏢
### 2. Factory Method Pattern 🏭
### 3. State Pattern 🔄
### 4. Observer Pattern 👁️
### 5. Strategy Pattern 💳
### 6. Command Pattern ⚡


## Fluxo de Funcionamento do Sistema

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


