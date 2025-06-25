public class Main {
    public static void main(String[] args) {
        SistemaIFood sistema = SistemaIFood.getInstancia();
        Cliente cliente1 = new Cliente("João");
        PedidoFactory factory = new PedidoRestauranteFactory();
        Pedido pedido = sistema.criarPedido(factory, cliente1);
        pedido.setEstado(new EstadoAgendado());
        PagamentoStrategy pagamento = new PagamentoPix();
        pagamento.realizarPagamento(59.90);
        GerenciadorComandos gerenciador = new GerenciadorComandos();
        Comando entregar = new EntregarPedidoCommand(pedido);
        gerenciador.executarComando(entregar);
        Comando cancelar = new CancelarPedidoCommand(pedido);
        gerenciador.executarComando(cancelar);
        gerenciador.desfazerUltimo();
    }
}