import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PedidoTest {

    @Test
    public void testTransicaoEstadoEntregue() {
        Pedido pedido = new PedidoRestaurante();
        pedido.setEstado(new EstadoAgendado());
        Cliente cliente = new Cliente("Maria");
        pedido.adicionarObservador(cliente);

        pedido.entregar();
        assertTrue(pedido.estado instanceof EstadoEntregue);
    }

    @Test
    public void testNaoPermiteCancelarDepoisEntregue() {
        Pedido pedido = new PedidoRestaurante();
        pedido.setEstado(new EstadoAgendado());
        pedido.entregar(); // Vai para entregue
        pedido.cancelar(); // Não deve permitir
        assertTrue(pedido.estado instanceof EstadoEntregue);
    }
}