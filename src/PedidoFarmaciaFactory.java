public class PedidoFarmaciaFactory implements PedidoFactory {
    public Pedido criarPedido() {
        return new PedidoFarmacia();
    }
}