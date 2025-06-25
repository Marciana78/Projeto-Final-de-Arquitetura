public class PedidoMercadoFactory implements PedidoFactory {
    public Pedido criarPedido() {
        return new PedidoMercado();
    }
}