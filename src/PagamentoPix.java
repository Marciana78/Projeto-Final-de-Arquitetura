public class PagamentoPix implements PagamentoStrategy {
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento via Pix: R$" + valor);
    }
}