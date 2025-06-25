public class CancelarPedidoCommand implements Comando {
    private Pedido pedido;

    public CancelarPedidoCommand(Pedido pedido) {
        this.pedido = pedido;
    }

    public void executar() {
        pedido.cancelar();
    }

    public void desfazer() {
        System.out.println("Desfazer cancelamento não implementado.");
    }
}