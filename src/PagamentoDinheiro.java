public class PagamentoDinheiro implements PagamentoStrategy {
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento em Dinheiro: R$" + valor);
    }
}