public class EstadoCancelado implements PedidoState {
    public void agendar(Pedido p) {
        System.out.println("Pedido cancelado não pode ser agendado.");
    }
    public void entregar(Pedido p) {
        System.out.println("Pedido cancelado não pode ser entregue.");
    }
    public void cancelar(Pedido p) {
        System.out.println("Pedido já está cancelado.");
    }
}