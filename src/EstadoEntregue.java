public class EstadoEntregue implements PedidoState {
    public void agendar(Pedido p) {
        System.out.println("Pedido já foi entregue, não pode agendar.");
    }
    public void entregar(Pedido p) {
        System.out.println("Pedido já está entregue.");
    }
    public void cancelar(Pedido p) {
        System.out.println("Pedido entregue não pode ser cancelado.");
    }
}