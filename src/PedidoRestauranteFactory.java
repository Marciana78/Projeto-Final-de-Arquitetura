public class PedidoRestauranteFactory implements PedidoFactory {
    public Pedido criarPedido() {
        return new PedidoRestaurante();
    }
}