public class PagamentoCartao implements PagamentoStrategy {
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento via Cartão: R$" + valor);
    }
}