public class EntregarPedidoCommand implements Comando {
    private Pedido pedido;

    public EntregarPedidoCommand(Pedido pedido) {
        this.pedido = pedido;
    }

    public void executar() {
        pedido.entregar();
    }

    public void desfazer() {
        System.out.println("Desfazer entrega não implementado.");
    }
}