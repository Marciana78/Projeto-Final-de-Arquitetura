public interface PedidoState {
    void agendar(Pedido pedido);
    void entregar(Pedido pedido);
    void cancelar(Pedido pedido);
}