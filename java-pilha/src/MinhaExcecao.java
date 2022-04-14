
public class MinhaExcecao extends RuntimeException { // unchecked
	// unchecked nao precisa declarar na assinatura do metodo ou no try e catch
	public MinhaExcecao(String mensagem) {
		super(mensagem);
	}
}
