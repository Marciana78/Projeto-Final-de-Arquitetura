public class Cliente implements Observador {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void atualizar(String mensagem) {
        System.out.println("Notificação para " + nome + ": " + mensagem);
    }
}