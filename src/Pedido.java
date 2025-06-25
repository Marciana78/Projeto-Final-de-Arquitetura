import java.util.ArrayList;
import java.util.List;

public abstract class Pedido {
    protected PedidoState estado;
    protected List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador obs) {
        observadores.add(obs);
    }

    public void notificar(String mensagem) {
        for (Observador o : observadores) {
            o.atualizar(mensagem);
        }
    }

    public void agendar() {
        estado.agendar(this);
    }

    public void entregar() {
        estado.entregar(this);
    }

    public void cancelar() {
        estado.cancelar(this);
    }

    public void setEstado(PedidoState novoEstado) {
        this.estado = novoEstado;
    }
}