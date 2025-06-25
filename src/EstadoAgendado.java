public class EstadoAgendado implements PedidoState {
    public void agendar(Pedido p) {
        System.out.println("Pedido já está agendado.");
    }
    public void entregar(Pedido p) {
        p.setEstado(new EstadoEntregue());
        p.notificar("Pedido entregue com sucesso.");
    }
    public void cancelar(Pedido p) {
        p.setEstado(new EstadoCancelado());
        p.notificar("Pedido foi cancelado.");
    }
}