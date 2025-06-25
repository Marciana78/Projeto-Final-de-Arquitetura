import java.util.Stack;

public class GerenciadorComandos {
    private Stack<Comando> historico = new Stack<>();

    public void executarComando(Comando c) {
        c.executar();
        historico.push(c);
    }

    public void desfazerUltimo() {
        if (!historico.isEmpty()) {
            historico.pop().desfazer();
        }
    }
}