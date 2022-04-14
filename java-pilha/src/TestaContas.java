public class TestaContas {
	
	public static void main(String[] args) {

	ContaTestaExcecaoChecked checked = new ContaTestaExcecaoChecked();
	try {
		checked.deposita();
	}catch(MinhaExcecao2 ex) {
		System.out.println("Tratamento ....");
	}
	
	}
	
}
